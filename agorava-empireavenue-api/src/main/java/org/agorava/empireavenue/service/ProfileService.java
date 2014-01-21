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

import org.agorava.empireavenue.response.BankBalanceResponse;
import org.agorava.empireavenue.response.CommunityResponse;
import org.agorava.empireavenue.response.CountResponse;
import org.agorava.empireavenue.response.StatusResponse;
import org.agorava.empireavenue.response.ProfileInfoResponse;
import org.agorava.spi.UserProfileService;

/**
 * Operations on Profile Information /profile
 *
 *
 * EmpireAvenue Info:<br/>
 * URI: https://api.empireavenue.com/profile/bank/balance <br/>
 * Rate Limit: User <br/>
 * Authentication: Required<br/><br/>
 *
 * API Calls<br/>
 * profile/bank/balance<br/>
 * profile/counts<br/>
 * profile/info<br/>
 * profile/brands<br/>
 * profile/shareholders<br/>
 * profile/communities<br/>
 * profile/rankings<br/>
 * profile/notifications<br/>
 *
 *
 * @author Rajmahendra Hegde  
 * @since 0.7.0
 */
public interface ProfileService extends UserProfileService {

    static final String SET_STATUS = "profile/set/status";
    static final String PROFILE_INFO = "profile/info";
    static final String PROFILE_COMMUNITIES = "/profile/communities";
    static final String PROFILE_SHAREHOLDERS = "/profile/shareholders";
    static final String PROFILE_COUNT="/profile/counts";
    static final String PROFILE_BANK_BALANCE = "/profile/bank/balance";

    /**
     * Set statusMessage to the authenticated user's status<br/><br/>
     *
     * EmpireAvenue :
     * https://apidocs.empireavenue.com/v1/post?call=profile/set/status<br/><br/>
     *
     * This message is maximum 140 characters long and UTF-8 safe.
     *
     * @param statusMessage the message to be updated
     * @return ID of the updated status entry.
     */
    StatusResponse updateStatus(String statusMessage);

    /**
     * Returns the base information of the current logged-in user<br/><br/>
     *
     * EmpireAvenue :
     * https://apidocs.empireavenue.com/v1/get?call=profile/info<br/><br/>
     *
     * <b>Limit</b>: Maximum of 100 user profiles fetched in any one call
     *
     * @return ProfileInfo Profile information of the user
     * 
     * @see org.agorava.empireavenue.service.ProfileService#getProfileInfo(String)
     * @see org.agorava.empireavenue.service.ProfileService#getProfileInfo(String[])
     * 
     */
    ProfileInfoResponse getProfileInfo();
    /**
     * Returns the base information of the given ticker<br/><br/>
     *
     * EmpireAvenue :
     * https://apidocs.empireavenue.com/v1/get?call=profile/info<br/><br/>
     *
     * <b>Limit</b>: Maximum of 100 user profiles fetched in any one call
     *
     * @param ticker
     * @return 
     * 
     * @see org.agorava.empireavenue.service.ProfileService#getProfileInfo()
     * @see org.agorava.empireavenue.service.ProfileService#getProfileInfo(String[])
     * 
     */
     ProfileInfoResponse getProfileInfo(String ticker);
     
    /**
     * Returns the base information of all the given ticker<br/><br/>
     *
     * EmpireAvenue :
     * https://apidocs.empireavenue.com/v1/get?call=profile/info<br/><br/>
     *
     * <b>Limit</b>: Maximum of 100 user profiles fetched in any one call
     *
      * @param tickers
      * @return 
      * 
      *  @see org.agorava.empireavenue.service.ProfileService#getProfileInfo()
     * @see org.agorava.empireavenue.service.ProfileService#getProfileInfo(String)
      */
      ProfileInfoResponse getProfileInfo(String... tickers);

    /**
     * Lists all the Communities the current user belongs to.<br/><br/>
     *
     * @return CommunityResponse Array of all Community the current user belongs to.
     * 
     * @see org.agorava.empireavenue.service.ProfileService#getAllCommunities(String)
     * 
     */
    CommunityResponse getAllCommunities();

    /**
     * Lists all the Communities the the given ticker belongs<br/><br/>
     *
     * @param ticker EA Ticker
     * @return CommunityResponse Array of all Community the the given ticker belongs
     * 
     * @see org.agorava.empireavenue.service.ProfileService#getAllCommunities()
     * 
     */
    CommunityResponse getAllCommunitiesFor(String ticker);
    
    /**
     * 
     * @return ProfileInfoResponse containing Shareholders info as ProfileInfo
     * 
     * @see org.agorava.empireavenue.service.ProfileService#getAllShareholders(int,int)
     * @see org.agorava.empireavenue.service.ProfileService#getAllShareholders(String,int,int)
     * 
     */
    ProfileInfoResponse getAllShareholders();
    
    /**
     * Retrieve all the Shareholders based currenlty logged in user with page and maximum results to display.
     * 
     * @param page are more than a single page request the page of results
     * @param maxresults limit results returned; range {1..100), default 100; the ?page= parameter still applies, and trusts you send the same ?maxresults= parameter
     * @return ProfileInfoResponse containing Shareholders info as ProfileInfo
     * 
     * @see org.agorava.empireavenue.service.ProfileService#getAllShareholders()
     * @see org.agorava.empireavenue.service.ProfileService#getAllShareholders(String,int,int)
     * 
     */
    ProfileInfoResponse getAllShareholders(int page, int maxresults);
    
    /**
     * Retrieve all the Shareholders based on a token.
     * 
     * @param ticker ticker id
     * @param page are more than a single page request the page of results
     * @param maxresults limit results returned; range {1..100), default 100; the ?page= parameter still applies, and trusts you send the same ?maxresults= parameter
     * @return ProfileInfoResponse containing Shareholders info as ProfileInfo
     * 
     * @see org.agorava.empireavenue.service.ProfileService#getAllShareholders()
     * @see org.agorava.empireavenue.service.ProfileService#getAllShareholders(int,int)
     * 
     */
    ProfileInfoResponse getAllShareholders(String ticker,int page, int maxresults);
    
    /**
     * Returns the various totals for the current user.
     * 
     * @return CountResponse containing the Count object.
     * 
     * @see org.agorava.empireavenue.service.ProfileService#getCountFor(String)
     * @see org.agorava.empireavenue.service.ProfileService#getCountFor(String[])
     */
    CountResponse getCount();
    
    /**
     * Returns the various totals for the given ticker.
     * 
     * @param ticker A ticker to which to get a Count
     * @return CountResponse containing the Count object.
     * 
     * @see org.agorava.empireavenue.service.ProfileService#getCount()
     * @see org.agorava.empireavenue.service.ProfileService#getCountFor(String[])
     */
    CountResponse getCountFor(String ticker);
    
    /**
     * Returns the various totals for the list of given tickers.
     * 
     * @param tickers array of tickers to get Count
     * @return CountResponse containing the List of Count objects.
     * 
     * @see org.agorava.empireavenue.service.ProfileService#getCount()
     * @see org.agorava.empireavenue.service.ProfileService#getCountFor(String)
     */
    CountResponse getCountFor(String... tickers);
    
    /**
     * Returns current bank balance for authenticating user
     * 
     * @return BankBalanceResponse returns the BankBalance object
     */
    BankBalanceResponse getBankBalance();
    
}
