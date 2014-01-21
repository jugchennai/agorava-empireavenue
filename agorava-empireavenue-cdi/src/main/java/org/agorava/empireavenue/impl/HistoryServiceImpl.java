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

import org.agorava.EmpireAvenueBaseService;
import org.agorava.empireavenue.EmpireAvenue;
import org.agorava.empireavenue.response.HistoryResponse;
import org.agorava.empireavenue.service.HistoryService;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Karthikeyan Annamalai  
 * @since 0.7.0
 * 
 */
@EmpireAvenue
public class HistoryServiceImpl extends EmpireAvenueBaseService implements HistoryService {

    @Override
    public HistoryResponse getDividendsHistory() {
        return getService().get(buildAbsoluteUri(HISTORY_DIVIDENDS), HistoryResponse.class);
    }

    @Override
    public HistoryResponse getReceivedDividendsHistory() {
        return getService().get(buildAbsoluteUri(HISTORY_DIVIDENDS_RECEIVED), HistoryResponse.class);
    }

    @Override
    public HistoryResponse getReceivedDividendsHistory(String ticker) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        return getService().post(buildAbsoluteUri(HISTORY_DIVIDENDS_RECEIVED),data, HistoryResponse.class);
    }

    @Override
    public HistoryResponse getNetworkscoreHistory() {
                return getService().get(buildAbsoluteUri(HISTORY_NETWORKSCORE), HistoryResponse.class);
    }

    @Override
    public HistoryResponse getNetworkscoreHistory(String ticker) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
                return getService().post(buildAbsoluteUri(HISTORY_NETWORKSCORE),data, HistoryResponse.class);
    }

    @Override
    public HistoryResponse getNetworkscoreHistory(int days) {
        Map<String, Object> data = new HashMap<>();
        data.put("days", days);

        return getService().post(buildAbsoluteUri(HISTORY_NETWORKSCORE),data, HistoryResponse.class);
    }

    @Override
    public HistoryResponse getNetworkscoreHistory(String ticker, int days) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        data.put("days", days);
                return getService().post(buildAbsoluteUri(HISTORY_NETWORKSCORE), data, HistoryResponse.class);
    }

    @Override
    public HistoryResponse getSharepriceHistory() {
                return getService().get(buildAbsoluteUri(HISTORY_SHAREPRICE), HistoryResponse.class);
    }

    @Override
    public HistoryResponse getSharepriceHistory(String ticker) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
                return getService().post(buildAbsoluteUri(HISTORY_SHAREPRICE), data, HistoryResponse.class);
    }

    @Override
    public HistoryResponse getSharepriceHistory(int hours) {
        Map<String, Object> data = new HashMap<>();
        data.put("hours", hours);
                return getService().post(buildAbsoluteUri(HISTORY_SHAREPRICE), data, HistoryResponse.class);
    }

    @Override
    public HistoryResponse getSharepriceHistory(String ticker, int hours) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        data.put("hours", hours);
                return getService().post(buildAbsoluteUri(HISTORY_SHAREPRICE), data, HistoryResponse.class);
    }

    @Override
    public HistoryResponse getSharepriceCloseHistory() {
                return getService().get(buildAbsoluteUri(HISTORY_SHAREPRICE_CLOSE), HistoryResponse.class);
    }

    @Override
    public HistoryResponse getSharepriceCloseHistory(String ticker) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
                return getService().post(buildAbsoluteUri(HISTORY_SHAREPRICE_CLOSE), data, HistoryResponse.class);
    }

    @Override
    public HistoryResponse getSharepriceCloseHistory(int days) {
        Map<String, Object> data = new HashMap<>();
        data.put("days", days);
                return getService().post(buildAbsoluteUri(HISTORY_SHAREPRICE_CLOSE), data, HistoryResponse.class);
    }

    @Override
    public HistoryResponse getSharepriceCloseHistory(String ticker, int days) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        data.put("days", days);

        return getService().post(buildAbsoluteUri(HISTORY_SHAREPRICE_CLOSE), data, HistoryResponse.class);
    }

    @Override
    public HistoryResponse getSharesHistory() {
                return getService().get(buildAbsoluteUri(HISTORY_SHARES), HistoryResponse.class);
    }


    @Override
    public HistoryResponse getSharesBoughtHistory(String ticker) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
                return getService().post(buildAbsoluteUri(HISTORY_SHARES_BOUGHT), data, HistoryResponse.class);
    }


    @Override
    public HistoryResponse getSharesSoldHistory(String ticker) {

        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
                return getService().post(buildAbsoluteUri(HISTORY_SHARES_SOLD), data, HistoryResponse.class);
    }
    
    
    
}
