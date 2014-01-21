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
import org.agorava.empireavenue.model.Search;
import org.agorava.empireavenue.response.SearchResponse;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Karthikeyan Annamalai  
 * @since 0.7.0
 */
@RunWith(Arquillian.class)
public class SearchTest  extends EmpireAvenueTestDeploy {


    @Test
    public void authorizationUrlTest() {
        assertTrue(service.getAuthorizationUrl().startsWith("https"));
    }

    @Test
    public void getAllRecentUsers() {
        SearchResponse recentUsers = searchService.getRecentUsers();
        assertNotNull(recentUsers);
        assertNotNull(recentUsers.getAllRecentUsers());
        assertTrue(recentUsers.getAllRecentUsers().size() > 0);
        for (Search search : recentUsers.getAllRecentUsers()) {
            System.out.println(search.toString());
        }
        System.out.println("--------------------------------------");
    }
}
