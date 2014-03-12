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
package org.agorava.empireavenue.model;


/**
 * @author Karthikeyan Annamalai
 * @since 0.7.0
 */
public class History {

    public History(String date) {
        this.date = date;

    }

    private float dividend;
    private String date;
    private float price;
    private float eav;
    private float facebook;
    private float facebookpage;
    private float flickr;
    private float foursquare;
    private float gplus;
    private float instagram;
    private float linkedin;
    private float twitter;
    private float wordpress;
    private float youtube;
    private int shares;
    private String type; // only buy or sell
    private String fullName;
    private String smPortrait;
    private String ticker;

    public float getYoutube() {
        return youtube;
    }

    public float getDividend() {
        return dividend;
    }

    public String getDate() {
        return date;
    }

    public float getPrice() {
        return price;
    }

    public float getEav() {
        return eav;
    }

    public float getFacebook() {
        return facebook;
    }

    public float getFacebookpage() {
        return facebookpage;
    }

    public float getFlickr() {
        return flickr;
    }

    public float getFoursquare() {
        return foursquare;
    }

    public float getGplus() {
        return gplus;
    }

    public float getInstagram() {
        return instagram;
    }

    public float getLinkedin() {
        return linkedin;
    }

    public float getTwitter() {
        return twitter;
    }

    public float getWordpress() {
        return wordpress;
    }

    public int getShares() {
        return shares;
    }

    public String getType() {
        return type;
    }

    public String getFullName() {
        return fullName;
    }

    public String getSmPortrait() {
        return smPortrait;
    }

    public String getTicker() {
        return ticker;
    }

    @Override
    public String toString() {

        return new StringBuffer().append("History [").append(date)
                .append(",").append(fullName)
                .append(",").append(ticker).append(",").append(shares)
                .append(",").append(price)
                .append("];").toString();
    }

}
