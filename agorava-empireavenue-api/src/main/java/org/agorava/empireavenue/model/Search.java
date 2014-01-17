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
 * @author Karthikeyan Annamalai <writetokarthikeyan@outlook.com>
 * @since 0.7.0
 */
public class Search {

    protected Search() {
    }



    private String ticker;
    private String fullName;
    private float lastTrade;
    private float close;
    private String smPortrait;
    private String lgPortrait;
    private int outstandingShares;
    private String country;
    private String location;
    private String created;
    private int maxShares;
    private String tradingStatus;

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
    private float amount;


    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
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

    public int getOutstandingShares() {
        return outstandingShares;
    }

    public void setOutstandingShares(int outstandingShares) {
        this.outstandingShares = outstandingShares;
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

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public int getMaxShares() {
        return maxShares;
    }

    public void setMaxShares(int maxShares) {
        this.maxShares = maxShares;
    }

    public String getTradingStatus() {
        return tradingStatus;
    }

    public void setTradingStatus(String tradingStatus) {
        this.tradingStatus = tradingStatus;
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

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {

        return new StringBuffer().append("Search [ Full Name :").append(fullName)
                .append(", Ticker :").append(ticker)
                .append("];").toString();
    }


}
