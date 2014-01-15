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

  /*  @JsonProperty("sm_portrait")
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
    private int maxShares;*/

}
