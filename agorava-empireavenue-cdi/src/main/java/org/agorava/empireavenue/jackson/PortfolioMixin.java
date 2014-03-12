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
abstract class PortfolioMixin {

    @JsonCreator
    PortfolioMixin(@JsonProperty("full_name") String fullName, @JsonProperty("last_trade") float lastTrade, @JsonProperty("close") float close, @JsonProperty("ticker") String ticker) {

    }

    @JsonProperty("eav_score")
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

    @JsonProperty("sm_portrait")
    private String smPortrait;
    @JsonProperty("lg_portrait")
    private String lgPortrait;
    @JsonProperty("location")
    private String location;
    @JsonProperty("country")
    private String country;
    @JsonProperty("yesterday_lowest")
    private float yesterdayLowest;
    @JsonProperty("yesterday_highest")
    private float yesterdayHighest;
    @JsonProperty("outstanding_shares")
    private int outstandingShares;
    @JsonProperty("portfolio_value")
    private float portfolioValue;
    @JsonProperty("yesterday_earnings")
    private float yesterdayEarnings;

    //The following will ONLY be returned for the portfolio of the Authenticated User

    @JsonProperty("shares")
    private int shares;
    @JsonProperty("last_buy_shares")
    private int lastBuyShares;
    @JsonProperty("last_buy")
    private String lastBuy;
    @JsonProperty("your_shares_held")
    private int yourSharesHeld;
    @JsonProperty("max_shares")
    private int maxShares;


    @JsonProperty("full_name")
    abstract String getFullName();

    @JsonProperty("last_trade")
    abstract float getLastTrade();

    @JsonProperty("close")
    abstract float getClose();

    @JsonProperty("ticker")
    abstract String getTicker();

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
    abstract String getSmPortrait();

    @JsonProperty("lg_portrait")
    abstract String getLgPortrait();

    @JsonProperty("location")
    abstract String getLocation();

    @JsonProperty("country")
    abstract String getCountry();

    @JsonProperty("yesterday_lowest")
    abstract float getYesterdayLowest();

    @JsonProperty("yesterday_highest")
    abstract float getYesterdayHighest();

    @JsonProperty("outstanding_shares")
    abstract int getOutstandingShares();

    @JsonProperty("portfolio_value")
    abstract float getPortfolioValue();

    @JsonProperty("yesterday_earnings")
    abstract float getYesterdayEarnings();

    @JsonProperty("shares")
    abstract int getShares();

    @JsonProperty("last_buy_shares")
    abstract int getLastBuyShares();

    @JsonProperty("last_buy")
    abstract String getLastBuy();

    @JsonProperty("your_shares_held")
    abstract int getYourSharesHeld();

    @JsonProperty("max_shares")
    abstract int getMaxShares();


}
