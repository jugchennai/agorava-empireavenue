package org.agorava.empireavenue.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("data")
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class CountMixin {

    @JsonCreator
    CountMixin(@JsonProperty("ticker")
    String ticker,
            @JsonProperty("following")
            int following,
            @JsonProperty("followers")
            int followers,
            @JsonProperty("shareholders")
            int shareholders,
            @JsonProperty("portfolio")
            int portfolio,
            @JsonProperty("shares_owned")
            int sharesOwned,
            @JsonProperty("total_thumbs_up")
            int totalThumbsUp,
            @JsonProperty("total_thumbs_down")
            int totalThumbsDown,
            @JsonProperty("listed")
            int listed,
            @JsonProperty("recommended")
            int recommended) {
    }

    @JsonProperty("ticker")
    abstract String getTicker();
    @JsonProperty("following")
    abstract int getFollowing();
    @JsonProperty("followers")
    abstract int getFollowers();
    @JsonProperty("shareholders")
    abstract int getShareholders();
    @JsonProperty("portfolio")
    abstract int getPortfolio();
    @JsonProperty("shares_owned")
    abstract int getSharesOwned();
    @JsonProperty("total_thumbs_up")
    abstract int getTotalThumbsUp();
    @JsonProperty("total_thumbs_down")
    abstract int getTotalThumbsDown();
    @JsonProperty("listed")
    abstract int getListed();
    @JsonProperty("recommended")
    abstract int getRecommended();

}
