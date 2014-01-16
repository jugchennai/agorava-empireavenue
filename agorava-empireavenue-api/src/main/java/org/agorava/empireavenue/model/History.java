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
 *
 * @author Karthikeyan Annamalai <writetokarthikeyan@outlook.com>
 * @since 0.7.0
 *
 */
public class History {

    public History(String date)
    {
        this.date=date;
        
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
   /**
     * @return the dividend
     */
    public float getDividend() {
        return dividend;
    }

    /**
     * @param dividend the dividend to set
     */
    public void setDividend(float dividend) {
        this.dividend = dividend;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

   /**
    * @param date the date to set
    */
   public void setDate(String date) {
        this.date = date;
    }
    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the eav
     */
    public float getEav() {
       return eav;
    }

    /**
     * @param eav the eav to set
     */
    public void setEav(float eav) {
        this.eav = eav;
    }

    /**
     * @return the facebook
     */
    public float getFacebook() {
        return facebook;
    }

    /**
     * @param facebook the facebook to set
     */
    public void setFacebook(float facebook) {
        this.facebook = facebook;
    }

    /**
     * @return the facebookpage
     */
    public float getFacebookpage() {
        return facebookpage;
    }

    /**
     * @param facebookpage the facebookpage to set
     */
    public void setFacebookpage(float facebookpage) {
        this.facebookpage = facebookpage;
    }

    /**
     * @return the flickr
     */
    public float getFlickr() {
        return flickr;
    }

    /**
     * @param flickr the flickr to set
     */
    public void setFlickr(float flickr) {
        this.flickr = flickr;
    }

    /**
     * @return the foursquare
     */
    public float getFoursquare() {
        return foursquare;
    }

    /**
     * @param foursquare the foursquare to set
     */
    public void setFoursquare(float foursquare) {
        this.foursquare = foursquare;
    }

    /**
     * @return the gplus
     */
    public float getGplus() {
        return gplus;
    }

    /**
     * @param gplus the gplus to set
     */
    public void setGplus(float gplus) {
        this.gplus = gplus;
    }

    /**
     * @return the instagram
     */
    public float getInstagram() {
        return instagram;
    }

   /**
     * @param instagram the instagram to set
     */
    public void setInstagram(float instagram) {
        this.instagram = instagram;
    }

    /**
     * @return the linkedin
     */
    public float getLinkedin() {
        return linkedin;
    }
    /**
     * @param linkedin the linkedin to set
     */
    public void setLinkedin(float linkedin) {
        this.linkedin = linkedin;
    }

    /**
     * @return the twitter
     */
    public float getTwitter() {
        return twitter;
    }

    /**
     * @param twitter the twitter to set
     */
    public void setTwitter(float twitter) {
        this.twitter = twitter;
    }

    /**
     * @return the wordpress
     */
    public float getWordpress() {
        return wordpress;
    }

    /**
     * @param wordpress the wordpress to set
     */
    public void setWordpress(float wordpress) {
        this.wordpress = wordpress;
    }

  /**
     * @return the youtube
     */
    public float getYoutube() {
        return youtube;
    }

    /**
     * @param youtube the youtube to set
    */
    public void setYoutube(float youtube) {
        this.youtube = youtube;
    }

    /**
     * @return the shares
     */
    public int getShares() {
        return shares;
    }

    /**
     * @param shares the shares to set
     */
    public void setShares(int shares) {
        this.shares = shares;
    }

    /**
     * @return the type
     */
    public String getType() {
       return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the fullName
    */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the smPortrait
     */
    public String getSmPortrait() {
        return smPortrait;
    }

    /**
    * @param smPortrait the smPortrait to set
     */
    public void setSmPortrait(String smPortrait) {
        this.smPortrait = smPortrait;
    }

    /**
     * @return the ticker
    */
    public String getTicker() {
        return ticker;
    }

    /**
     * @param ticker the ticker to set
     */
    public void setTicker(String ticker) {
        this.ticker = ticker;
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
