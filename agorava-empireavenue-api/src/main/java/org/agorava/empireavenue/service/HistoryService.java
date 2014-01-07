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
*
* @author Karthikeyan Annamalai <writetokarthikeyan@outlook.com>
* @since 0.7.0
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





    HistoryResponse getDividendsHistory();

    HistoryResponse getReceivedDividendsHistory();

    HistoryResponse getReceivedDividendsHistory(String ticker);

    HistoryResponse getNetworkscoreHistory();

    HistoryResponse getNetworkscoreHistory(String ticker);

    HistoryResponse getNetworkscoreHistory(int days);

    HistoryResponse getNetworkscoreHistory(String ticker, int days);

    HistoryResponse getSharepriceHistory();

    HistoryResponse getSharepriceHistory(String ticker);

    HistoryResponse getSharepriceHistory(int hours);

    HistoryResponse getSharepriceHistory(String ticker, int hours);

    HistoryResponse getSharepriceCloseHistory();

    HistoryResponse getSharepriceCloseHistory(String ticker);

    HistoryResponse getSharepriceCloseHistory(int days);

    HistoryResponse getSharepriceCloseHistory(String ticker, int days);

    HistoryResponse getSharesHistory();

    HistoryResponse getSharesBoughtHistory();

    HistoryResponse getSharesBoughtHistory(String ticker);

    HistoryResponse getSharesSoldHistory();

    HistoryResponse getSharesSoldHistory(String ticker);
    
    

    
    




        
        
    
}
