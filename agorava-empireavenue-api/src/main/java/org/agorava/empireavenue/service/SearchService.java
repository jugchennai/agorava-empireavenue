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

import org.agorava.empireavenue.response.SearchResponse;
import org.agorava.empireavenue.response.SharesResponse;

/**
 * Operations on Search   /Search
 *
 * EmpireAvenue Info:<br/>
 * URI: https://api.empireavenue.com/ <br/>
 * Rate Limit: User <br/>
 * Authentication: Required<br/>
 * Limit: 100 results <br/>
 *
 * API Calls<br/>
 * search/recent<br/>
 *
 * @author Karthikeyan Annamalai  
 * @since 0.7.0
 *
 **/



public interface SearchService {
    static final String SEARCH_RECENT = "search/recent";



    /**
     * Returns the 100 most recent users in Empire Avenue.<br/>
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/search/recent<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @return SearchResponse Returns the 100 most recent users in Empire Avenue.
     *
     *
     */

    SearchResponse getRecentUsers();


}
