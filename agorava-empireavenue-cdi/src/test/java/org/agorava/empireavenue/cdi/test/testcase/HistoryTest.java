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
import org.agorava.empireavenue.model.History;
import org.agorava.empireavenue.response.HistoryResponse;
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
public class HistoryTest extends EmpireAvenueTestDeploy {
    private String ticker = "RMH";

    private int days = 20;

    @Test
    public void authorizationUrlTest() {
        assertTrue(service.getAuthorizationUrl().startsWith("https"));
    }

    @Test
    public void getAllDividendsHistory() {
        HistoryResponse dividendsHistory = historyService.getDividendsHistory();
        assertNotNull(dividendsHistory);
        assertNotNull(dividendsHistory.getAllHistorys());
        assertTrue(dividendsHistory.getAllHistorys().size() > 0);
        for (History history : dividendsHistory.getAllHistorys()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllReceivedDividendsHistory() {
        HistoryResponse receivedDividendsHistory = historyService.getReceivedDividendsHistory();
        assertNotNull(receivedDividendsHistory);
        assertNotNull(receivedDividendsHistory.getAllHistorys());
        assertTrue(receivedDividendsHistory.getAllHistorys().size() > 0);
        for (History history : receivedDividendsHistory.getAllHistorys()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllReceivedDividendsHistoryWithTicker() {
        HistoryResponse receivedDividendsHistory = historyService.getReceivedDividendsHistory(ticker);
        assertNotNull(receivedDividendsHistory);
        assertNotNull(receivedDividendsHistory.getAllHistorys());
        assertTrue(receivedDividendsHistory.getAllHistorys().size() > 0);
        for (History history : receivedDividendsHistory.getAllHistorys()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllNetworkscoreHistory() {
        HistoryResponse networkScoreHistory = historyService.getNetworkscoreHistory();
        assertNotNull(networkScoreHistory);
        assertNotNull(networkScoreHistory.getAllHistorys());
        assertTrue(networkScoreHistory.getAllHistorys().size() > 0);
        for (History history : networkScoreHistory.getAllHistorys()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllNetworkscoreHistoryWithTicker() {
        HistoryResponse networkScoreHistory = historyService.getNetworkscoreHistory(ticker);
        assertNotNull(networkScoreHistory);
        assertNotNull(networkScoreHistory.getAllHistorys());
        assertTrue(networkScoreHistory.getAllHistorys().size() > 0);
        for (History history : networkScoreHistory.getAllHistorys()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllNetworkscoreHistoryWithDays() {
        HistoryResponse networkScoreHistory = historyService.getNetworkscoreHistory(days);
        assertNotNull(networkScoreHistory);
        assertNotNull(networkScoreHistory.getAllHistorys());
        assertTrue(networkScoreHistory.getAllHistorys().size() > 0);
        for (History history : networkScoreHistory.getAllHistorys()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllNetworkscoreHistoryWithTickerAndDays() {
        HistoryResponse networkScoreHistory = historyService.getNetworkscoreHistory(ticker, days);
        assertNotNull(networkScoreHistory);
        assertNotNull(networkScoreHistory.getAllHistorys());
        assertTrue(networkScoreHistory.getAllHistorys().size() > 0);
        for (History history : networkScoreHistory.getAllHistorys()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllSharepriceHistory() {
        HistoryResponse sharePriceHistory = historyService.getSharepriceHistory();
        assertNotNull(sharePriceHistory);
        assertNotNull(sharePriceHistory.getAllHistorys());
        assertTrue(sharePriceHistory.getAllHistorys().size() > 0);
        for (History history : sharePriceHistory.getAllHistorys()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllSharepriceHistoryWithTicker() {
        HistoryResponse sharePriceHistory = historyService.getSharepriceHistory(ticker);
        assertNotNull(sharePriceHistory);
        assertNotNull(sharePriceHistory.getAllHistorys());
        assertTrue(sharePriceHistory.getAllHistorys().size() > 0);
        for (History history : sharePriceHistory.getAllHistorys()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllSharepriceHistoryWithDays() {
        HistoryResponse sharePriceHistory = historyService.getSharepriceHistory(days);
        assertNotNull(sharePriceHistory);
        assertNotNull(sharePriceHistory.getAllHistorys());
        assertTrue(sharePriceHistory.getAllHistorys().size() > 0);
        for (History history : sharePriceHistory.getAllHistorys()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllSharepriceHistoryWithTickerAndDays() {
        HistoryResponse sharePriceHistory = historyService.getSharepriceHistory(ticker, days);
        assertNotNull(sharePriceHistory);
        assertNotNull(sharePriceHistory.getAllHistorys());
        assertTrue(sharePriceHistory.getAllHistorys().size() > 0);
        for (History history : sharePriceHistory.getAllHistorys()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllSharepriceCloseHistory() {
        HistoryResponse sharePriceCloseHistory = historyService.getSharepriceCloseHistory();
        assertNotNull(sharePriceCloseHistory);
        assertNotNull(sharePriceCloseHistory.getAllHistorys());
        assertTrue(sharePriceCloseHistory.getAllHistorys().size() > 0);
        for (History history : sharePriceCloseHistory.getAllHistorys()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllSharepriceCloseHistoryWithTicker() {
        HistoryResponse sharePriceCloseHistory = historyService.getSharepriceCloseHistory(ticker);
        assertNotNull(sharePriceCloseHistory);
        assertNotNull(sharePriceCloseHistory.getAllHistorys());
        assertTrue(sharePriceCloseHistory.getAllHistorys().size() > 0);
        for (History history : sharePriceCloseHistory.getAllHistorys()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllSharepriceCloseHistoryWithDays() {
        HistoryResponse sharePriceCloseHistory = historyService.getSharepriceCloseHistory(days);
        assertNotNull(sharePriceCloseHistory);
        assertNotNull(sharePriceCloseHistory.getAllHistorys());
        assertTrue(sharePriceCloseHistory.getAllHistorys().size() > 0);
        for (History history : sharePriceCloseHistory.getAllHistorys()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllSharepriceCloseHistoryWithTickerAndDays() {
        HistoryResponse sharePriceCloseHistory = historyService.getSharepriceCloseHistory(ticker, days);
        assertNotNull(sharePriceCloseHistory);
        assertNotNull(sharePriceCloseHistory.getAllHistorys());
        assertTrue(sharePriceCloseHistory.getAllHistorys().size() > 0);
        for (History history : sharePriceCloseHistory.getAllHistorys()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllSharesHistory() {
        HistoryResponse sharesHistory = historyService.getSharesHistory();
        assertNotNull(sharesHistory);
        assertNotNull(sharesHistory.getAllHistorys());
        assertTrue(sharesHistory.getAllHistorys().size() > 0);
        for (History history : sharesHistory.getAllHistorys()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }


    @Test
    public void getAllSharesBoughtHistory() {
        HistoryResponse sharesBoughtHistory = historyService.getSharesBoughtHistory(ticker);
        assertNotNull(sharesBoughtHistory);
        assertNotNull(sharesBoughtHistory.getAllHistorys());
        assertTrue(sharesBoughtHistory.getAllHistorys().size() > 0);
        for (History history : sharesBoughtHistory.getAllHistorys()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }


    @Test
    public void getAllSharesSoldHistory() {
        HistoryResponse sharesSoldHistory = historyService.getSharesSoldHistory(ticker);
        assertNotNull(sharesSoldHistory);
        assertNotNull(sharesSoldHistory.getAllHistorys());
        assertTrue(sharesSoldHistory.getAllHistorys().size() > 0);
        for (History history : sharesSoldHistory.getAllHistorys()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }
}
