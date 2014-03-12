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
public class Lists {

    public Lists() {
    }

    private String listTypeId; //"friends","watch","recommend_buy","private","favourite"
    private String title;
    private int isPrivate; // 1- Yes
    private int allowPrivacyControl; // 1- Yes
    private int maxUsers; // 1- Yes
    private int userCount; // 1- Yes
    private String ticker;
    private String fullName;
    private String location;
    private String country;
    private int outstandingShares;
    private float change;
    private float lastTrade;
    private float close;
    private String smPortrait;
    private String lgPortrait;

    public String getListTypeId() {
        return listTypeId;
    }

    public String getTitle() {
        return title;
    }

    public int getIsPrivate() {
        return isPrivate;
    }

    public int getAllowPrivacyControl() {
        return allowPrivacyControl;
    }

    public int getMaxUsers() {
        return maxUsers;
    }

    public int getUserCount() {
        return userCount;
    }

    public String getTicker() {
        return ticker;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLocation() {
        return location;
    }

    public String getCountry() {
        return country;
    }

    public int getOutstandingShares() {
        return outstandingShares;
    }

    public float getChange() {
        return change;
    }

    public float getLastTrade() {
        return lastTrade;
    }

    public float getClose() {
        return close;
    }

    public String getSmPortrait() {
        return smPortrait;
    }

    public String getLgPortrait() {
        return lgPortrait;
    }


    @Override
    public String toString() {

        return new StringBuffer().append("Lists [").append(ticker)
                .append(",").append(fullName).append(",").append(country)
                .append(",").append(location)
                .append(",").append(outstandingShares)
                .append("];").toString();
    }


}
