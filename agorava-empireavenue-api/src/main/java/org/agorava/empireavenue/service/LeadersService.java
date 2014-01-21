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

import org.agorava.empireavenue.response.LeadersResponse;

/**
 * 
 * Operations on Leaders Board Information <br/>
 * 
 * 
 * 
 * <b>API Calls</b> <br/>
 * leaders/change<br/>
 * leaders/dividends<br/>
 * leaders/recent<br/>
 * leaders/shareprice<br/>
 * leaders/wealth<br/>
 * 
 * 
 * @author Karthikeyan Annamalai  
 * @since 0.7.0
 * 
 */
public interface LeadersService {

    static final String LEADERS_CHANGE = "leaders/change";
    static final String LEADERS_CHANGE_PEOPLE = "leaders/change/people";
    static final String LEADERS_CHANGE_BRANDS = "leaders/change/brands";

    static final String LEADERS_DIVIDENDS = "leaders/dividends";
    static final String LEADERS_DIVIDENDS_PEOPLE = "leaders/dividends/people";
    static final String LEADERS_DIVIDENDS_BRANDS = "leaders/dividends/brands";

    static final String LEADERS_RECENT = "leaders/recent";
    static final String LEADERS_RECENT_PEOPLE = "leaders/recent/people";
    static final String LEADERS_RECENT_BRANDS = "leaders/recent/brands";

    static final String LEADERS_SHAREPRICE = "leaders/shareprice";
    static final String LEADERS_SHAREPRICE_PEOPLE = "leaders/shareprice/people";
    static final String LEADERS_SHAREPRICE_BRANDS = "leaders/shareprice/brands";

    static final String LEADERS_WEALTH = "leaders/wealth";
    static final String LEADERS_WEALTH_PEOPLE = "leaders/wealth/people";
    static final String LEADERS_WEALTH_BRANDS = "leaders/recent/brands";

    /**
     * Returns all the leader boards by yesterday's change in share price value<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/leaders/change<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <b>Authentication</b>: Required
     * 
     * @return LeadersResponse Returns all the leaderboards by yesterday's change in share price value
     * 
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChangePeople()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChangeBrands()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChange(String)
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChangePeople(String)
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChangeBrands(String)
     * 
     */
    LeadersResponse getAllLeadersChange();

    /**
     * Returns People leaderboards by yesterday's change in share price value<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/leaders/change/people<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <b>Authentication</b>: Required
     * 
     * @return LeadersResponse Returns people leaderboards by yesterday's change in share price value
     * 
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChange()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChangeBrands()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChange(String)
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChangePeople(String)
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChangeBrands(String)
     * 
     */
    LeadersResponse getAllLeadersChangePeople();

    /**
     * Returns brands leaderboards by yesterday's change in share price value<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/leaders/change/brands<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <b>Authentication</b>: Required
     * 
     * @return LeadersResponse Returns brands leaderboards by yesterday's change in share price value
     * 
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChange()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChangePeople()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChange(String)
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChangePeople(String)
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChangeBrands(String)
     * 
     */

    LeadersResponse getAllLeadersChangeBrands();

    /**
     * Returns all the leaderboards by yesterday's change in share price value<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/leaders/change<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <b>Authentication</b>: Required
     * 
     * 
     * @param order - in which the result should be returned [ either "desc" (default) or "asc ]
     * @return LeadersResponse Returns all the leaderboards by yesterday's change in share price value
     * 
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChange()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChangePeople()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChangeBrands()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChangePeople(String)
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChangeBrands(String)
     * 
     */

    LeadersResponse getAllLeadersChange(String order);

    /**
     * Returns People leaderboards by yesterday's change in share price value<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/leaders/change/people<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <b>Authentication</b>: Required
     * 
     * @param order - in which the result should be returned [ either "desc" (default) or "asc ]
     * @return LeadersResponse Returns people leaderboards by yesterday's change in share price value
     * 
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChange()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChangePeople()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChangeBrands()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChange(String)
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChangeBrands(String)
     * 
     */

    LeadersResponse getAllLeadersChangePeople(String order);

    /**
     * Returns brands leaderboards by yesterday's change in share price value<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/leaders/change/brands<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <b>Authentication</b>: Required
     * 
     * @param order - in which the result should be returned [ either "desc" (default) or "asc ]
     * @return LeadersResponse Returns brands leaderboards by yesterday's change in share price value
     * 
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChange()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChangePeople()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChangeBrands()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChange(String)
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersChangePeople(String)
     * 
     */
    LeadersResponse getAllLeadersChangeBrands(String order);

    /**
     * Returns the leaderboards by Weekly Dividends Paid out to Shareholders<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/leaders/dividends<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <b>Authentication</b>: Required
     * 
     * @return LeadersResponse Returns the leaderboards by Weekly Dividends Paid out to Shareholders
     * 
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersDividendsPeople()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersDividendsBrands()
     * 
     */
    LeadersResponse getAllLeadersDividends();

    /**
     * Returns the people leaderboards by Weekly Dividends Paid out to Shareholders<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/leaders/dividends/people<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <b>Authentication</b>: Required
     * 
     * @return Returnsthe people leaderboards by Weekly Dividends Paid out to Shareholders
     * 
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersDividends()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersDividendsBrands()
     * 
     */

    LeadersResponse getAllLeadersDividendsPeople();

    /**
     * Returns the brands leaderboards by Weekly Dividends Paid out to Shareholders<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/leaders/dividends/brands<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <b>Authentication</b>: Required
     * 
     * @return LeadersResponse Returns the brands leaderboards by Weekly Dividends Paid out to Shareholders
     * 
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersDividends()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersDividendsPeople()
     * 
     */

    LeadersResponse getAllLeadersDividendsBrands();

    /**
     * Returns the leaderboards by recent signups<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/leaders/dividends/recent<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <b>Authentication</b>: Required
     * 
     * @return LeadersResponse Returns the leaderboards by recent signups
     * 
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersRecentPeople()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersRecentBrands()
     * 
     */

    LeadersResponse getAllLeadersRecent();

    /**
     * Returns the people leaderboards by recent signups<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/leaders/dividends/recent/people<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <b>Authentication</b>: Required
     * 
     * @return LeadersResponse Returns the people leaderboards by recent signups
     * 
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersRecent()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersRecentBrands()
     * 
     */

    LeadersResponse getAllLeadersRecentPeople();

    /**
     * Returns the brands leaderboards by recent signups<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/leaders/dividends/recent/brands<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <b>Authentication</b>: Required
     * 
     * @return LeadersResponse Returns the brands leaderboards by recent signups
     * 
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersRecent()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersRecentPeople()
     * 
     */

    LeadersResponse getAllLeadersRecentBrands();

    /**
     * Returns the leaderboards by share price<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/leaders/dividends/leaders/shareprice<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <b>Authentication</b>: Required
     * 
     * @return LeadersResponse Returns the leaderboards by share price
     * 
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersSharepricePeople()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersSharepriceBrands()
     * 
     */

    LeadersResponse getAllLeadersShareprice();

    /**
     * Returns the people leaderboards by share price<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/leaders/dividends/leaders/shareprice/people<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <b>Authentication</b>: Required
     * 
     * @return LeadersResponse Returns the people leaderboards by share price
     * 
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersShareprice()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersSharepriceBrands()
     * 
     */
    LeadersResponse getAllLeadersSharepricePeople();

    /**
     * Returns the brands leaderboards by share price<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/leaders/dividends/leaders/shareprice/brands<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <b>Authentication</b>: Required
     * 
     * @return LeadersResponse Returns the brands leaderboards by share price
     * 
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersShareprice()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersSharepricePeople()
     * 
     */

    LeadersResponse getAllLeadersSharepriceBrands();

    /**
     * Returns the leaderboards by wealth<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/leaders/dividends/leaders/wealth<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <b>Authentication</b>: Required
     * 
     * @return LeadersResponse Returns the leaderboards by wealth
     * 
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersWealthPeople()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersWealthBrands()
     * 
     */
    LeadersResponse getAllLeadersWealth();

    /**
     * Returns the people leaderboards by wealth<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/leaders/dividends/leaders/wealth/people<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <b>Authentication</b>: Required
     * 
     * @return LeadersResponse Returns the people leaderboards by wealth
     * 
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersWealth()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersWealthBrands()
     * 
     */

    LeadersResponse getAllLeadersWealthPeople();

    /**
     * Returns the brands leaderboards by wealth<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/leaders/dividends/leaders/wealth/brands<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <b>Authentication</b>: Required
     * 
     * @return LeadersResponse Returns the brands leaderboards by wealth
     * 
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersWealth()
     * @see org.agorava.empireavenue.service.LeadersService#getAllLeadersWealthPeople()
     * 
     */

    LeadersResponse getAllLeadersWealthBrands();

}
