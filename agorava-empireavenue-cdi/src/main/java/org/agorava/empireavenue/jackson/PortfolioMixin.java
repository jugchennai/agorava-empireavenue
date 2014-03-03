package org.agorava.empireavenue.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * @author Karthikeyan Annamalai <writetokarthikeyan@outlfullNameook.com>
 * @since 0.7.0
 */

@JsonTypeName("data")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PortfolioMixin {

    @JsonCreator
    PortfolioMixin(@JsonProperty("full_name")String fullName,@JsonProperty("last_trade")float lastTrade,@JsonProperty("close")float close,@JsonProperty("ticker")String ticker)
    {

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




    public String getFullName() {
        return fullName;
    }

    public float getLastTrade() {
        return lastTrade;
    }

    public float getClose() {
        return close;
    }

    public String getTicker() {
        return ticker;
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

    public String getSmPortrait() {
        return smPortrait;
    }

    public String getLgPortrait() {
        return lgPortrait;
    }

    public String getLocation() {
        return location;
    }

    public String getCountry() {
        return country;
    }

    public float getYesterdayLowest() {
        return yesterdayLowest;
    }

    public float getYesterdayHighest() {
        return yesterdayHighest;
    }

    public int getOutstandingShares() {
        return outstandingShares;
    }

    public float getPortfolioValue() {
        return portfolioValue;
    }

    public float getYesterdayEarnings() {
        return yesterdayEarnings;
    }

    public int getShares() {
        return shares;
    }

    public int getLastBuyShares() {
        return lastBuyShares;
    }

    public String getLastBuy() {
        return lastBuy;
    }

    public int getYourSharesHeld() {
        return yourSharesHeld;
    }

    public int getMaxShares() {
        return maxShares;
    }






}
