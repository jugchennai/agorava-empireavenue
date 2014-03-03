package org.agorava.empireavenue.model;

/**
 *
 * @author Karthikeyan Annamalai  
 * @since 0.7.0
 *
 */



public class Portfolio {

    public Portfolio(String fullName,float lastTrade,float close,String ticker)
    {

        this.fullName=fullName;
        this.lastTrade=lastTrade;
        this.close=close;
        this.ticker=ticker;
    }
    private String fullName;
    private float lastTrade;
    private float close;
    private String ticker;

    private float eavScore;
    private float flickrScore;
    private float twitterScore;
    private float facebookScore;
    private float facebookpageScore;
    private float youtubeScore;
    private float linkedinScore;
    private float foursquareScore;
    private float instagramScore;
    private float wordpressScore;
    private float gplusScore;

    private String smPortrait;
    private String lgPortrait;
    private String location;
    private String country;
    private float yesterdayLowest;

    private float yesterdayHighest;
    private int outstandingShares;
    private float portfolioValue;
    private float yesterdayEarnings;

    //The following will ONLY be returned for the portfolio of the Authenticated User

    private int shares;
    private int lastBuyShares;
    private String lastBuy;
    private int yourSharesHeld;
    private int maxShares;


    public String getFullName() {
        return fullName;
    }

    public float getLastTrade() {
        return lastTrade;
    }

    public float getClose() {
        return close;
    }

    public String getTicker() {
        return ticker;
    }

    public float getEavScore() {
        return eavScore;
    }

    public float getFlickrScore() {
        return flickrScore;
    }

    public float getTwitterScore() {
        return twitterScore;
    }

    public float getFacebookScore() {
        return facebookScore;
    }

    public float getFacebookpageScore() {
        return facebookpageScore;
    }

    public float getYoutubeScore() {
        return youtubeScore;
    }

    public float getLinkedinScore() {
        return linkedinScore;
    }

    public float getFoursquareScore() {
        return foursquareScore;
    }

    public float getInstagramScore() {
        return instagramScore;
    }

    public float getWordpressScore() {
        return wordpressScore;
    }

    public float getGplusScore() {
        return gplusScore;
    }

    public String getSmPortrait() {
        return smPortrait;
    }

    public String getLgPortrait() {
        return lgPortrait;
    }

    public String getLocation() {
        return location;
    }

    public String getCountry() {
        return country;
    }

    public float getYesterdayLowest() {
        return yesterdayLowest;
    }

    public float getYesterdayHighest() {
        return yesterdayHighest;
    }

    public int getOutstandingShares() {
        return outstandingShares;
    }

    public float getPortfolioValue() {
        return portfolioValue;
    }

    public float getYesterdayEarnings() {
        return yesterdayEarnings;
    }

    public int getShares() {
        return shares;
    }

    public int getLastBuyShares() {
        return lastBuyShares;
    }

    public String getLastBuy() {
        return lastBuy;
    }

    public int getYourSharesHeld() {
        return yourSharesHeld;
    }

    public int getMaxShares() {
        return maxShares;
    }

    @Override
    public String toString() {

        return new StringBuffer().append("Portfolio [ Name :")
                .append(fullName)
                .append(", Ticker :").append(ticker)
                .append(", Shares :").append(shares)
                .append(",Close   :").append(close)
                .append("];").toString();    }

}

