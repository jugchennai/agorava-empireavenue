package org.agorava.empireavenue.model;

/**
 *
 * @author Karthikeyan Annamalai <writetokarthikeyan@outlook.com>
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


    public float getFlickrScore() {
        return flickrScore;
    }

    public void setFlickrScore(float flickrScore) {
        this.flickrScore = flickrScore;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getLastTrade() {
        return lastTrade;
    }

    public void setLastTrade(float lastTrade) {
        this.lastTrade = lastTrade;
    }

    public float getClose() {
        return close;
    }

    public void setClose(float close) {
        this.close = close;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public float getEavScore() {
        return eavScore;
    }

    public void setEavScore(float eavScore) {
        this.eavScore = eavScore;
    }

    public float getTwitterScore() {
        return twitterScore;
    }

    public void setTwitterScore(float twitterScore) {
        this.twitterScore = twitterScore;
    }

    public float getFacebookScore() {
        return facebookScore;
    }

    public void setFacebookScore(float facebookScore) {
        this.facebookScore = facebookScore;
    }

    public float getFacebookpageScore() {
        return facebookpageScore;
    }

    public void setFacebookpageScore(float facebookpageScore) {
        this.facebookpageScore = facebookpageScore;
    }

    public float getYoutubeScore() {
        return youtubeScore;
    }

    public void setYoutubeScore(float youtubeScore) {
        this.youtubeScore = youtubeScore;
    }

    public float getLinkedinScore() {
        return linkedinScore;
    }

    public void setLinkedinScore(float linkedinScore) {
        this.linkedinScore = linkedinScore;
    }

    public float getFoursquareScore() {
        return foursquareScore;
    }

    public void setFoursquareScore(float foursquareScore) {
        this.foursquareScore = foursquareScore;
    }

    public float getInstagramScore() {
        return instagramScore;
    }

    public void setInstagramScore(float instagramScore) {
        this.instagramScore = instagramScore;
    }

    public float getWordpressScore() {
        return wordpressScore;
    }

    public void setWordpressScore(float wordpressScore) {
        this.wordpressScore = wordpressScore;
    }

    public float getGplusScore() {
        return gplusScore;
    }

    public void setGplusScore(float gplusScore) {
        this.gplusScore = gplusScore;
    }

    public String getSmPortrait() {
        return smPortrait;
    }

    public void setSmPortrait(String smPortrait) {
        this.smPortrait = smPortrait;
    }

    public String getLgPortrait() {
        return lgPortrait;
    }

    public void setLgPortrait(String lgPortrait) {
        this.lgPortrait = lgPortrait;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getYesterdayLowest() {
        return yesterdayLowest;
    }

    public void setYesterdayLowest(float yesterdayLowest) {
        this.yesterdayLowest = yesterdayLowest;
    }

    public float getYesterdayHighest() {
        return yesterdayHighest;
    }

    public void setYesterdayHighest(float yesterdayHighest) {
        this.yesterdayHighest = yesterdayHighest;
    }

    public int getOutstandingShares() {
        return outstandingShares;
    }

    public void setOutstandingShares(int outstandingShares) {
        this.outstandingShares = outstandingShares;
    }

    public float getPortfolioValue() {
        return portfolioValue;
    }

    public void setPortfolioValue(float portfolioValue) {
        this.portfolioValue = portfolioValue;
    }

    public float getYesterdayEarnings() {
        return yesterdayEarnings;
    }

    public void setYesterdayEarnings(float yesterdayEarnings) {
        this.yesterdayEarnings = yesterdayEarnings;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public int getLastBuyShares() {
        return lastBuyShares;
    }

    public void setLastBuyShares(int lastBuyShares) {
        this.lastBuyShares = lastBuyShares;
    }

    public String getLastBuy() {
        return lastBuy;
    }

    public void setLastBuy(String lastBuy) {
        this.lastBuy = lastBuy;
    }

    public int getYourSharesHeld() {
        return yourSharesHeld;
    }

    public void setYourSharesHeld(int yourSharesHeld) {
        this.yourSharesHeld = yourSharesHeld;
    }

    public int getMaxShares() {
        return maxShares;
    }

    public void setMaxShares(int maxShares) {
        this.maxShares = maxShares;
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

