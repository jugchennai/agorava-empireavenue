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
abstract class ListsMixin {

    @JsonCreator
    ListsMixin(  @JsonProperty("list_type_id") String listTypeId,
                 @JsonProperty("title") String title,
                 @JsonProperty("private") int isPrivate,
                 @JsonProperty("allow_privacy_control") int allowPrivacyControl,
                 @JsonProperty("max_users") int maxUsers,
                 @JsonProperty("user_count") int userCount,
                 @JsonProperty("ticker") String ticker,
                 @JsonProperty("full_name") String full_name,
                 @JsonProperty("location") String location,
                 @JsonProperty("country") String country,
                 @JsonProperty("outstanding_shares") int outstandingShares,
                 @JsonProperty("change") float change,
                 @JsonProperty("last_trade") float lastTrade,
                 @JsonProperty("close") float close,
                 @JsonProperty("sm_portrait") String smPortrait,
                 @JsonProperty("lg_portrait") String lgPortrait
            )

    {

    }

    @JsonProperty("list_type_id")
    abstract String getListTypeId();

    @JsonProperty("title")
    abstract String getTitle();

    @JsonProperty("private")
    abstract int getIsPrivate() ;

    @JsonProperty("allow_privacy_control")
    abstract int getAllowPrivacyControl() ;

    @JsonProperty("max_users")
    abstract int getMaxUsers();

    @JsonProperty("user_count")
    abstract int getUserCount() ;

    @JsonProperty("ticker")
    abstract String getTicker() ;

    @JsonProperty("full_name")
    abstract String getFullName() ;

    @JsonProperty("location")
    abstract String getLocation();

    @JsonProperty("country")
    abstract String getCountry() ;

    @JsonProperty("outstanding_shares")
    abstract int getOutstandingShares() ;

    @JsonProperty("change")
    abstract float getChange();

    @JsonProperty("last_trade")
    abstract float getLastTrade() ;

    @JsonProperty("close")
    abstract float getClose() ;

    @JsonProperty("sm_portrait")
    abstract String getSmPortrait() ;

    @JsonProperty("lg_portrait")
    abstract String getLgPortrait();

}
