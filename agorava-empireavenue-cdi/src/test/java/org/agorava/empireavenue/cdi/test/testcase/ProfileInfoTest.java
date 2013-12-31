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
package org.agorava.empireavenue.cdi.test.testcase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.agorava.empireavenue.cdi.test.EmpireAvenueTestDeploy;
import org.agorava.empireavenue.response.BankBalanceResponse;
import org.agorava.empireavenue.response.CommunityResponse;
import org.agorava.empireavenue.response.CountResponse;
import org.agorava.empireavenue.response.ProfileInfoResponse;
import org.agorava.empireavenue.response.StatusResponse;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
@RunWith(Arquillian.class)
public class ProfileInfoTest extends EmpireAvenueTestDeploy {


    @Test
    public void authorizationUrlTest() {
        assertTrue(service.getAuthorizationUrl().startsWith("https"));
    }

    @Ignore
    @Test
    public void sendAUpdateTest() throws Exception {
    	String message = "Posted using Agorava API for EA";
        StatusResponse statusResponse = profileService.updateStatus(message);
        assertNotNull(statusResponse);
        assertEquals(message,statusResponse.getStatus().getStatus());
    }

    @Test
    public void getProfileInfoForTheCurrentUser() {
        ProfileInfoResponse profileInfoResponse = profileService.getProfileInfo();
        assertNotNull(profileInfoResponse);
        assertNotNull(profileInfoResponse.getProfileInfo());

    }
    
    
    @Test
    public void getAllCommunityForCurrentUser() {
        CommunityResponse communityResponse = profileService.getAllCommunities();
        assertNotNull(communityResponse);
        assertNotNull(communityResponse.getAllCommunity());
        assertTrue(communityResponse.getAllCommunity().size() > 0);
        
    }
    
    @Test
    public void getAllCommunityForMYSODOTCOM() {
        CommunityResponse communityResponse = profileService.getAllCommunitiesFor("MYSODOTCOM");
        assertNotNull(communityResponse);
        assertNotNull(communityResponse.getAllCommunity());
        assertTrue(communityResponse.getAllCommunity().size() > 0);
    }
    
    @Test
    public void getAllShareholders() {
    	ProfileInfoResponse profileInfoResponse = profileService.getAllShareholders();
    	assertNotNull(profileInfoResponse);
    	assertNotNull(profileInfoResponse.getProfileInfo());
    	assertTrue(profileInfoResponse.getAllProfileInfo().size() > 0);
    }
    
    @Test
    public void getCountForTheCurrentUser() {
        CountResponse countResponse = profileService.getCount();
        assertNotNull(countResponse);
        assertNotNull(countResponse.getCount());

    }
    
    @Test
    public void getBankBalanceOfCurrentUser() {
        BankBalanceResponse bankBalanceResponse = profileService.getBankBalance();
        assertNotNull(bankBalanceResponse);
        assertNotNull(bankBalanceResponse.getBankBalance());

    }
}
