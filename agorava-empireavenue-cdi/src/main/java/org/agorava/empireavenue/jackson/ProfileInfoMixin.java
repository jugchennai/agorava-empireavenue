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
 * @author Rajmahendra Hegde
 * @since 0.7.0
 */
@JsonTypeName("data")
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ProfileInfoMixin {

    @JsonCreator
    ProfileInfoMixin(@JsonProperty("id")
                     String id, @JsonProperty("ticker")
                     String ticker, @JsonProperty("first_name")
                     String firstName,
                     @JsonProperty("last_name")
                     String lastName,
                     @JsonProperty("full_name")
                     String fullName, @JsonProperty("joined")
                     String joined,
                     @JsonProperty("country")
                     String country, @JsonProperty("location")
                     String location) {
    }

    @JsonProperty("site_name")
    private String siteName;
    @JsonProperty("site_url")
    private String siteUrl;

    @JsonProperty("type")
    private String type;
    @JsonProperty("max_share")
    private int maxShare;
    @JsonProperty("commission")
    private float commission;
    @JsonProperty("last_trade")
    private float lastTrade;
    @JsonProperty("outstanding_shares")
    private int outstandingShares;
    @JsonProperty("total_shares")
    private int totalShares;
    @JsonProperty("close")
    private float close;
    @JsonProperty("close_money")
    private float closeMoney;
    @JsonProperty("open")
    private float open;
    @JsonProperty("yesterday_lowest")
    private float yesterdayLowest;
    @JsonProperty("yesterday_highest")
    private float yesterdayHighest;
    @JsonProperty("yesterday_change")
    private float yesterdayChange;
    @JsonProperty("volume")
    private int volume;
    @JsonProperty("sm_portrait")
    private String smPortrait;
    @JsonProperty("lg_portrait")
    private String lgPortrait;
    @JsonProperty("current_status")
    private String currentStatus;
    @JsonProperty("current_status_set")
    private String currentStatusSet;
    @JsonProperty("market_last_close")
    private String marketLastClose;
    @JsonProperty("market_last_open")
    private String marketLastOpen;
    @JsonProperty("trading_status")
    private String tradingStatus;
    @JsonProperty("investments_count")
    private int investmentsCount;
    @JsonProperty("shareholders_count")
    private int shareholdersCount;
    @JsonProperty("thumbs_up_count")
    private int thumbsUpCount;
    @JsonProperty("thumbs_down_count")
    private int thumbsDowncount;
    @JsonProperty("shares_owner_count")
    private int sharesOwnedCount;
    @JsonProperty("listed_count")
    private int listedCount;
    @JsonProperty("recommended_count")
    private int recommendedCount;
    @JsonProperty("held_shares")
    private int heldShares;
    @JsonProperty("avg_div_per_share")
    private float avgDivPerShare;

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


    @JsonProperty("ticker")
    abstract String getTicker();

    @JsonProperty("first_name")
    abstract String getFirstName();

    @JsonProperty("site_name")
    abstract String getSiteName();

    @JsonProperty("site_url")
    abstract String getSiteUrl();

    @JsonProperty("last_name")
    abstract String getLastName();

    @JsonProperty("full_name")
    abstract String getFullName();

    @JsonProperty("joined")
    abstract String getJoined();

    @JsonProperty("country")
    abstract String getCountry();

    @JsonProperty("location")
    abstract String getLocation();

    @JsonProperty("type")
    abstract String getType();

    @JsonProperty("max_share")
    abstract int getMaxShare();

    @JsonProperty("commission")
    abstract float getCommission();

    @JsonProperty("last_trade")
    abstract float getLastTrade();

    @JsonProperty("outstanding_shares")
    abstract int getOutstandingShares();

    @JsonProperty("total_shares")
    abstract int getTotalShares();

    @JsonProperty("close")
    abstract float getClose();

    @JsonProperty("close_money")
    abstract float getCloseMoney();

    @JsonProperty("open")
    abstract float getOpen();

    @JsonProperty("yesterday_lowest")
    abstract float getYesterdayLowest();

    @JsonProperty("yesterday_highest")
    abstract float getYesterdayHighest();

    @JsonProperty("yesterday_change")
    abstract float getYesterdayChange();

    @JsonProperty("volume")
    abstract int getVolume();

    @JsonProperty("sm_portrait")
    abstract String getSmPortrait();

    @JsonProperty("lg_portrait")
    abstract String getLgPortrait();

    @JsonProperty("current_status")
    abstract String getCurrentStatus();

    @JsonProperty("current_status_set")
    abstract String getCurrentStatusSet();

    @JsonProperty("market_last_close")
    abstract String getMarketLastClose();

    @JsonProperty("market_last_open")
    abstract String getMarketLastOpen();

    @JsonProperty("trading_status")
    abstract String getTradingStatus();

    @JsonProperty("investments_count")
    abstract int getInvestmentsCount();

    @JsonProperty("shareholders_count")
    abstract int getShareholdersCount();

    @JsonProperty("thumbs_up_count")
    abstract int getThumbsUpCount();

    @JsonProperty("thumbs_down_count")
    abstract int getThumbsDowncount();

    @JsonProperty("shares_owner_count")
    abstract int getSharesOwnedCount();

    @JsonProperty("listed_count")
    abstract int getListedCount();

    @JsonProperty("recommended_count")
    abstract int getRecommendedCount();

    @JsonProperty("held_shares")
    abstract int getHeldShares();

    @JsonProperty("avg_div_per_share")
    abstract float getAvgDivPerShare();

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

    @JsonProperty("sm_portrait")
    abstract String getProfileImageUrl();


}
