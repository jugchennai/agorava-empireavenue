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

import org.agorava.empireavenue.response.ListsResponse;

/**
 * Operations on Lists   /lists
 *
 *
 * EmpireAvenue Info:<br/>
 * URI: https://api.empireavenue.com/ <br/>
 * Rate Limit: User <br/>
 * Authentication: Required<br/><br/>
 *
 * API Calls<br/>
 *
 * GET
 * lists/get<br/>
 * lists/members<br/>
 * lists/listedby<br/>
 * lists/recommendedby<br/>
 *
 * POST
 * lists/add</br>
 * lists/remove</br>
 *
 * @author Karthikeyan Annamalai
 * @since 0.7.0
 *
 */


public interface ListsService {

    static final String LISTS_GET = "lists/get";
    static final String LISTS_MEMBERS = "lists/members";
    static final String LISTS_LISTEDBY = "lists/listedby";
    static final String LISTS_RECOMMENDEDBY = "lists/recommendedby";

    static final String LISTS_ADD = "lists/add";
    static final String LISTS_REMOVE = "lists/remove";


    /**
     * Returns the lists and information about the lists that a person has. Note, Private lists are not returned unless you are fetching for the authenticated user<br/>
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/lists/get<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @return ListsResponse Returns the lists and information about the lists that a person has.
     * @see org.agorava.empireavenue.service.ListsService#getListInfo(java.lang.String)
     *
     */
    ListsResponse getListInfo();


    /**
     * Returns the lists and information about the lists that a person has. Note, Private lists are not returned unless you are fetching for the authenticated user<br/>
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/lists/get<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @param ticker The ticker of the person whose list information is being queried.
     * @return ListsResponse Returns the lists and information about the lists that a person has.
     * @see org.agorava.empireavenue.service.ListsService#getListInfo()
     *
     */
    ListsResponse getListInfo(String ticker);



    /**
     * Returns the members from a list. Will not return members of private lists except for the authenticated user.<br/>
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/lists/members<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @param listTypeId List type - "friends","watch","recommend_buy","private","favourite"
     * @return ListsResponse Returns the members from a list. Will not return members of private lists except for the authenticated user.
     * @see org.agorava.empireavenue.service.ListsService#getListMembersInfo(java.lang.String,int)
     * @see org.agorava.empireavenue.service.ListsService#getListMembersInfo(java.lang.String,java.lang.String,int)
     *
     */

    ListsResponse getListMembersInfo(String listTypeId);

    /**
     * Returns the members from a list. Will not return members of private lists except for the authenticated user.<br/>
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/lists/members<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @param listTypeId List type - "friends","watch","recommend_buy","private","favourite"
     * @param page number of result pages requested
     * @return ListsResponse Returns the members from a list. Will not return members of private lists except for the authenticated user.
     * @see org.agorava.empireavenue.service.ListsService#getListMembersInfo(java.lang.String)
     * @see org.agorava.empireavenue.service.ListsService#getListMembersInfo(java.lang.String,java.lang.String,int)
     *
     */
    ListsResponse getListMembersInfo(String listTypeId,int page);



    /**
     * Returns the members from a list. Will not return members of private lists except for the authenticated user.<br/>
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/lists/members<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @param listTypeId List type - "friends","watch","recommend_buy","private","favourite"
     * @param ticker The ticker of the person whose list information is being queried
     * @param page number of result pages requested
     * @return ListsResponse Returns the members from a list. Will not return members of private lists except for the authenticated user.
     * @see org.agorava.empireavenue.service.ListsService#getListMembersInfo(java.lang.String,int)
     * @see org.agorava.empireavenue.service.ListsService#getListMembersInfo(java.lang.String)
     *
     */
    ListsResponse getListMembersInfo(String listTypeId,String ticker,int page);

    /**
     * Returns the users on the site who have listed TICKER. Does not return those who have placed a TICKER on a private list.
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/lists/listedby<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @return ListsResponse Returns the users on the site who have listed TICKER.
     * @see org.agorava.empireavenue.service.ListsService#getListedUsers(int)
     * @see org.agorava.empireavenue.service.ListsService#getListedUsers(java.lang.String)
     * @see org.agorava.empireavenue.service.ListsService#getListedUsers(java.lang.String,int)
     *
     */
    ListsResponse getListedUsers();


    /**
     * Returns the users on the site who have listed TICKER. Does not return those who have placed a TICKER on a private list.
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/lists/listedby<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @return ListsResponse Returns the users on the site who have listed TICKER.
     * @see org.agorava.empireavenue.service.ListsService#getListedUsers()
     * @see org.agorava.empireavenue.service.ListsService#getListedUsers(java.lang.String)
     * @see org.agorava.empireavenue.service.ListsService#getListedUsers(java.lang.String,int)
     *
     */
    ListsResponse getListedUsers(int page);

    /**
     * Returns the users on the site who have listed TICKER. Does not return those who have placed a TICKER on a private list.
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/lists/listedby<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @return ListsResponse Returns the users on the site who have listed TICKER.
     * @see org.agorava.empireavenue.service.ListsService#getListedUsers()
     * @see org.agorava.empireavenue.service.ListsService#getListedUsers(int)
     * @see org.agorava.empireavenue.service.ListsService#getListedUsers(java.lang.String,int)
     *
     */
    ListsResponse getListedUsers(String ticker);


    /**
     * Returns the users on the site who have listed TICKER. Does not return those who have placed a TICKER on a private list.
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/lists/listedby<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @return ListsResponse Returns the users on the site who have listed TICKER.
     * @see org.agorava.empireavenue.service.ListsService#getListedUsers()
     * @see org.agorava.empireavenue.service.ListsService#getListedUsers(int)
     * @see org.agorava.empireavenue.service.ListsService#getListedUsers(java.lang.String)
     *
     */
    ListsResponse getListedUsers(String ticker,int page);


    /**
     * Returns the users on the site who have listed TICKER as a "Recommended Buy".
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/lists/recommendedby<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @return ListsResponse Returns the users on the site who have listed TICKER as a "Recommended Buy".
     * @see org.agorava.empireavenue.service.ListsService#getRecommendedUsers(java.lang.String)
     * @see org.agorava.empireavenue.service.ListsService#getRecommendedUsers(int)
     * @see org.agorava.empireavenue.service.ListsService#getRecommendedUsers(java.lang.String,int)
     *
     */
    ListsResponse getRecommendedUsers();


    /**
     * Returns the users on the site who have listed TICKER as a "Recommended Buy".
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/lists/recommendedby<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @return ListsResponse Returns the users on the site who have listed TICKER as a "Recommended Buy".
     * @see org.agorava.empireavenue.service.ListsService#getRecommendedUsers(java.lang.String)
     * @see org.agorava.empireavenue.service.ListsService#getRecommendedUsers()
     * @see org.agorava.empireavenue.service.ListsService#getRecommendedUsers(java.lang.String,int)
     *
     */
    ListsResponse getRecommendedUsers(int page);

    /**
     * Returns the users on the site who have listed TICKER as a "Recommended Buy".
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/lists/recommendedby<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @return ListsResponse Returns the users on the site who have listed TICKER as a "Recommended Buy".
     * @see org.agorava.empireavenue.service.ListsService#getRecommendedUsers()
     * @see org.agorava.empireavenue.service.ListsService#getRecommendedUsers(int)
     * @see org.agorava.empireavenue.service.ListsService#getRecommendedUsers(java.lang.String,int)
     *
     */
    ListsResponse getRecommendedUsers(String ticker);

    /**
     * Returns the users on the site who have listed TICKER as a "Recommended Buy".
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/lists/recommendedby<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @return ListsResponse Returns the users on the site who have listed TICKER as a "Recommended Buy".
     * @see org.agorava.empireavenue.service.ListsService#getRecommendedUsers()
     * @see org.agorava.empireavenue.service.ListsService#getRecommendedUsers(java.lang.String)
     * @see org.agorava.empireavenue.service.ListsService#getRecommendedUsers(int)
     *
     */
    ListsResponse getRecommendedUsers(String ticker,int page);




    /**
     *  Adds the given ticker into the mentioned lists of authenticated user.
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/lists/add<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @return ListsResponse On Success the list type,max user of the list and current user count will be returned as a ListsResponse.
     * @see org.agorava.empireavenue.service.ListsService#removeFromList(String ,String)
     *
     */
    ListsResponse addToList(String ticker,String list);







    /**
     *  Removes the given ticker from the mentioned lists of authenticated user.
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/lists/remove<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @return ListsResponse On Success the list type,max user of the list and current user count will be returned as a ListsResponse.
     * @see org.agorava.empireavenue.service.ListsService#addToList(String ,String)
     *
     */
    ListsResponse removeFromList(String ticker,String list);


}
