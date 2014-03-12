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
 * @author Karthikeyan Annamalai
 * @since 0.7.0
 */
public class Leaders {

    protected Leaders(String ticker,
                      String fullName, String country, String location) {
        this.ticker = ticker;
        this.fullName = fullName;
        this.country = country;
        this.location = location;
        this.ticker = ticker;
    }

    private int ranking;
    private int oldRanking;
    private String ticker;
    private String fullName;
    private float lastTrade;
    private float close;
    private String smPortrait;
    private String lgPortrait;
    private int outstandingShares;
    private String country;
    private String location;
    private int maxShare;

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

    public int getRanking() {
        return ranking;
    }

    public int getOldRanking() {
        return oldRanking;
    }

    public String getTicker() {
        return ticker;
    }

    public String getFullName() {
        return fullName;
    }

    public float getLastTrade() {
        return lastTrade;
    }

    public float getClose() {
        return close;
    }

    public String getSmPortrait() {
        return smPortrait;
    }

    public String getLgPortrait() {
        return lgPortrait;
    }

    public int getOutstandingShares() {
        return outstandingShares;
    }

    public String getCountry() {
        return country;
    }

    public String getLocation() {
        return location;
    }

    public int getMaxShare() {
        return maxShare;
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

    public float getAmount() {
        return amount;
    }

    @Override
    public String toString() {

        return new StringBuffer().append("Leaders [").append(ticker)
                .append(",").append(ranking)
                .append(",").append(fullName).append(",").append(country)
                .append(",").append(location)
                .append(",").append(oldRanking)
                .append(",").append(maxShare)
                .append(",").append(outstandingShares)
                .append("];").toString();
    }
}
