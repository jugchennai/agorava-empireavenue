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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author Karthikeyan Annamalai <writetokarthikeyan@outlook.com>
 * @since 0.7.0
 *
 */
@RunWith(Arquillian.class)
public class HistoryTest extends EmpireAvenueTestDeploy {

    @Test
    public void authorizationUrlTest() {
        assertTrue(service.getAuthorizationUrl().startsWith("https"));
    }

    @Test
    public void getAllDividendsHistory() {
        HistoryResponse dividendatsHistory = historyService.getDividendsHistory();
        assertNotNull(dividendatsHistory);
        assertNotNull(dividendatsHistory.getAllLeaders());
        assertTrue(dividendatsHistory.getAllLeaders().size() > 0);
        for (History history : dividendatsHistory.getAllLeaders()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllReceivedDividendsHistory() {
        HistoryResponse receivedDividendsHistory = historyService.getReceivedDividendsHistory();
        assertNotNull(receivedDividendsHistory);
        assertNotNull(receivedDividendsHistory.getAllLeaders());
        assertTrue(receivedDividendsHistory.getAllLeaders().size() > 0);
        for (History history : receivedDividendsHistory.getAllLeaders()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllReceivedDividendsHistory(String ticker) {
        HistoryResponse receivedDividendsHistory = historyService.getReceivedDividendsHistory(ticker);
        assertNotNull(receivedDividendsHistory);
        assertNotNull(receivedDividendsHistory.getAllLeaders());
        assertTrue(receivedDividendsHistory.getAllLeaders().size() > 0);
        for (History history : receivedDividendsHistory.getAllLeaders()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllNetworkscoreHistory() {
        HistoryResponse networkScoreHistory = historyService.getNetworkscoreHistory();
        assertNotNull(networkScoreHistory);
        assertNotNull(networkScoreHistory.getAllLeaders());
        assertTrue(networkScoreHistory.getAllLeaders().size() > 0);
        for (History history : networkScoreHistory.getAllLeaders()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllNetworkscoreHistory(String ticker) {
        HistoryResponse networkScoreHistory = historyService.getNetworkscoreHistory(ticker);
        assertNotNull(networkScoreHistory);
        assertNotNull(networkScoreHistory.getAllLeaders());
        assertTrue(networkScoreHistory.getAllLeaders().size() > 0);
        for (History history : networkScoreHistory.getAllLeaders()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllNetworkscoreHistory(int days) {
        HistoryResponse networkScoreHistory = historyService.getNetworkscoreHistory(days);
        assertNotNull(networkScoreHistory);
        assertNotNull(networkScoreHistory.getAllLeaders());
        assertTrue(networkScoreHistory.getAllLeaders().size() > 0);
        for (History history : networkScoreHistory.getAllLeaders()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllNetworkscoreHistory(String ticker, int days) {
        HistoryResponse networkScoreHistory = historyService.getNetworkscoreHistory(ticker, days);
        assertNotNull(networkScoreHistory);
        assertNotNull(networkScoreHistory.getAllLeaders());
        assertTrue(networkScoreHistory.getAllLeaders().size() > 0);
        for (History history : networkScoreHistory.getAllLeaders()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllSharepriceHistory() {
        HistoryResponse sharePriceHistory = historyService.getSharepriceHistory();
        assertNotNull(sharePriceHistory);
        assertNotNull(sharePriceHistory.getAllLeaders());
        assertTrue(sharePriceHistory.getAllLeaders().size() > 0);
        for (History history : sharePriceHistory.getAllLeaders()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllSharepriceHistory(String ticker) {
        HistoryResponse sharePriceHistory = historyService.getSharepriceHistory(ticker);
        assertNotNull(sharePriceHistory);
        assertNotNull(sharePriceHistory.getAllLeaders());
        assertTrue(sharePriceHistory.getAllLeaders().size() > 0);
        for (History history : sharePriceHistory.getAllLeaders()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllSharepriceHistory(int days) {
        HistoryResponse sharePriceHistory = historyService.getSharepriceHistory(days);
        assertNotNull(sharePriceHistory);
        assertNotNull(sharePriceHistory.getAllLeaders());
        assertTrue(sharePriceHistory.getAllLeaders().size() > 0);
        for (History history : sharePriceHistory.getAllLeaders()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllSharepriceHistory(String ticker, int days) {
        HistoryResponse sharePriceHistory = historyService.getSharepriceHistory(ticker, days);
        assertNotNull(sharePriceHistory);
        assertNotNull(sharePriceHistory.getAllLeaders());
        assertTrue(sharePriceHistory.getAllLeaders().size() > 0);
        for (History history : sharePriceHistory.getAllLeaders()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllSharepriceCloseHistory() {
        HistoryResponse sharePriceCloseHistory = historyService.getSharepriceCloseHistory();
        assertNotNull(sharePriceCloseHistory);
        assertNotNull(sharePriceCloseHistory.getAllLeaders());
        assertTrue(sharePriceCloseHistory.getAllLeaders().size() > 0);
        for (History history : sharePriceCloseHistory.getAllLeaders()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllSharepriceCloseHistory(String ticker) {
        HistoryResponse sharePriceCloseHistory = historyService.getSharepriceCloseHistory(ticker);
        assertNotNull(sharePriceCloseHistory);
        assertNotNull(sharePriceCloseHistory.getAllLeaders());
        assertTrue(sharePriceCloseHistory.getAllLeaders().size() > 0);
        for (History history : sharePriceCloseHistory.getAllLeaders()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllSharepriceCloseHistory(int days) {
        HistoryResponse sharePriceCloseHistory = historyService.getSharepriceCloseHistory(days);
        assertNotNull(sharePriceCloseHistory);
        assertNotNull(sharePriceCloseHistory.getAllLeaders());
        assertTrue(sharePriceCloseHistory.getAllLeaders().size() > 0);
        for (History history : sharePriceCloseHistory.getAllLeaders()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllSharepriceCloseHistory(String ticker, int days) {
        HistoryResponse sharePriceCloseHistory = historyService.getSharepriceCloseHistory(ticker, days);
        assertNotNull(sharePriceCloseHistory);
        assertNotNull(sharePriceCloseHistory.getAllLeaders());
        assertTrue(sharePriceCloseHistory.getAllLeaders().size() > 0);
        for (History history : sharePriceCloseHistory.getAllLeaders()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllSharesHistory() {
        HistoryResponse sharesHistory = historyService.getSharesHistory();
        assertNotNull(sharesHistory);
        assertNotNull(sharesHistory.getAllLeaders());
        assertTrue(sharesHistory.getAllLeaders().size() > 0);
        for (History history : sharesHistory.getAllLeaders()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllSharesBoughtHistory() {
        HistoryResponse sharesBoughtHistory = historyService.getSharesBoughtHistory();
        assertNotNull(sharesBoughtHistory);
        assertNotNull(sharesBoughtHistory.getAllLeaders());
        assertTrue(sharesBoughtHistory.getAllLeaders().size() > 0);
        for (History history : sharesBoughtHistory.getAllLeaders()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllSharesBoughtHistory(String ticker) {
        HistoryResponse sharesBoughtHistory = historyService.getSharesBoughtHistory(ticker);
        assertNotNull(sharesBoughtHistory);
        assertNotNull(sharesBoughtHistory.getAllLeaders());
        assertTrue(sharesBoughtHistory.getAllLeaders().size() > 0);
        for (History history : sharesBoughtHistory.getAllLeaders()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllSharesSoldHistory() {
        HistoryResponse sharesSoldHistory = historyService.getSharesSoldHistory();
        assertNotNull(sharesSoldHistory);
        assertNotNull(sharesSoldHistory.getAllLeaders());
        assertTrue(sharesSoldHistory.getAllLeaders().size() > 0);
        for (History history : sharesSoldHistory.getAllLeaders()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllSharesSoldHistory(String ticker) {
        HistoryResponse sharesSoldHistory = historyService.getSharesSoldHistory(ticker);
        assertNotNull(sharesSoldHistory);
        assertNotNull(sharesSoldHistory.getAllLeaders());
        assertTrue(sharesSoldHistory.getAllLeaders().size() > 0);
        for (History history : sharesSoldHistory.getAllLeaders()) {
            System.out.println(history.toString());
        }
        System.out.println("--------------------------------------");
    }
}
