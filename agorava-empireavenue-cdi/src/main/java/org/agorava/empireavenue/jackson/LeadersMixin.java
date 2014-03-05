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
abstract class LeadersMixin {

    @JsonCreator
    LeadersMixin(@JsonProperty("ticker") String ticker,
                 @JsonProperty("full_name") String fullName,
                 @JsonProperty("country") String country, @JsonProperty("location") String location) {
    }

    @JsonProperty("max_share")
    private int maxShare;
    @JsonProperty("last_trade")
    private float lastTrade;
    @JsonProperty("outstanding_shares")
    private int outstandingShares;
    @JsonProperty("close")
    private float close;
    @JsonProperty("sm_portrait")
    private String smPortrait;
    @JsonProperty("lg_portrait")
    private String lgPortrait;
    @JsonProperty("ranking")
    private int ranking;
    @JsonProperty("old_ranking")
    private int oldRanking;
    @JsonProperty("amount")
    private float amount;


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


    @JsonProperty("ranking")
    abstract int getRanking();

    @JsonProperty("old_ranking")
    abstract int getOldRanking();

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

    @JsonProperty("max_share")
    abstract int getMaxShare();


}
