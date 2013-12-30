/*
 * Copyright 2013 Agorava.
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
import org.agorava.empireavenue.service.ProfileService;
import org.agorava.empireavenue.response.BankBalanceResponse;
import org.agorava.empireavenue.response.CountResponse;
import org.agorava.empireavenue.response.ProfileInfoResponse;
import org.agorava.empireavenue.response.StatusResponse;
import org.agorava.spi.UserProfile;

import java.util.HashMap;
import java.util.Map;

import org.agorava.empireavenue.response.CommunityResponse;

/**
 * 
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 * @since 0.7.0
 */
@EmpireAvenue
public class ProfileServiceImpl extends EmpireAvenueBaseService implements ProfileService {

    /**
     * 
     * @see org.agorava.empireavenue.ProfileService#updateStatus(java.lang.String)
     */
    @Override
    public StatusResponse updateStatus(String statusMessage) {

        Map<String, Object> data = new HashMap<>();
        data.put("status", statusMessage);

        return getService().post(buildAbsoluteUri(SET_STATUS), data, StatusResponse.class);
    }

    /**
     * 
     * @see org.agorava.empireavenue.ProfileService#getProfileInfo()
     */
    @Override
    public ProfileInfoResponse getProfileInfo() {
        return getService().get(buildAbsoluteUri(PROFILE_INFO), ProfileInfoResponse.class);
    }

    /**
     * 
     * @return
     */
    @Override
    public UserProfile getUserProfile() {
        // return getProfileInfo();
        return null;
    }

    /**
     * 
     * @see org.agorava.empireavenue.ProfileService#getAllCommunities()
     */
    @Override
    public CommunityResponse getAllCommunities() {
        return getService().get(buildAbsoluteUri(PROFILE_COMMUNITIES), CommunityResponse.class);
    }

    /**
     * 
     * @see org.agorava.empireavenue.ProfileService#getAllCommunitiesFor(String)
     */
    @Override
    public CommunityResponse getAllCommunitiesFor(String ticker) {

        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        return getService().post(buildAbsoluteUri(PROFILE_COMMUNITIES), data, CommunityResponse.class);
    }

    /**
     * 
     * @see org.agorava.empireavenue.ProfileService#getProfileInfo(String)
     */
    @Override
    public ProfileInfoResponse getProfileInfo(String ticker) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        return getService().post(buildAbsoluteUri(PROFILE_INFO), data, ProfileInfoResponse.class);
    }

    /**
     * 
     * @see org.agorava.empireavenue.ProfileService#getProfileInfo(String...)
     */
    @Override
    public ProfileInfoResponse getProfileInfo(String... tickers) {
        Map<String, Object> data = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (String ticker : tickers) {
            result.append(ticker);
            result.append(",");
        }
        String ticker = result.length() > 0 ? result.substring(0, result.length() - 1) : "";

        data.put("ticker", ticker);
        return getService().post(buildAbsoluteUri(PROFILE_INFO), data, ProfileInfoResponse.class);
    }

    /**
     * @see org.agorava.empireavenue.ProfileService#getAllShareholders()
     */
    @Override
    public ProfileInfoResponse getAllShareholders() {
        return getService().get(buildAbsoluteUri(PROFILE_SHAREHOLDERS), ProfileInfoResponse.class);
    }

    /**
     * TODO: Need a GET method with parameter
     * 
     * @see org.agorava.empireavenue.ProfileService#getAllShareholders(int,int)
     */
    @Override
    public ProfileInfoResponse getAllShareholders(int page, int maxresults) {
        Map<String, Object> data = new HashMap<>();
        data.put("page", page);
        data.put("maxresults", maxresults);
        return getService().post(buildAbsoluteUri(PROFILE_SHAREHOLDERS), data, ProfileInfoResponse.class);
    }

    /**
     * @see org.agorava.empireavenue.ProfileService#getAllShareholders(String,int,int)
     */
    @Override
    public ProfileInfoResponse getAllShareholders(String ticker, int page,
            int maxresults) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        data.put("page", page);
        data.put("maxresults", maxresults);
        return getService().post(buildAbsoluteUri(PROFILE_SHAREHOLDERS), data, ProfileInfoResponse.class);
    }

    /**
     * 
     * @see org.agorava.empireavenue.ProfileService#getCount()
     */
    @Override
    public CountResponse getCount() {
        return getService().get(buildAbsoluteUri(PROFILE_COUNT), CountResponse.class);
    }

    /**
     * 
     * @see org.agorava.empireavenue.ProfileService#getCountFor(String)
     */
    @Override
    public CountResponse getCountFor(String ticker) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        return getService().post(buildAbsoluteUri(PROFILE_COUNT), data, CountResponse.class);
    }

    /**
     * 
     * @see org.agorava.empireavenue.ProfileService#getCountFor(String[])
     */
    @Override
    public CountResponse getCountFor(String... tickers) {
        Map<String, Object> data = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (String ticker : tickers) {
            result.append(ticker);
            result.append(",");
        }
        String ticker = result.length() > 0 ? result.substring(0, result.length() - 1) : "";

        data.put("ticker", ticker);
        return getService().post(buildAbsoluteUri(PROFILE_COUNT), data, CountResponse.class);
    }

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public BankBalanceResponse getBankBalance() {
        return getService().get(buildAbsoluteUri(PROFILE_BANK_BALANCE), BankBalanceResponse.class);
    }

}
