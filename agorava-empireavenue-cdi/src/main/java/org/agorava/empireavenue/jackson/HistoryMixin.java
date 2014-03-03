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

abstract class HistoryMixin {

    @JsonCreator
    HistoryMixin(@JsonProperty("date") String date) {
    }


    @JsonProperty("dividend")
    private float dividend;
    @JsonProperty("price")
    private float price;
    @JsonProperty("eav")
    private float eav;
    @JsonProperty("facebook")
    private float facebook;
    @JsonProperty("facebookpage")
    private float facebookpage;
    @JsonProperty("flickr")
    private float flickr;
    @JsonProperty("foursquare")
    private float foursquare;
    @JsonProperty("gplus")
    private float gplus;
    @JsonProperty("instagram")
    private float instagram;
    @JsonProperty("linkedin")
    private float linkedin;
    @JsonProperty("twitter")
    private float twitter;
    @JsonProperty("wordpress")
    private float wordpress;
    @JsonProperty("youtube")
    private float youtube;
    @JsonProperty("shares")
    private int shares;
    @JsonProperty("type")
    private String type; // only buy or sell
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("sm_portrait")
    private String smPortrait;
    @JsonProperty("ticker")
    private String ticker;


    @JsonProperty("dividend")
    abstract float getDividend();

    @JsonProperty("date")
    abstract String getDate();

    @JsonProperty("price")
    abstract float getPrice();

    @JsonProperty("eav")
    abstract float getEav();

    @JsonProperty("facebook")
    abstract float getFacebook();

    @JsonProperty("facebookpage")
    abstract float getFacebookpage();

    @JsonProperty("flickr")
    abstract float getFlickr();

    @JsonProperty("foursquare")
    abstract float getFoursquare();

    @JsonProperty("gplus")
    abstract float getGplus();

    @JsonProperty("instagram")
    abstract float getInstagram() ;

    @JsonProperty("linkedin")
    abstract float getLinkedin() ;

    @JsonProperty("twitter")
    abstract float getTwitter() ;

    @JsonProperty("wordpress")
    abstract float getWordpress();

    @JsonProperty("youtube")
    abstract float getYoutube();

    @JsonProperty("shares")
    abstract int getShares() ;

    @JsonProperty("type")
    abstract String getType();

    @JsonProperty("full_name")
    abstract String getFullName() ;

    @JsonProperty("sm_portrait")
    abstract String getSmPortrait() ;

    @JsonProperty("ticker")
    abstract String getTicker();

}
