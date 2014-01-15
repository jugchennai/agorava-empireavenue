package org.agorava.empireavenue.impl;

import org.agorava.EmpireAvenueBaseService;
import org.agorava.empireavenue.EmpireAvenue;
import org.agorava.empireavenue.response.HistoryResponse;
import org.agorava.empireavenue.response.PortfolioResponse;
import org.agorava.empireavenue.service.PortfolioService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Karthikeyan Annamalai <writetokarthikeyan@outlook.com>
 * @since 0.7.0
 */
@EmpireAvenue
public class PortfolioServiceImpl extends EmpireAvenueBaseService implements PortfolioService {

    @Override
    public PortfolioResponse getBasePortfolio() {
        return getService().get(buildAbsoluteUri(PORTFOLIO_BASE), PortfolioResponse.class);
    }

    @Override
    public PortfolioResponse getBasePortfolio(String ticker) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        return getService().post(buildAbsoluteUri(PORTFOLIO_BASE),data, PortfolioResponse.class);
    }


    @Override
    public PortfolioResponse getBasePortfolio(int page) {
        Map<String, Object> data = new HashMap<>();
        data.put("page", page);
        return getService().post(buildAbsoluteUri(PORTFOLIO_BASE),data, PortfolioResponse.class);    }

    @Override
    public PortfolioResponse getBasePortfolio(Integer maxresults) {
        Map<String, Object> data = new HashMap<>();
        data.put("maxresults", maxresults);
        return getService().post(buildAbsoluteUri(PORTFOLIO_BASE),data, PortfolioResponse.class);

    }

    @Override
    public PortfolioResponse getBasePortfolio(String ticker, int page) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        data.put("page", page);
        return getService().post(buildAbsoluteUri(PORTFOLIO_BASE),data, PortfolioResponse.class);

    }

    @Override
    public PortfolioResponse getBasePortfolio(String ticker, Integer maxresults) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        data.put("maxresults", maxresults);
        return getService().post(buildAbsoluteUri(PORTFOLIO_BASE),data, PortfolioResponse.class);
    }

    @Override
    public PortfolioResponse getBasePortfolio(String ticker, int page, Integer maxresults) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        data.put("maxresults", maxresults);
        data.put("page", page);
        return getService().post(buildAbsoluteUri(PORTFOLIO_BASE),data, PortfolioResponse.class);
    }

    @Override
    public PortfolioResponse getFullPortfolio() {
        return getService().get(buildAbsoluteUri(PORTFOLIO_GET), PortfolioResponse.class);
    }

    @Override
    public PortfolioResponse getFullPortfolio(String ticker) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        return getService().post(buildAbsoluteUri(PORTFOLIO_GET),data, PortfolioResponse.class);
    }

    @Override
    public PortfolioResponse getFullPortfolio(int page) {
        Map<String, Object> data = new HashMap<>();
        data.put("page", page);
        return getService().post(buildAbsoluteUri(PORTFOLIO_GET),data, PortfolioResponse.class);
    }

    @Override
    public PortfolioResponse getFullPortfolio(Integer maxresults) {
        Map<String, Object> data = new HashMap<>();
        data.put("maxresults", maxresults);
        return getService().post(buildAbsoluteUri(PORTFOLIO_GET),data, PortfolioResponse.class);
    }

    @Override
    public PortfolioResponse getFullPortfolio(int page, float maxresults) {
        Map<String, Object> data = new HashMap<>();
        data.put("page", page);
        data.put("maxresults", maxresults);
        return getService().post(buildAbsoluteUri(PORTFOLIO_GET),data, PortfolioResponse.class);
    }

    @Override
    public PortfolioResponse getFullPortfolio(String ticker, int page) {
        Map<String, Object> data = new HashMap<>();
        data.put("page", page);
        data.put("ticker", ticker);
        return getService().post(buildAbsoluteUri(PORTFOLIO_GET),data, PortfolioResponse.class);
    }

    @Override
    public PortfolioResponse getFullPortfolio(String ticker, Integer maxresults) {
        Map<String, Object> data = new HashMap<>();
        data.put("maxresults", maxresults);
        data.put("ticker", ticker);
        return getService().post(buildAbsoluteUri(PORTFOLIO_GET),data, PortfolioResponse.class);
    }

    @Override
    public PortfolioResponse getFullPortfolio(String ticker, int page, Integer maxresults) {
        Map<String, Object> data = new HashMap<>();
        data.put("maxresults", maxresults);
        data.put("page", page);
        data.put("ticker", ticker);

        return getService().post(buildAbsoluteUri(PORTFOLIO_GET),data, PortfolioResponse.class);
    }

    @Override
    public PortfolioResponse getBasePortfolio(int page, Integer maxresults) {
        Map<String, Object> data = new HashMap<>();
        data.put("maxresults", maxresults);
        data.put("page", page);
        return getService().post(buildAbsoluteUri(PORTFOLIO_GET),data, PortfolioResponse.class);    }

}
