/*
 * Copyright 2013 Agorava.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.agorava.empireavenue.cdi.test;

import org.agorava.empireavenue.EmpireAvenue;
import org.agorava.empireavenue.ProfileService;
import org.agorava.empireavenue.response.ProfileInfoResponse;
import org.agorava.empireavenue.response.StatusResponse;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import org.agorava.api.atinject.Current;
import org.agorava.api.oauth.OAuthService;
import org.agorava.api.oauth.OAuthSession;
import org.agorava.api.oauth.Token;
import org.agorava.api.service.OAuthLifeCycleService;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
@RunWith(Arquillian.class)
public class EmpireAvenueTest extends EmpireAvenueTestDeploy {

    @Inject
    @EmpireAvenue
    ProfileService profileService;

    @Inject
    @EmpireAvenue
    OAuthService service;

    @Inject
    OAuthLifeCycleService oAuthLifeCycleService;

    @Inject
    @EmpireAvenue
    @Current
    OAuthSession sessionTest;

    @Before
    public void init() {


        Token token = new Token("11c6b5e71b91e0e49840f388988c1cbed4bc851365f4d7d60a915668a1cc8bb", "");
        sessionTest.setAccessToken(token);
        oAuthLifeCycleService.endDance();
    }

    @Test
    public void authorizationUrlTest() {
        assertTrue(service.getAuthorizationUrl().startsWith("https"));
    }

    @Ignore
    @Test
    public void sendAUpdateTest() throws Exception {
        StatusResponse statusResponse = profileService.updateStatus("Posted using Agorava API for EA");
        assertNotNull(statusResponse);
        System.out.println(statusResponse.getMeta());
        System.out.println(statusResponse.getStatus().getStatus() + " = " + statusResponse.getStatus().getContentId());
    }

    @Test
    public void getProfileInfoTest() {
        ProfileInfoResponse profileInfoResponse = profileService.getProfileInfo();
        assertNotNull(profileInfoResponse);
        System.out.println(profileInfoResponse.getProfileInfo());
        System.out.println(profileInfoResponse.getMeta());

    }
}
