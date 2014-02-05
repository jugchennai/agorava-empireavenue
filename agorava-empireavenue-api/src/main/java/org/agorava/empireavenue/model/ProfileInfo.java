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
package org.agorava.empireavenue.model;


/**
 * 
 * @author Rajmahendra Hegde  
 * @since 0.7.0
 */
@SuppressWarnings("serial")
public class ProfileInfo {

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
        
        this.ticker = ticker;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.joined = joined;
        this.country = country;
        this.location = location;
    }
    
    public ProfileInfo() {
    	
    }

    public String getTicker() {
        return ticker;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSiteName() {
        return siteName;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getJoined() {
        return joined;
    }

    public String getCountry() {
        return country;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public int getMaxShare() {
        return maxShare;
    }

    public float getCommission() {
        return commission;
    }

    public float getLastTrade() {
        return lastTrade;
    }

    public int getOutstandingShares() {
        return outstandingShares;
    }

    public int getTotalShares() {
        return totalShares;
    }

    public float getClose() {
        return close;
    }

    public float getCloseMoney() {
        return closeMoney;
    }

    public float getOpen() {
        return open;
    }

    public float getYesterdayLowest() {
        return yesterdayLowest;
    }

    public float getYesterdayHighest() {
        return yesterdayHighest;
    }

    public float getYesterdayChange() {
        return yesterdayChange;
    }

    public int getVolume() {
        return volume;
    }

    public String getSmPortrait() {
        return smPortrait;
    }

    public String getLgPortrait() {
        return lgPortrait;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public String getCurrentStatusSet() {
        return currentStatusSet;
    }

    public String getMarketLastClose() {
        return marketLastClose;
    }

    public String getMarketLastOpen() {
        return marketLastOpen;
    }

    public String getTradingStatus() {
        return tradingStatus;
    }

    public int getInvestmentsCount() {
        return investmentsCount;
    }

    public int getShareholdersCount() {
        return shareholdersCount;
    }

    public int getThumbsUpCount() {
        return thumbsUpCount;
    }

    public int getThumbsDowncount() {
        return thumbsDowncount;
    }

    public int getSharesOwnedCount() {
        return sharesOwnedCount;
    }

    public int getListedCount() {
        return listedCount;
    }

    public int getRecommendedCount() {
        return recommendedCount;
    }

    public int getHeldShares() {
        return heldShares;
    }

    public float getAvgDivPerShare() {
        return avgDivPerShare;
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

    @Override
    public String toString() {

        return new StringBuffer().append("ProfileInfo [").append(ticker).append(",").append(firstName).append(",").append(lastName)
                .append(",")
                .append(fullName)
                .append(",")
                .append(joined)
                .append(",")
                .append(country)
                .append(",")
                .append(totalShares)
                .append(",")
                .append(location).append("];")
                .toString();
    }


}
