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

import org.agorava.empireavenue.model.Portfolio;
import org.agorava.empireavenue.response.PortfolioResponse;

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
 * portfolio/base<br/>
 * portfolio/get<br/>
 *
 * @author Karthikeyan Annamalai <writetokarthikeyan@outlook.com>
 * @since 0.7.0
 *
 */

public interface PortfolioService {


    static final String PORTFOLIO_BASE = "portfolio/base";
    static final String PORTFOLIO_GET= "portfolio/get";


    PortfolioResponse   getBasePortfolio();
    PortfolioResponse   getBasePortfolio(String ticker);
    PortfolioResponse   getBasePortfolio(int page);
    PortfolioResponse   getBasePortfolio(Integer maxresults);
    PortfolioResponse   getBasePortfolio(int page,Integer maxresults);
    PortfolioResponse   getBasePortfolio(String ticker,int page);
    PortfolioResponse   getBasePortfolio(String ticker,Integer maxresults);
    PortfolioResponse   getBasePortfolio(String ticker,int page,Integer maxresults );


    PortfolioResponse   getFullPortfolio();
    PortfolioResponse   getFullPortfolio(String ticker);
    PortfolioResponse   getFullPortfolio(int page);
    PortfolioResponse   getFullPortfolio(Integer maxresults);
    PortfolioResponse   getFullPortfolio(int page,float maxresults);
    PortfolioResponse   getFullPortfolio(String ticker,int page);
    PortfolioResponse   getFullPortfolio(String ticker,Integer maxresults);
    PortfolioResponse   getFullPortfolio(String ticker,int page,Integer maxresults );










}