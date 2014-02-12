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

package org.agorava.empireavenue.service;

import org.agorava.empireavenue.response.CommunityResponse;

/**
 * Operations on Portfolio   /Portfolio
 * <p/>
 * <p/>
 * EmpireAvenue Info:<br/>
 * URI: https://api.empireavenue.com/ <br/>
 * Rate Limit: User <br/>
 * Authentication: Required<br/><br/>
 * <p/>
 * API Calls<br/>
 * community/info<br/>
 * community/personal/list<br/>
 * community/recent/list<br/>
 *
 * @author Karthikeyan Annamalai
 * @since 0.7.0
 */
public interface CommunityService {


    static final String COMMUNITY_INFO = "community/info";
    static final String COMMUNITY__PERSONAL_LIST = "community/personal/list";
    static final String COMMUNITY_RECENT_LIST = "community/recent/list";


    /**
     * Returns Information about a community<br/>
     * <br/>
     * <p/>
     * EmpireAvenue : https://api.empireavenue.com/community/info<br/>
     * <br/>
     * <p/>
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @param communityId The unique community id
     * @return CommunityResponse Returns community Information for given Community id .
     * @see org.agorava.empireavenue.service.CommunityService#getCommunitiesInfo(java.lang.String...)
     */


    CommunityResponse getCommunitiesInfo(int communityId);

    /**
     * Returns Information about a community<br/>
     * <br/>
     * <p/>
     * EmpireAvenue : https://api.empireavenue.com/community/info<br/>
     * <br/>
     * <p/>
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @param communityId comma delimited string of integer community ids
     * @return CommunityResponse Returns community Information for given list of Community id .
     * @see org.agorava.empireavenue.service.CommunityService#getCommunitiesInfo(int)
     */
    CommunityResponse getCommunitiesInfo(String... communityId);


    /**
     * Returns a full list of Personal Communities<br/>
     * <br/>
     * <p/>
     * EmpireAvenue : https://api.empireavenue.com/community/info<br/>
     * <br/>
     * <p/>
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @return CommunityResponse Returns a full list of Personal Communities
     * @see org.agorava.empireavenue.service.CommunityService#getListOfPersonalCommunities(int)
     */
    CommunityResponse getListOfPersonalCommunities();


    /**
     * Returns a full list of Personal Communities<br/>
     * <br/>
     * <p/>
     * EmpireAvenue : https://api.empireavenue.com/community/info<br/>
     * <br/>
     * <p/>
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @param pageLimit Specific page number of results (e.g. page=2  will return page 2 of the result set)
     * @return CommunityResponse Returns a full list of Personal Communities with the
     * @see org.agorava.empireavenue.service.CommunityService#getListOfPersonalCommunities()
     */
    CommunityResponse getListOfPersonalCommunities(int pageLimit);


    /**
     * Returns the latest communities that were created<br/>
     * <br/>
     * <p/>
     * EmpireAvenue : https://api.empireavenue.com/community/info<br/>
     * <br/>
     * <p/>
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @return CommunityResponse Returns the last 50 communities that were created
     */
    CommunityResponse getLatestCommunities();


}
