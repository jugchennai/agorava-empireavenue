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

package org.agorava.empireavenue.cdi.test.testcase;

import org.agorava.empireavenue.cdi.test.EmpireAvenueTestDeploy;
import org.agorava.empireavenue.response.SharesResponse;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Karthikeyan Annamalai  
 * @since 0.7.0
 */
@RunWith(Arquillian.class)
public class SharesTest extends EmpireAvenueTestDeploy {

    private String ticker="ARKARTHICK";
    private int numberOfShares=160;
    private double sharePrice=195.54;




    @Test
    public void authorizationUrlTest() {
        assertTrue(service.getAuthorizationUrl().startsWith("https"));
    }

    @Test
    public void commissionChargesTest() {
        SharesResponse sharesCommission = sharesService.getSharesCommission(ticker,numberOfShares);
        assertNotNull(sharesCommission);
        assertNotNull(sharesCommission.getCommission());
        System.out.println(sharesCommission.getCommission().getCommission());
        System.out.println("--------------------------------------");
    }


    @Test
    public void buySharesTest() {
        SharesResponse buyShares = sharesService.buyShares(ticker, numberOfShares,sharePrice);
        assertNotNull(buyShares);
        assertNotNull(buyShares.getCommission());
        assert (buyShares.getCommission().isSuccess());

        System.out.println("--------------------------------------");
    }



    @Test
    public void sellSharesTest() {
        SharesResponse sellShares = sharesService.sellShares(ticker, numberOfShares,sharePrice);
        assertNotNull(sellShares);
        assertNotNull(sellShares.getCommission());
        assert (sellShares.getCommission().isSuccess());

        System.out.println("--------------------------------------");
    }


}
