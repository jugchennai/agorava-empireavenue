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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.agorava.empireavenue.cdi.test.EmpireAvenueTestDeploy;
import org.agorava.empireavenue.response.LeadersResponse;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author Karthikeyan Annamalai <writetokarthikeyan@outlook.com>
 */

@RunWith(Arquillian.class)

public class LeadersTest extends EmpireAvenueTestDeploy {
	
	 @Test
	    public void authorizationUrlTest() {
	        assertTrue(service.getAuthorizationUrl().startsWith("https"));
	    }
	 
	 @Test
	    public void getAllLeadersChangeTest() {
		 LeadersResponse ChangeLeaders = leadersService.getAllLeadersChange();
	        assertNotNull(ChangeLeaders);
	        assertNotNull(ChangeLeaders.getLeaders());
	        System.out.println("The Change Leaders are "+ ChangeLeaders.getLeaders().toString());
		 
	    }
	 

	 @Test
	    public void getAllLeadersChangePeopleTest() {
		 LeadersResponse PeopleChangeLeaders = leadersService.getAllLeadersChangePeople();
	        assertNotNull(PeopleChangeLeaders);
	        assertNotNull(PeopleChangeLeaders.getLeaders());
	        System.out.println("The people Change Leaders are "+ PeopleChangeLeaders.getLeaders().toString());
		 
	    }
	 
	 
	 
	 @Test
	    public void getAllLeadersChangeBrandsTest() {
		 LeadersResponse BrandsChangeLeaders = leadersService.getAllLeadersChangeBrands();
	        assertNotNull(BrandsChangeLeaders);
	        assertNotNull(BrandsChangeLeaders.getLeaders());
	        System.out.println("The brands Change Leaders are "+ BrandsChangeLeaders.getLeaders().toString());
		 
	    }
	 
	 
	 @Test
	    public void getAllLeadersChangeOrderedTest() {
		 LeadersResponse ChangeLeaders = leadersService.getAllLeadersChange("desc");
	        assertNotNull(ChangeLeaders);
	        assertNotNull(ChangeLeaders.getLeaders());
	        System.out.println("The Change Leaders are "+ ChangeLeaders.getLeaders().toString());
		 
	    }
	 

	 @Test
	    public void getAllLeadersChangePeopleOrderedTest() {
		 LeadersResponse PeopleChangeLeaders = leadersService.getAllLeadersChangePeople("desc");
	        assertNotNull(PeopleChangeLeaders);
	        assertNotNull(PeopleChangeLeaders.getLeaders());
	        System.out.println("The people Change Leaders are "+ PeopleChangeLeaders.getLeaders().toString());
		 
	    }
	 
	 
	 
	 @Test
	    public void getAllLeadersChangeBrandsOrderedTest() {
		 LeadersResponse BrandsChangeLeaders = leadersService.getAllLeadersChangeBrands("desc");
	        assertNotNull(BrandsChangeLeaders);
	        assertNotNull(BrandsChangeLeaders.getLeaders());
	        System.out.println("The brands Change Leaders are "+ BrandsChangeLeaders.getLeaders().toString());
		 
	    }
	 
	 
	 @Test
	    public void getAllLeadersChangeOrderedTest2() {
		 LeadersResponse ChangeLeaders = leadersService.getAllLeadersChange("asc");
	        assertNotNull(ChangeLeaders);
	        assertNotNull(ChangeLeaders.getLeaders());
	        System.out.println("The Change Leaders are "+ ChangeLeaders.getLeaders().toString());
		 
	    }
	 

	 @Test
	    public void getAllLeadersChangePeopleOrderedTest2() {
		 LeadersResponse PeopleChangeLeaders = leadersService.getAllLeadersChangePeople("asc");
	        assertNotNull(PeopleChangeLeaders);
	        assertNotNull(PeopleChangeLeaders.getLeaders());
	        System.out.println("The people Change Leaders are "+ PeopleChangeLeaders.getLeaders().toString());
		 
	    }
	 
	 
	 
	 @Test
	    public void getAllLeadersChangeBrandsOrderedTest2() {
		 LeadersResponse BrandsChangeLeaders = leadersService.getAllLeadersChangeBrands("asc");
	        assertNotNull(BrandsChangeLeaders);
	        assertNotNull(BrandsChangeLeaders.getLeaders());
	        System.out.println("The brands Change Leaders are "+ BrandsChangeLeaders.getLeaders().toString());
		 
	    }
	 
	 
	 
	 @Test
	    public void getAllLeadersDividendsTest() {
		 LeadersResponse DividendsLeaders = leadersService.getAllLeadersDividends();
	        assertNotNull(DividendsLeaders);
	        assertNotNull(DividendsLeaders.getLeaders());
	        System.out.println("The Dividends Leaders are "+ DividendsLeaders.getLeaders().toString());
		 
	    }
	 

	 @Test
	    public void getAllLeadersDividendsPeopleTest() {
		 LeadersResponse PeopleDividendsLeaders = leadersService.getAllLeadersDividendsPeople();
	        assertNotNull(PeopleDividendsLeaders);
	        assertNotNull(PeopleDividendsLeaders.getLeaders());
	        System.out.println("The people Dividends Leaders are "+ PeopleDividendsLeaders.getLeaders().toString());
		 
	    }
	 
	 
	 
	 @Test
	    public void getAllLeadersDividendsBrandsTest() {
		 LeadersResponse BrandsDividendsLeaders = leadersService.getAllLeadersDividendsBrands();
	        assertNotNull(BrandsDividendsLeaders);
	        assertNotNull(BrandsDividendsLeaders.getLeaders());
	        System.out.println("The brands Dividends Leaders are "+ BrandsDividendsLeaders.getLeaders().toString());
		 
	    }
	 
	 
	 @Test
	    public void getAllLeadersRecentTest() {
		 LeadersResponse RecentLeaders = leadersService.getAllLeadersRecent();
	        assertNotNull(RecentLeaders);
	        assertNotNull(RecentLeaders.getLeaders());
	        System.out.println("The Recent Leaders are "+ RecentLeaders.getLeaders().toString());
		 
	    }
	 

	 @Test
	    public void getAllLeadersRecentPeopleTest() {
		 LeadersResponse PeopleRecentLeaders = leadersService.getAllLeadersRecentPeople();
	        assertNotNull(PeopleRecentLeaders);
	        assertNotNull(PeopleRecentLeaders.getLeaders());
	        System.out.println("The people Recent Leaders are "+ PeopleRecentLeaders.getLeaders().toString());
		 
	    }
	 
	 
	 
	 @Test
	    public void getAllLeadersRecentBrandsTest() {
		 LeadersResponse BrandsRecentLeaders = leadersService.getAllLeadersRecentBrands();
	        assertNotNull(BrandsRecentLeaders);
	        assertNotNull(BrandsRecentLeaders.getLeaders());
	        System.out.println("The brands Recent Leaders are "+ BrandsRecentLeaders.getLeaders().toString());
		 
	    }
	 
	 
	 @Test
	    public void getAllLeadersSharepriceTest() {
		 LeadersResponse SharepriceLeaders = leadersService.getAllLeadersShareprice();
	        assertNotNull(SharepriceLeaders);
	        assertNotNull(SharepriceLeaders.getLeaders());
	        System.out.println("The Shareprice Leaders are "+ SharepriceLeaders.getLeaders().toString());
		 
	    }
	 

	 @Test
	    public void getAllLeadersSharepricePeopleTest() {
		 LeadersResponse PeopleSharepriceLeaders = leadersService.getAllLeadersSharepricePeople();
	        assertNotNull(PeopleSharepriceLeaders);
	        assertNotNull(PeopleSharepriceLeaders.getLeaders());
	        System.out.println("The people Shareprice Leaders are "+ PeopleSharepriceLeaders.getLeaders().toString());
		 
	    }
	 
	 
	 
	 @Test
	    public void getAllLeadersSharepriceBrandsTest() {
		 LeadersResponse BrandsSharepriceLeaders = leadersService.getAllLeadersSharepriceBrands();
	        assertNotNull(BrandsSharepriceLeaders);
	        assertNotNull(BrandsSharepriceLeaders.getLeaders());
	        System.out.println("The brands Shareprice Leaders are "+ BrandsSharepriceLeaders.getLeaders().toString());
		 
	    }
	 
	 
	 @Test
	    public void getAllLeadersWealthTest() {
		 LeadersResponse WealthLeaders = leadersService.getAllLeadersWealth();
	        assertNotNull(WealthLeaders);
	        assertNotNull(WealthLeaders.getLeaders());
	        System.out.println("The Wealth Leaders are "+ WealthLeaders.getLeaders().toString());
		 
	    }
	 

	 @Test
	    public void getAllLeadersWealthPeopleTest() {
		 LeadersResponse PeopleWealthLeaders = leadersService.getAllLeadersWealthPeople();
	        assertNotNull(PeopleWealthLeaders);
	        assertNotNull(PeopleWealthLeaders.getLeaders());
	        System.out.println("The people Wealth Leaders are "+ PeopleWealthLeaders.getLeaders().toString());
		 
	    }
	 
	 
	 
	 @Test
	    public void getAllLeadersWealthBrandsTest() {
		 LeadersResponse BrandsWealthLeaders = leadersService.getAllLeadersWealthBrands();
	        assertNotNull(BrandsWealthLeaders);
	        assertNotNull(BrandsWealthLeaders.getLeaders());
	        System.out.println("The brands Wealth Leaders are "+ BrandsWealthLeaders.getLeaders().toString());
		 
	    }
	 
    
}
