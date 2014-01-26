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
import org.agorava.empireavenue.model.Leaders;
import org.agorava.empireavenue.response.LeadersResponse;
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
public class LeadersTest extends EmpireAvenueTestDeploy {

    @Test
    public void authorizationUrlTest() {
        assertTrue(service.getAuthorizationUrl().startsWith("https"));
    }

    @Test
    public void getAllLeadersChangeTest() {
        LeadersResponse changeLeaders = leadersService.getAllLeadersChange();
        assertNotNull(changeLeaders);
        assertNotNull(changeLeaders.getAllLeaders());
        assertTrue(changeLeaders.getAllLeaders().size() > 0);
        for (Leaders leader : changeLeaders.getAllLeaders())
            System.out.println(leader.toString());
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllLeadersChangePeopleTest() {
        LeadersResponse peopleChangeLeaders = leadersService.getAllLeadersChangePeople();
        assertNotNull(peopleChangeLeaders);
        assertNotNull(peopleChangeLeaders.getAllLeaders());
        assertTrue(peopleChangeLeaders.getAllLeaders().size() > 0);

    }

    @Test
    public void getAllLeadersChangeBrandsTest() {
        LeadersResponse brandsChangeLeaders = leadersService.getAllLeadersChangeBrands();
        assertNotNull(brandsChangeLeaders);
        assertNotNull(brandsChangeLeaders.getAllLeaders());
        assertTrue(brandsChangeLeaders.getAllLeaders().size() > 0);
    }

    @Test
    public void getAllLeadersChangeOrderedTest() {
        LeadersResponse changeLeaders = leadersService.getAllLeadersChange("desc");
        assertNotNull(changeLeaders);
        assertNotNull(changeLeaders.getAllLeaders());
        assertTrue(changeLeaders.getAllLeaders().size() > 0);

    }

    @Test
    public void getAllLeadersChangePeopleOrderedTest() {
        LeadersResponse peopleChangeLeaders = leadersService.getAllLeadersChangePeople("desc");
        assertNotNull(peopleChangeLeaders);
        assertNotNull(peopleChangeLeaders.getAllLeaders());
        assertTrue(peopleChangeLeaders.getAllLeaders().size() > 0);

    }

    @Test
    public void getAllLeadersChangeBrandsOrderedTest() {
        LeadersResponse brandsChangeLeaders = leadersService.getAllLeadersChangeBrands("desc");
        assertNotNull(brandsChangeLeaders);
        assertNotNull(brandsChangeLeaders.getAllLeaders());
        assertTrue(brandsChangeLeaders.getAllLeaders().size() > 0);

    }

    @Test
    public void getAllLeadersChangeOrderedTest2() {
        LeadersResponse changeLeaders = leadersService.getAllLeadersChange("asc");
        assertNotNull(changeLeaders);
        assertNotNull(changeLeaders.getLeaders());
        assertTrue(changeLeaders.getAllLeaders().size() > 0);

    }

    @Test
    public void getAllLeadersChangePeopleOrderedTest2() {
        LeadersResponse peopleChangeLeaders = leadersService.getAllLeadersChangePeople("asc");
        assertNotNull(peopleChangeLeaders);
        assertNotNull(peopleChangeLeaders.getAllLeaders());
        assertTrue(peopleChangeLeaders.getAllLeaders().size() > 0);

    }

    @Test
    public void getAllLeadersChangeBrandsOrderedTest2() {
        LeadersResponse brandsChangeLeaders = leadersService.getAllLeadersChangeBrands("asc");
        assertNotNull(brandsChangeLeaders);
        assertNotNull(brandsChangeLeaders.getAllLeaders());
        assertTrue(brandsChangeLeaders.getAllLeaders().size() > 0);

    }

    @Test
    public void getAllLeadersDividendsTest() {
        LeadersResponse dividendsLeaders = leadersService.getAllLeadersDividends();
        assertNotNull(dividendsLeaders);
        assertNotNull(dividendsLeaders.getAllLeaders());
        assertTrue(dividendsLeaders.getAllLeaders().size() > 0);

    }

    @Test
    public void getAllLeadersDividendsPeopleTest() {
        LeadersResponse peopleDividendsLeaders = leadersService.getAllLeadersDividendsPeople();
        assertNotNull(peopleDividendsLeaders);
        assertNotNull(peopleDividendsLeaders.getAllLeaders());
        assertTrue(peopleDividendsLeaders.getAllLeaders().size() > 0);

    }

    @Test
    public void getAllLeadersDividendsBrandsTest() {
        LeadersResponse brandsDividendsLeaders = leadersService.getAllLeadersDividendsBrands();
        assertNotNull(brandsDividendsLeaders);
        assertNotNull(brandsDividendsLeaders.getAllLeaders());
        assertTrue(brandsDividendsLeaders.getAllLeaders().size() > 0);

    }

    @Test
    public void getAllLeadersRecentTest() {
        LeadersResponse recentLeaders = leadersService.getAllLeadersRecent();
        assertNotNull(recentLeaders);
        assertNotNull(recentLeaders.getAllLeaders());
        assertTrue(recentLeaders.getAllLeaders().size() > 0);

    }

    @Test
    public void getAllLeadersRecentPeopleTest() {
        LeadersResponse peopleRecentLeaders = leadersService.getAllLeadersRecentPeople();
        assertNotNull(peopleRecentLeaders);
        assertNotNull(peopleRecentLeaders.getAllLeaders());
        assertTrue(peopleRecentLeaders.getAllLeaders().size() > 0);

    }

    @Test
    public void getAllLeadersRecentBrandsTest() {
        LeadersResponse brandsRecentLeaders = leadersService.getAllLeadersRecentBrands();
        assertNotNull(brandsRecentLeaders);
        assertNotNull(brandsRecentLeaders.getAllLeaders());
        assertTrue(brandsRecentLeaders.getAllLeaders().size() > 0);

    }

    @Test
    public void getAllLeadersSharepriceTest() {
        LeadersResponse sharepriceLeaders = leadersService.getAllLeadersShareprice();
        assertNotNull(sharepriceLeaders);
        assertNotNull(sharepriceLeaders.getAllLeaders());
        assertTrue(sharepriceLeaders.getAllLeaders().size() > 0);

    }

    @Test
    public void getAllLeadersSharepricePeopleTest() {
        LeadersResponse peopleSharepriceLeaders = leadersService.getAllLeadersSharepricePeople();
        assertNotNull(peopleSharepriceLeaders);
        assertNotNull(peopleSharepriceLeaders.getAllLeaders());
        assertTrue(peopleSharepriceLeaders.getAllLeaders().size() > 0);

    }

    @Test
    public void getAllLeadersSharepriceBrandsTest() {
        LeadersResponse brandsSharepriceLeaders = leadersService.getAllLeadersSharepriceBrands();
        assertNotNull(brandsSharepriceLeaders);
        assertNotNull(brandsSharepriceLeaders.getAllLeaders());
        assertTrue(brandsSharepriceLeaders.getAllLeaders().size() > 0);

    }

    @Test
    public void getAllLeadersWealthTest() {
        LeadersResponse wealthLeaders = leadersService.getAllLeadersWealth();
        assertNotNull(wealthLeaders);
        assertNotNull(wealthLeaders.getAllLeaders());
        assertTrue(wealthLeaders.getAllLeaders().size() > 0);

    }

    @Test
    public void getAllLeadersWealthPeopleTest() {
        LeadersResponse peopleWealthLeaders = leadersService.getAllLeadersWealthPeople();
        assertNotNull(peopleWealthLeaders);
        assertNotNull(peopleWealthLeaders.getAllLeaders());
        assertTrue(peopleWealthLeaders.getAllLeaders().size() > 0);

    }

    @Test
    public void getAllLeadersWealthBrandsTest() {
        LeadersResponse brandsWealthLeaders = leadersService.getAllLeadersWealthBrands();
        assertNotNull(brandsWealthLeaders);
        assertNotNull(brandsWealthLeaders.getAllLeaders());
        assertTrue(brandsWealthLeaders.getAllLeaders().size() > 0);

    }

}
