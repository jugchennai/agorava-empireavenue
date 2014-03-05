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
import org.agorava.empireavenue.response.SearchResponse;
import org.agorava.empireavenue.service.SearchService;

/**
 * @author Karthikeyan Annamalai
 * @since 0.7.0
 */

@EmpireAvenue
public class SearchServiceImpl extends EmpireAvenueBaseService implements SearchService {
    @Override
    public SearchResponse getRecentUsers() {
        return getService().get(buildAbsoluteUri(SEARCH_RECENT), SearchResponse.class);

    }
}
