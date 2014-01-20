/*
 * Copyright 2014 Agorava.
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

import org.agorava.empireavenue.cdi.test.EmpireAvenueTestDeploy;
import org.agorava.empireavenue.model.Community;
import org.agorava.empireavenue.response.CommunityResponse;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author Karthikeyan Annamalai <writetokarthikeyan@outlook.com>
 * @since 0.7.0
 *
 */
@RunWith(Arquillian.class)
public class CommunityTest extends EmpireAvenueTestDeploy {
    private String communities="123,253";

    private int pages=2;
    @Test
    public void authorizationUrlTest() {
        assertTrue(service.getAuthorizationUrl().startsWith("https"));
    }

    @Test
    public void communityInfoTest() {
        CommunityResponse communityServiceCommunitiesInfo = communityService.getCommunitiesInfo(20);
        assertNotNull(communityServiceCommunitiesInfo);
        assertNotNull(communityServiceCommunitiesInfo.getAllCommunity());
        assertTrue(communityServiceCommunitiesInfo.getAllCommunity().size() > 0);
        for (Community community : communityServiceCommunitiesInfo.getAllCommunity())
            System.out.println(community.toString());
        System.out.println("--------------------------------------");
    }

    @Test
    public void communitiesInfo() {
        CommunityResponse communityServiceCommunitiesInfo = communityService.getCommunitiesInfo(communities);
        assertNotNull(communityServiceCommunitiesInfo);
        assertNotNull(communityServiceCommunitiesInfo.getAllCommunity());
        assertTrue(communityServiceCommunitiesInfo.getAllCommunity().size() > 0);
        for (Community community : communityServiceCommunitiesInfo.getAllCommunity()) {
            System.out.println(community.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void listOfPersonalCommunitiesTest() {
        CommunityResponse listOfPersonalCommunities = communityService.getListOfPersonalCommunities();
        assertNotNull(listOfPersonalCommunities);
        assertNotNull(listOfPersonalCommunities.getAllCommunity());
        assertTrue(listOfPersonalCommunities.getAllCommunity().size() > 0);
        for (Community community : listOfPersonalCommunities.getAllCommunity()) {
            System.out.println(community.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void listOfPersonalCommunitiesWithPageLimitTest() {
        CommunityResponse listOfPersonalCommunities = communityService.getListOfPersonalCommunities(pages);
        assertNotNull(listOfPersonalCommunities);
        assertNotNull(listOfPersonalCommunities.getAllCommunity());
        assertTrue(listOfPersonalCommunities.getAllCommunity().size() > 0);
        for (Community community : listOfPersonalCommunities.getAllCommunity()) {
            System.out.println(community.toString());
        }
        System.out.println("--------------------------------------");
    }
}
