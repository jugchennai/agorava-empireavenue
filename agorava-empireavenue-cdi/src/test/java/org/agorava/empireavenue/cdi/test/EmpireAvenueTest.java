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

import org.agorava.EmpireAvenue;
import org.agorava.core.api.oauth.OAuthService;
import org.agorava.core.api.oauth.OAuthToken;
import org.agorava.core.oauth.scribe.OAuthTokenScribe;
import org.agorava.empireavenue.ProfileService;
import org.agorava.empireavenue.model.ProfileInfo;
import org.agorava.empireavenue.model.Status;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;
import java.io.FileNotFoundException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
@RunWith(Arquillian.class)
public class EmpireAvenueTest {


    @Inject
    ProfileService profileService;
    @Inject
    @EmpireAvenue
    OAuthService service;

    @Deployment
    public static Archive<?> createTestArchive() throws FileNotFoundException {

        WebArchive ret = ShrinkWrap
                .create(WebArchive.class, "test.war")
                .addPackages(true, "org.agorava")
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addClass(EmpireAvenueServiceProducer.class);

        return ret;
    }

    @Before
    public void init() {
        OAuthToken token = new OAuthTokenScribe("",
                "193bbfd4484a7fb154814a03e5dd1c8c3e24a1d539401d134ece20a3920bbf8fa959cda9b38bb37fb64e4b8e672");
        service.getSession().setAccessToken(token);
        service.initAccessToken();
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