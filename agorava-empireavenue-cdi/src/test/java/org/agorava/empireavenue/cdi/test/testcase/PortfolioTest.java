package org.agorava.empireavenue.cdi.test.testcase;

import org.agorava.empireavenue.cdi.test.EmpireAvenueTestDeploy;
import org.agorava.empireavenue.model.Portfolio;
import org.agorava.empireavenue.response.PortfolioResponse;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Karthikeyan Annamalai <writetokarthikeyan@outlook.com>@EmpireAvenue
 * @since 0.7.0
 *
 */
@RunWith(Arquillian.class)
public class PortfolioTest extends EmpireAvenueTestDeploy {

    private static String ticker="RMH";
    private static int page=10;
    private static int maxresults=101;


    @Test
    public void authorizationUrlTest() {
        assertTrue(service.getAuthorizationUrl().startsWith("https"));

    }

    @Test
    public void getAllBasePortfolioInfo() {
        PortfolioResponse basePortfolioInfo = portfolioService.getBasePortfolio();
        assertNotNull(basePortfolioInfo);
        assertTrue(basePortfolioInfo.getAllPortfolioInfo().size() > 0);
        for (Portfolio portfolio : basePortfolioInfo.getAllPortfolioInfo()) {
            System.out.println(portfolio.toString());
        }
        System.out.println("--------------------------------------");
    }

    @Test
    public void getAllFullPortfolioInfo() {
        PortfolioResponse fullPortfolioInfo = portfolioService.getFullPortfolio();
        assertNotNull(fullPortfolioInfo);
        assertTrue(fullPortfolioInfo.getAllPortfolioInfo().size() > 0);
        for (Portfolio portfolio : fullPortfolioInfo.getAllPortfolioInfo()) {
            System.out.println(portfolio.toString());
        }
        System.out.println("--------------------------------------");
    }




    @Test
    public void getAllBasePortfolioInfoWithTicker() {
        PortfolioResponse basePortfolioInfo = portfolioService.getBasePortfolio();
        assertNotNull(basePortfolioInfo);
        assertTrue(basePortfolioInfo.getAllPortfolioInfo().size() > 0);
        for (Portfolio portfolio : basePortfolioInfo.getAllPortfolioInfo()) {
            System.out.println(portfolio.toString());
        }
        System.out.println("--------------------------------------");
    }


}
