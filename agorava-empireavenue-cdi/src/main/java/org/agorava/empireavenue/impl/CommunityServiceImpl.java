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

package org.agorava.empireavenue.impl;

import org.agorava.EmpireAvenueBaseService;
import org.agorava.empireavenue.EmpireAvenue;
import org.agorava.empireavenue.response.CommunityResponse;
import org.agorava.empireavenue.service.CommunityService;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Karthikeyan Annamalai  
 * @since 0.7.0
 * 
 */
@EmpireAvenue
public class CommunityServiceImpl extends EmpireAvenueBaseService implements CommunityService {
    @Override
    public CommunityResponse getCommunitiesInfo(int communityId) {
        Map<String, Object> data = new HashMap<>();
        data.put("community_id", communityId);
        return getService().post(buildAbsoluteUri(COMMUNITY_INFO), data, CommunityResponse.class);

    }

    @Override
    public CommunityResponse getCommunitiesInfo(String... communityId) {
        Map<String, Object> data = new HashMap<>();
        String communityIds = makeCommaSeperatedFromArray(communityId);
        data.put("community_id", communityIds);

        return getService().post(buildAbsoluteUri(COMMUNITY_INFO), data, CommunityResponse.class);
    }

    @Override
    public CommunityResponse getListOfPersonalCommunities() {
        return getService().get(buildAbsoluteUri(COMMUNITY__PERSONAL_LIST), CommunityResponse.class);
    }

    @Override
    public CommunityResponse getListOfPersonalCommunities(int pageLimit) {
        Map<String, Object> data = new HashMap<>();
        data.put("page", pageLimit);
        return getService().post(buildAbsoluteUri(COMMUNITY__PERSONAL_LIST), data, CommunityResponse.class);
    }

    @Override
    public CommunityResponse getLatestCommunities() {
        return getService().get(buildAbsoluteUri(COMMUNITY_RECENT_LIST), CommunityResponse.class);
    }
}
