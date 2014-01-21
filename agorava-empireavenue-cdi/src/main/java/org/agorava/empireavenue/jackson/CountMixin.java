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
*
* @author Rajmahendra Hegde  
* @since 0.7.0
*/
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
