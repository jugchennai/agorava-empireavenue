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

import org.agorava.empireavenue.response.SharesResponse;

/**
 * Operations on Shares   /shares
 *
 * EmpireAvenue Info:<br/>
 * URI: https://api.empireavenue.com/ <br/>
 * Rate Limit: User <br/>
 * Authentication: Required<br/><br/>
 *
 * API Calls<br/>
 * shares/commission/get<br/>
 *
 * @author Karthikeyan Annamalai <writetokarthikeyan@outlook.com>
 * @since 0.7.0
 *
 **/

public interface SharesService {
    static final String SHARES_COMMISSION = "shares/commission/get";


    /**
     * Returns the commission to be charged between authenticating user and other user. You should be passing in the number of shares that you want the commission for.<br/>
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/search/recent<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @param ticker              // The ticker of the shares for which the commission is enquired
     * @param numberofshares    // The number of shares
     * @return SharesResponse Returns the commission to be charged between authenticating user and other user.
     *
     *
     */

    SharesResponse getSharesCommission(String ticker,int numberofshares);





}
