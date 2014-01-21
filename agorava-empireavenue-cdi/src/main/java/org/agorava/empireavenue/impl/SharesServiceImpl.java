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
import org.agorava.empireavenue.response.SharesResponse;
import org.agorava.empireavenue.service.SharesService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Karthikeyan Annamalai  
 * @since 0.7.0
 */

@EmpireAvenue
public class SharesServiceImpl extends EmpireAvenueBaseService implements SharesService {


    @Override
    public SharesResponse buyShares(String ticker, int numberOfShares, double sharePrice) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        data.put("shares", numberOfShares);
        data.put("last_trade", sharePrice);

        return getService().post(buildAbsoluteUri(SHARES_BUY),data, SharesResponse.class);
    }


    @Override
    public SharesResponse sellShares(String ticker, int numberOfShares, double sharePrice) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        data.put("shares", numberOfShares);
        data.put("last_trade", sharePrice);

        return getService().post(buildAbsoluteUri(SHARES_SELL),data, SharesResponse.class);
   }

    @Override
    public SharesResponse getSharesCommission(String ticker, int numberOfShares) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        data.put("shares", numberOfShares);
        return getService().post(buildAbsoluteUri(SHARES_COMMISSION),data, SharesResponse.class);
    }
}
