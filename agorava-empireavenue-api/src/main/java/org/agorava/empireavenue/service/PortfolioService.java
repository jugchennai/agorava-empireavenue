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



    /**
     * Returns the Base Portfolio information for a specific user<br/>
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/portfolio/base<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @return HistoryResponse Returns the Base Portfolio information for a specific user.
     * @see org.agorava.empireavenue.service.PortfolioService#getBasePortfolio(String)
     * @see org.agorava.empireavenue.service.PortfolioService#getBasePortfolio(int,java.lang.Integer);
     * @see org.agorava.empireavenue.service.PortfolioService#getBasePortfolio(String,int,java.lang.Integer);
     *
     */
    PortfolioResponse   getBasePortfolio();


    /**
     * Returns the Base Portfolio information for a specific user<br/>
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/portfolio/base<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @return HistoryResponse Returns the Base Portfolio information for a specific user.
     * @see org.agorava.empireavenue.service.PortfolioService#getBasePortfolio()
     * @see org.agorava.empireavenue.service.PortfolioService#getBasePortfolio(int,java.lang.Integer);
     * @see org.agorava.empireavenue.service.PortfolioService#getBasePortfolio(String,int,java.lang.Integer);
     *
     */
    PortfolioResponse   getBasePortfolio(String ticker);



    /**
     * Returns the Base Portfolio information for a specific user<br/>
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/portfolio/base<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @return PortfolioResponse Returns the Base Portfolio information for a specific user.
     * @see org.agorava.empireavenue.service.PortfolioService#getBasePortfolio(String)
     * @see org.agorava.empireavenue.service.PortfolioService#getBasePortfolio();
     * @see org.agorava.empireavenue.service.PortfolioService#getBasePortfolio(int,java.lang.Integer);
     * @see org.agorava.empireavenue.service.PortfolioService#getBasePortfolio(String,int,java.lang.Integer);
     *
     */
    PortfolioResponse   getBasePortfolio(int page,Integer maxresults);



    /**
     * Returns the Base Portfolio information for a specific user<br/>
     * <br/>
     *
     * EmpireAvenue :https://api.empireavenue.com/portfolio/base<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @return PortfolioResponse Returns the Base Portfolio information for a specific user.
     * @see org.agorava.empireavenue.service.PortfolioService#getBasePortfolio();
     * @see org.agorava.empireavenue.service.PortfolioService#getBasePortfolio(String)
     * @see org.agorava.empireavenue.service.PortfolioService#getBasePortfolio(int,java.lang.Integer);
     *
     *
     */
    PortfolioResponse   getBasePortfolio(String ticker,int page,Integer maxresults );


    /**
     * Returns the Base Portfolio information for a specific user<br/>
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/portfolio/get<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @return PortfolioResponse Returns the Full Portfolio information for a specific user.
     *
     *
     */
    PortfolioResponse   getFullPortfolio();

    /**
     * Returns the Base Portfolio information for a specific user<br/>
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/portfolio/get<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @return PortfolioResponse Returns the Full Portfolio information for a specific user.
     *
     *
     */
    PortfolioResponse   getFullPortfolio(String ticker);


    /**
     * Returns the Base Portfolio information for a specific user<br/>
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/portfolio/get<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @return PortfolioResponse Returns the Full Portfolio information for a specific user.
     *
     *
     */
    PortfolioResponse   getFullPortfolio(int page,float maxresults);


    /**
     * Returns the Full Portfolio information for a specific user<br/>
     * <br/>
     *
     * EmpireAvenue : https://api.empireavenue.com/portfolio/get<br/>
     * <br/>
     *
     * <b>Rate Limit</b>: User <br/><b>Authentication</b>: Required
     *
     * @return PortfolioResponse Returns the Full Portfolio information for a specific user.
     *
     *
     */
    PortfolioResponse   getFullPortfolio(String ticker,int page,Integer maxresults );

}