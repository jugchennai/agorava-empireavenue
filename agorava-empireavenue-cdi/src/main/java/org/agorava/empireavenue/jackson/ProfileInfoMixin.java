package org.agorava.empireavenue.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

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

}
