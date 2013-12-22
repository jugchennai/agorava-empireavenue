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
import org.agorava.empireavenue.model.ProfileInfo;
import org.agorava.empireavenue.model.Status;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Before;
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
    OAuthLifeCycleService OAuthLifeCycleService;

    @Inject
    @EmpireAvenue
    @Current
    OAuthSession sessionTest;

    @Before
    public void init() {
        Token token = new Token("",
                "193bbfd4484a7fb154814a03e5dd1c8c3e24a1d539401d134ece20a3920bbf8fa959cda9b38bb37fb64e4b8e672");
        sessionTest.setAccessToken(token);
        OAuthLifeCycleService.endDance();
    }

    @Test
    public void authorizationUrlTest() {

        assertTrue(service.getAuthorizationUrl().startsWith("http"));
    }

    @Test
    public void sendAUpdateTest() {
        Status status = profileService.updateStatus("I am posting this from my program.");
        assertNotNull(status);
        System.out.println(status);
    }

    @Test
    public void getProfileInfoTest() {
        ProfileInfo profileInfo = profileService.getProfileInfo();
        assertNotNull(profileInfo);
        System.out.println(profileInfo);
    }
}
