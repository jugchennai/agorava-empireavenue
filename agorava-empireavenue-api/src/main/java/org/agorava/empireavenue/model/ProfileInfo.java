/*
 * Copyright 2013 Agorava.
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
package org.agorava.empireavenue.model;

import org.agorava.spi.UserProfile;

/**
 * 
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
@SuppressWarnings("serial")
public class ProfileInfo extends UserProfile {

    private String ticker;
    private String firstName;
    private String siteName;
    private String siteUrl;
    private String lastName;
    private String fullName;
    private String joined;
    private String country;
    private String location;
    private String type;
    private int maxShare;
    private float commission;
    private float lastTrade;
    private int outstandingShares;
    private int totalShares;
    private float close;
    private float closeMoney;
    private float open;
    private float yesterdayLowest;
    private float yesterdayHighest;
    private float yesterdayChange;
    private int volume;
    private String smPortrait;
    private String lgPortrait;
    private String currentStatus;
    private String currentStatusSet;
    private String marketLastClose;
    private String marketLastOpen;
    private String tradingStatus;
    private int investmentsCount;
    private int shareholdersCount;
    private int thumbsUpCount;
    private int thumbsDowncount;
    private int sharesOwnedCount;
    private int listedCount;
    private int recommendedCount;
    private int heldShares;
    private float avgDivPerShare;

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

    public ProfileInfo(String id, String ticker, String firstName, String lastName,
            String fullName, String joined, String country, String location) {
        super(id);
        this.ticker = ticker;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.joined = joined;
        this.country = country;
        this.location = location;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJoined() {
        return joined;
    }

    public void setJoined(String joined) {
        this.joined = joined;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxShare() {
        return maxShare;
    }

    public void setMaxShare(int maxShare) {
        this.maxShare = maxShare;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    public float getLastTrade() {
        return lastTrade;
    }

    public void setLastTrade(float lastTrade) {
        this.lastTrade = lastTrade;
    }

    public int getOutstandingShares() {
        return outstandingShares;
    }

    public void setOutstandingShares(int outstandingShares) {
        this.outstandingShares = outstandingShares;
    }

    public int getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(int totalShares) {
        this.totalShares = totalShares;
    }

    public float getClose() {
        return close;
    }

    public void setClose(float close) {
        this.close = close;
    }

    public float getCloseMoney() {
        return closeMoney;
    }

    public void setCloseMoney(float closeMoney) {
        this.closeMoney = closeMoney;
    }

    public float getOpen() {
        return open;
    }

    public void setOpen(float open) {
        this.open = open;
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

    public float getYesterdayChange() {
        return yesterdayChange;
    }

    public void setYesterdayChange(float yesterdayChange) {
        this.yesterdayChange = yesterdayChange;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
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

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getCurrentStatusSet() {
        return currentStatusSet;
    }

    public void setCurrentStatusSet(String currentStatusSet) {
        this.currentStatusSet = currentStatusSet;
    }

    public String getMarketLastClose() {
        return marketLastClose;
    }

    public void setMarketLastClose(String marketLastClose) {
        this.marketLastClose = marketLastClose;
    }

    public String getMarketLastOpen() {
        return marketLastOpen;
    }

    public void setMarketLastOpen(String marketLastOpen) {
        this.marketLastOpen = marketLastOpen;
    }

    public String getTradingStatus() {
        return tradingStatus;
    }

    public void setTradingStatus(String tradingStatus) {
        this.tradingStatus = tradingStatus;
    }

    public int getInvestmentsCount() {
        return investmentsCount;
    }

    public void setInvestmentsCount(int investmentsCount) {
        this.investmentsCount = investmentsCount;
    }

    public int getShareholdersCount() {
        return shareholdersCount;
    }

    public void setShareholdersCount(int shareholdersCount) {
        this.shareholdersCount = shareholdersCount;
    }

    public int getThumbsUpCount() {
        return thumbsUpCount;
    }

    public void setThumbsUpCount(int thumbsUpCount) {
        this.thumbsUpCount = thumbsUpCount;
    }

    public int getThumbsDowncount() {
        return thumbsDowncount;
    }

    public void setThumbsDowncount(int thumbsDowncount) {
        this.thumbsDowncount = thumbsDowncount;
    }

    public int getSharesOwnedCount() {
        return sharesOwnedCount;
    }

    public void setSharesOwnedCount(int sharesOwnedCount) {
        this.sharesOwnedCount = sharesOwnedCount;
    }

    public int getListedCount() {
        return listedCount;
    }

    public void setListedCount(int listedCount) {
        this.listedCount = listedCount;
    }

    public int getRecommendedCount() {
        return recommendedCount;
    }

    public void setRecommendedCount(int recommendedCount) {
        this.recommendedCount = recommendedCount;
    }

    public int getHeldShares() {
        return heldShares;
    }

    public void setHeldShares(int heldShares) {
        this.heldShares = heldShares;
    }

    public float getAvgDivPerShare() {
        return avgDivPerShare;
    }

    public void setAvgDivPerShare(float avgDivPerShare) {
        this.avgDivPerShare = avgDivPerShare;
    }

    public float getEavScore() {
        return eavScore;
    }

    public void setEavScore(float eavScore) {
        this.eavScore = eavScore;
    }

    public float getFlickrScore() {
        return flickrScore;
    }

    public void setFlickrScore(float flickrScore) {
        this.flickrScore = flickrScore;
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

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public String getProfileImageUrl() {
        return lgPortrait;
    }

    @Override
    public String toString() {

        return new StringBuffer().append("ProfileInfo [").append(ticker + ",").append(firstName + ",")
                .append(lastName + ",")
                .append(fullName + ",")
                .append(joined + ",")
                .append(country + ",")
                .append(totalShares + ",")
                .append(location).append("];")
                .toString();
    }

}
