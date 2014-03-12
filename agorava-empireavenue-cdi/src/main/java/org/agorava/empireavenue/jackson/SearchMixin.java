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

package org.agorava.empireavenue.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * @author Karthikeyan Annamalai
 * @since 0.7.0
 */

@JsonTypeName("data")
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class SearchMixin {

    @JsonCreator
    SearchMixin(@JsonProperty("ticker") String ticker) {
    }

    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("last_trade")
    private float lastTrade;
    @JsonProperty("close")
    private float close;
    @JsonProperty("sm_portrait")
    private String smPortrait;
    @JsonProperty("lg_portrait")
    private String lgPortrait;
    @JsonProperty("outstanding_shares")
    private int outstandingShares;
    @JsonProperty("country")
    private String country;
    @JsonProperty("location")
    private String location;
    @JsonProperty("created")
    private String created;
    @JsonProperty("max_shares")
    private int maxShares;
    @JsonProperty("trading_status")
    private int tradingStatus;
    @JsonProperty("eva_score")
    private float eavScore;
    @JsonProperty("flickr_score")
    private float flickrScore;
    @JsonProperty("twitter_score")
    private float twitterScore;
    @JsonProperty("facebook_score")
    private float facebookScore;
    @JsonProperty("facebookpage_score")
    private float facebookpageScore;
    @JsonProperty("youtube_score")
    private float youtubeScore;
    @JsonProperty("linkedin_score")
    private float linkedinScore;
    @JsonProperty("foursquare_score")
    private float foursquareScore;
    @JsonProperty("instagram_score")
    private float instagramScore;
    @JsonProperty("wordpress_score")
    private float wordpressScore;
    @JsonProperty("gplus_score")
    private float gplusScore;
    @JsonProperty("amount")
    private float amount;


    @JsonProperty("ticker")
    abstract String getTicker();

    @JsonProperty("full_name")
    abstract String getFullName();

    @JsonProperty("last_trade")
    abstract float getLastTrade();

    @JsonProperty("close")
    abstract float getClose();

    @JsonProperty("sm_portrait")
    abstract String getSmPortrait();

    @JsonProperty("lg_portrait")
    abstract String getLgPortrait();

    @JsonProperty("outstanding_shares")
    abstract int getOutstandingShares();

    @JsonProperty("country")
    abstract String getCountry();

    @JsonProperty("location")
    abstract String getLocation();

    @JsonProperty("created")
    abstract String getCreated();

    @JsonProperty("max_shares")
    abstract int getMaxShares();

    @JsonProperty("trading_status")
    abstract String getTradingStatus();

    @JsonProperty("eva_score")
    abstract float getEavScore();

    @JsonProperty("flickr_score")
    abstract float getFlickrScore();

    @JsonProperty("twitter_score")
    abstract float getTwitterScore();

    @JsonProperty("facebook_score")
    abstract float getFacebookScore();

    @JsonProperty("facebookpage_score")
    abstract float getFacebookpageScore();

    @JsonProperty("youtube_score")
    abstract float getYoutubeScore();

    @JsonProperty("linkedin_score")
    abstract float getLinkedinScore();

    @JsonProperty("foursquare_score")
    abstract float getFoursquareScore();

    @JsonProperty("instagram_score")
    abstract float getInstagramScore();

    @JsonProperty("wordpress_score")
    abstract float getWordpressScore();

    @JsonProperty("gplus_score")
    abstract float getGplusScore();

    @JsonProperty("amount")
    abstract float getAmount();


}
