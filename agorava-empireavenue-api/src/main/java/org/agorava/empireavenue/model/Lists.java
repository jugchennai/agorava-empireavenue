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
 * @author Karthikeyan Annamalai <writetokarthikeyan@outlook.com>
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

    public void setListTypeId(String listTypeId) {
        this.listTypeId = listTypeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(int isPrivate) {
        this.isPrivate = isPrivate;
    }

    public int getAllowPrivacyControl() {
        return allowPrivacyControl;
    }

    public void setAllowPrivacyControl(int allowPrivacyControl) {
        this.allowPrivacyControl = allowPrivacyControl;
    }

    public int getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getOutstandingShares() {
        return outstandingShares;
    }

    public void setOutstandingShares(int outstandingShares) {
        this.outstandingShares = outstandingShares;
    }

    public float getChange() {
        return change;
    }

    public void setChange(float change) {
        this.change = change;
    }

    public float getLastTrade() {
        return lastTrade;
    }

    public void setLastTrade(float lastTrade) {
        this.lastTrade = lastTrade;
    }

    public float getClose() {
        return close;
    }

    public void setClose(float close) {
        this.close = close;
    }

    public String getSmPortrait() {
        return smPortrait;
    }

    public void setSmPortrait(String smPortrait) {
        this.smPortrait = smPortrait;
    }

    public String getLgPortrait() {
        return lgPortrait;
    }

    public void setLgPortrait(String lgPortrait) {
        this.lgPortrait = lgPortrait;
    }




}
