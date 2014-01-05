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

import java.util.HashMap;
import java.util.Map;
import org.agorava.EmpireAvenueBaseService;
import org.agorava.empireavenue.EmpireAvenue;
import org.agorava.empireavenue.response.LeadersResponse;
import org.agorava.empireavenue.response.ProfileInfoResponse;
import org.agorava.empireavenue.service.LeadersService;
import static org.agorava.empireavenue.service.LeadersService.LEADERS_CHANGE;
import static org.agorava.empireavenue.service.LeadersService.LEADERS_CHANGE_BRANDS;
import static org.agorava.empireavenue.service.ProfileService.PROFILE_INFO;

/**
 *
 * @author Karthikeyan Annamalai <writetokarthikeyan@outlook.com>
 */
@EmpireAvenue
public class LeadersServiceImpl extends EmpireAvenueBaseService implements LeadersService{

    @Override
    public LeadersResponse getAllLeadersChange() {
        return getService().get(buildAbsoluteUri(LEADERS_CHANGE), LeadersResponse.class);
    }

    @Override
    public LeadersResponse getAllLeadersChangePeople() {
        return getService().get(buildAbsoluteUri(LEADERS_CHANGE_PEOPLE), LeadersResponse.class);
    }

    @Override
    public LeadersResponse getAllLeadersChangeBrands() {
        return getService().get(buildAbsoluteUri(LEADERS_CHANGE_BRANDS), LeadersResponse.class);
    }

    @Override
    public LeadersResponse getAllLeadersChange(String order) {
         Map<String, Object> data = new HashMap<>();
        data.put("order", order);
        return getService().post(buildAbsoluteUri(LEADERS_CHANGE), data, LeadersResponse.class);
    }

    @Override
    public LeadersResponse getAllLeadersChangePeople(String order) {
Map<String, Object> data = new HashMap<>();
        data.put("order", order);
        return getService().post(buildAbsoluteUri(LEADERS_CHANGE_PEOPLE), data, LeadersResponse.class);
    }

    @Override
    public LeadersResponse getAllLeadersChangeBrands(String order) {
        Map<String, Object> data = new HashMap<>();
        data.put("order", order);
        return getService().post(buildAbsoluteUri(LEADERS_CHANGE_BRANDS), data, LeadersResponse.class);
    }

    @Override
    public LeadersResponse getAllLeadersDividends() {
        return getService().get(buildAbsoluteUri(LEADERS_DIVIDENDS), LeadersResponse.class);
    }

    @Override
    public LeadersResponse getAllLeadersDividendsPeople() {
return getService().get(buildAbsoluteUri(LEADERS_DIVIDENDS_PEOPLE), LeadersResponse.class);    }

    @Override
    public LeadersResponse getAllLeadersDividendsBrands() {
return getService().get(buildAbsoluteUri(LEADERS_DIVIDENDS_BRANDS), LeadersResponse.class);    }

    @Override
    public LeadersResponse getAllLeadersRecent() {
return getService().get(buildAbsoluteUri(LEADERS_RECENT), LeadersResponse.class);    }

    @Override
    public LeadersResponse getAllLeadersRecentPeople() {
return getService().get(buildAbsoluteUri(LEADERS_RECENT_PEOPLE), LeadersResponse.class);    }

    @Override
    public LeadersResponse getAllLeadersRecentBrands() {
return getService().get(buildAbsoluteUri(LEADERS_RECENT_BRANDS), LeadersResponse.class);    }

    @Override
    public LeadersResponse getAllLeadersShareprice() {
return getService().get(buildAbsoluteUri(LEADERS_SHAREPRICE), LeadersResponse.class);    }

    @Override
    public LeadersResponse getAllLeadersSharepricePeople() {
return getService().get(buildAbsoluteUri(LEADERS_SHAREPRICE_PEOPLE), LeadersResponse.class);    }

    @Override
    public LeadersResponse getAllLeadersSharepriceBrands() {
return getService().get(buildAbsoluteUri(LEADERS_SHAREPRICE_BRANDS), LeadersResponse.class);    }

    @Override
    public LeadersResponse getAllLeadersWealth() {
return getService().get(buildAbsoluteUri(LEADERS_WEALTH), LeadersResponse.class);    }

    @Override
    public LeadersResponse getAllLeadersWealthPeople() {
return getService().get(buildAbsoluteUri(LEADERS_WEALTH_PEOPLE), LeadersResponse.class);    }

    @Override
    public LeadersResponse getAllLeadersWealthBrands() {
return getService().get(buildAbsoluteUri(LEADERS_WEALTH_BRANDS), LeadersResponse.class);
    }
    
    
    
}
