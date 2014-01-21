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

import org.agorava.empireavenue.response.HistoryResponse;

/**
 * Operations on Portfolio   /Portfolio
 *
 *
 * EmpireAvenue Info:<br/>
 * URI: https://api.empireavenue.com/ <br/>
 * Rate Limit: User <br/>
 * Authentication: Required<br/><br/>
 *
 * API Calls<br/>
 * history/dividends<br/>
 * history/dividends/received<br/>
 * history/networkscore<br/>
 * history/shareprice<br/>
 * history/shareprice/close<br/>
 * history/shares<br/>
 * history/shares/bought<br/>
 * history/shares/sold <br/>
 *
 *
 * @author Karthikeyan Annamalai  
 * @since 0.7.0
 *
 */
public interface HistoryService {
    
    static final String HISTORY_DIVIDENDS = "history/dividends";
    static final String HISTORY_DIVIDENDS_RECEIVED = "history/dividends/received";
    static final String HISTORY_NETWORKSCORE = "history/networkscore";
    static final String HISTORY_SHAREPRICE = "history/shareprice";
    static final String HISTORY_SHAREPRICE_CLOSE = "history/shareprice/close";
    static final String HISTORY_SHARES = "history/networkscore";
    static final String HISTORY_SHARES_BOUGHT = "history/shares/bought";
    static final String HISTORY_SHARES_SOLD = "history/shares/sold";

    /**
     * Returns the Full Portfolio information for a specific user<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/history/dividends<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     * 
     * @return HistoryResponse Returns the Full Portfolio information for a specific user.
     * 
     * 
     */


    HistoryResponse getDividendsHistory();
    
    /**
     * Returns the Full Portfolio information for a specific user and the user specified<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/history/dividends/received<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <br/> <b>Authentication</b>: Required
     * 
     * @return HistoryResponse Returns the Full Portfolio information for a specific user and the user specified.
     * 
     * @see org.agorava.empireavenue.service.HistoryService#getReceivedDividendsHistory(String)
     *  
     **/
    
    HistoryResponse getReceivedDividendsHistory();
    
    /**
     * Returns the Full Portfolio information for a specific user and the user specified<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/history/dividends/received<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     * 
     * @param ticker The Ticker symbol of whose history is queried
     * @return HistoryResponse Returns the Full Portfolio information for a specific user and the user specified.
     * @see org.agorava.empireavenue.service.HistoryService#getReceivedDividendsHistory()
     *  
     **/

    HistoryResponse getReceivedDividendsHistory(String ticker);
    
    /**
     * Returns the network score history recorded at each market close for the user.By default it will return 30 days of network score history. It can bring up to 90 days of history.<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/history/networkscore<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     * 
     * @return HistoryResponse Returns the network score history recorded at each market close for the requested user. 
     * 
     * @see org.agorava.empireavenue.service.HistoryService#getNetworkscoreHistory(String)
     * @see org.agorava.empireavenue.service.HistoryService#getNetworkscoreHistory(int)
     * @see org.agorava.empireavenue.service.HistoryService#getNetworkscoreHistory(String,int)
     *  
     **/
    
    HistoryResponse getNetworkscoreHistory();
    
    /**
     * Returns the network score history recorded at each market close for the requested user.By default it will return 30 days of network score history. It can bring up to 90 days of history.<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/history/networkscore<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     * 
     * @return HistoryResponse Returns the network score history recorded at each market close for the requested user. 
     * 
     * @see org.agorava.empireavenue.service.HistoryService#getNetworkscoreHistory()
     * @see org.agorava.empireavenue.service.HistoryService#getNetworkscoreHistory(int)
     * @see org.agorava.empireavenue.service.HistoryService#getNetworkscoreHistory(String,int)
     *  
     **/

    HistoryResponse getNetworkscoreHistory(String ticker);
    
    /**
     * Returns the network score history recorded at each market close for the requested user.By default it will return 30 days of network score history. It can bring up to 90 days of history.<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/history/networkscore<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     * 
     * @param days The number of days for which the history is queried 
     * @return HistoryResponse Returns the network score history recorded at each market close for the requested user. 
     * 
     * @see org.agorava.empireavenue.service.HistoryService#getNetworkscoreHistory()
     * @see org.agorava.empireavenue.service.HistoryService#getNetworkscoreHistory(String)
     * @see org.agorava.empireavenue.service.HistoryService#getNetworkscoreHistory(String,int)
     *  
     **/

    HistoryResponse getNetworkscoreHistory(int days);
    /**
     * Returns the network score history recorded at each market close for the requested user.By default it will return 30 days of network score history. It can bring up to 90 days of history.<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/history/networkscore<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     * 
     * @param days The number of days for which the history is queried 
     * @param ticker The Ticker symbol whose history is queried 
     * @return HistoryResponse Returns the network score history recorded at each market close for the requested user. 
     * 
     * @see org.agorava.empireavenue.service.HistoryService#getNetworkscoreHistory()
     * @see org.agorava.empireavenue.service.HistoryService#getNetworkscoreHistory(String)
     * @see org.agorava.empireavenue.service.HistoryService#getNetworkscoreHistory(int)
     *  
     **/

    HistoryResponse getNetworkscoreHistory(String ticker, int days);

    
    
    /**
     * Returns the shareprice history for the the requested user. By default it will return 24 hours of share price history. It can bring up to 7 days (168 hours) of history.<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/history/shareprice<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     * 
     * @return HistoryResponse Returns the shareprice history for the the requested user. 
     * 
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceHistory(int)
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceHistory(String)
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceHistory(String,int)
     *  
     **/
    
    
    
    HistoryResponse getSharepriceHistory();
    
    
    /**
     * Returns the shareprice history for the the requested user. By default it will return 24 hours of share price history. It can bring up to 7 days (168 hours) of history.<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/history/shareprice<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     * 
     * @param ticker The Ticker symbol whose history is queried 
     * @return HistoryResponse Returns the shareprice history for the the requested user. 
     * 
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceHistory()
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceHistory(int)
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceHistory(String,int)
     *  
     **/

    HistoryResponse getSharepriceHistory(String ticker);

    /**
     * Returns the shareprice history for the the requested user. By default it will return 24 hours of share price history. It can bring up to 7 days (168 hours) of history.<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/history/shareprice<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     * 
     * @param hours The number of hours for which the history is queried 
     * @return HistoryResponse Returns the shareprice history for the the requested user. 
     * 
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceHistory()
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceHistory(String)
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceHistory(String,int)
     *  
     **/
    
    
    HistoryResponse getSharepriceHistory(int hours);
    /**
     * Returns the shareprice history for the the requested user. By default it will return 24 hours of share price history. It can bring up to 7 days (168 hours) of history.<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/history/shareprice<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     * 
     * @param ticker The Ticker symbol whose history is queried 
     * @param hours The number of hours for which the history is queried 
     * @return HistoryResponse Returns the shareprice history for the the requested user. 
     * 
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceHistory()
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceHistory(String)
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceHistory(int)
     *  
     **/
    
    HistoryResponse getSharepriceHistory(String ticker, int hours);

    /**
     * Returns the shareprice history recorded at each market close for the the requested user. By default it will return 30 days of closing price history. It can bring up to 90 days of history.<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/history/shareprice/close<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     * 
     * @return HistoryResponse Returns the shareprice history recorded at each market close for the the requested user.
     * 
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceCloseHistory(String)
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceCloseHistory(int)
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceCloseHistory(String,int)
     *  
     **/
    
    
    HistoryResponse getSharepriceCloseHistory();
    /**
     * Returns the shareprice history recorded at each market close for the the requested user. By default it will return 30 days of closing price history. It can bring up to 90 days of history.<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/history/shareprice/close<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     * 
     * @param ticker The Ticker symbol whose history is queried 
     * @return HistoryResponse Returns the shareprice history recorded at each market close for the the requested user.
     * 
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceCloseHistory()
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceCloseHistory(int)
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceCloseHistory(String,int)
     *  
     **/

    HistoryResponse getSharepriceCloseHistory(String ticker);
    
    /**
     * Returns the shareprice history recorded at each market close for the the requested user. By default it will return 30 days of closing price history. It can bring up to 90 days of history.<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/history/shareprice/close<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     * 
     * 
     * @param days The number of days for which the history is queried 
     * @return HistoryResponse Returns the shareprice history recorded at each market close for the the requested user.
     * 
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceCloseHistory()
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceCloseHistory(String)
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceCloseHistory(String,int)
     *  
     **/
    
    

    HistoryResponse getSharepriceCloseHistory(int days);

    /**
     * Returns the shareprice history recorded at each market close for the the requested user. By default it will return 30 days of closing price history. It can bring up to 90 days of history.<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/history/shareprice/close<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     * @param ticker The Ticker symbol whose history is queried 
     * @param days The number of days for which the history is queried 
     * @return HistoryResponse Returns the shareprice history recorded at each market close for the the requested user.
     * 
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceCloseHistory()
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceCloseHistory(String)
     * @see org.agorava.empireavenue.service.HistoryService#getSharepriceCloseHistory(int)
     *  
     **/
    HistoryResponse getSharepriceCloseHistory(String ticker, int days);
    
    /**
     * Returns the share purchase history for the the authenticated user. This does not bring back trades. Max: 50 results.<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/history/shareprice/close<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     * 
     * @return HistoryResponse Returns the share purchase history for the the authenticated user.
     * 
   
     *  
     **/
    
    HistoryResponse getSharesHistory();


    /**
     * Returns the share purchase history for the the authenticated user and the requested user, specifically "buys". This does not bring back trades. Max: 50 results. Authenticated user must own requested user.<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/history/shares/bought<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     * 
     * @param ticker The Ticker symbol whose history is queried 
     * @return HistoryResponse Returns the share purchase history for the the authenticated user and the requested user, specifically "buys".
     *
     *  
     **/
    HistoryResponse getSharesBoughtHistory(String ticker);

    /**
     * Returns the share purchase history for the the authenticated user and the requested user, specifically "sells". This does not bring back trades. Max: 50 results. Authenticated user must own requested user.<br/>
     * <br/>
     * 
     * EmpireAvenue : https://api.empireavenue.com/history/shares/sold<br/>
     * <br/>
     * 
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     * 
     * @param ticker The Ticker symbol whose history is queried 
     * @return HistoryResponse Returns the share purchase history for the the authenticated user and the requested user, specifically "sells".
     *
     *  
     **/
    HistoryResponse getSharesSoldHistory(String ticker);
    
    

    
    




        
        
    
}
