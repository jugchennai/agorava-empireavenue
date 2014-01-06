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
* @author Rajmahendra Hegde <rajmahendra@gmail.com>
* @since 0.7.0
*/
public class Community {
    
    private int communityId;
    private String joined;
    private int admin;
    private int founder;
    private String shortName;
    private String type;
    private String name;
    private String picLg;
    private String picSm;
    private String location;
    private int memberCount;
    private float money;
    private float influenceScore;
    private String visibility;
    private String country;

    public Community() {
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Community [")
                .append(communityId)
                .append(",")
                .append(shortName)
                .append(",")
                .append(name)
                .append(",")
                .append(memberCount)
                .append(",")
                .append(money)
                .append(",")
                .append(location)
                .append(",")
                .append(country)
                .append("]")
                .toString(); 
    }
    
    

    public int getCommunityId() {
        return communityId;
    }


    public String getJoined() {
        return joined;
    }


    public int getAdmin() {
        return admin;
    }


    public int getFounder() {
        return founder;
    }

    public String getShortName() {
        return shortName;
    }


    public String getType() {
        return type;
    }


    public String getName() {
        return name;
    }


    public String getPicLg() {
        return picLg;
    }


    public String getPicSm() {
        return picSm;
    }


    public String getLocation() {
        return location;
    }


    public int getMemberCount() {
        return memberCount;
    }


    public float getMoney() {
        return money;
    }


    public float getInfluenceScore() {
        return influenceScore;
    }


    public String getVisibility() {
        return visibility;
    }


    public String getCountry() {
        return country;
    }
    
}
