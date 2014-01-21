package org.agorava.empireavenue.response;

import org.agorava.empireavenue.model.Portfolio;

import java.util.List;

/**
 * @author Karthikeyan Annamalai  
 * @since 0.7.0
 */
public class PortfolioResponse extends Response<Portfolio>{

    public PortfolioResponse()
    {

    }

    public Portfolio getPortfolioInfo() {
        return retrieveData();
    }

    public List<Portfolio> getAllPortfolioInfo() {
        return retrieveAllData();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
