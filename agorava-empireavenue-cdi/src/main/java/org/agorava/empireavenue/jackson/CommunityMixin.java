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
@JsonTypeName("meta")
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class CommunityMixin {

    @JsonCreator
    CommunityMixin(@JsonProperty("community_id") int communityId,
            @JsonProperty("joined") String joined,
            @JsonProperty("admin") int admin,
            @JsonProperty("founder") int founder,
            @JsonProperty("short_name") String shortName,
            @JsonProperty("type") String type,
            @JsonProperty("name") String name,
            @JsonProperty("pic_lg") String picLg,
            @JsonProperty("pic_sm") String picSm,
            @JsonProperty("location") String location,
            @JsonProperty("member_count") int memberCount,
            @JsonProperty("money") float money,
            @JsonProperty("influence_score") float influenceScore,
            @JsonProperty("visibility") String visibility,
            @JsonProperty("country") String country) {
    }

    @JsonProperty("community_id")
    abstract int getCommunityId();

    @JsonProperty("joined")
    abstract String getJoined();

    @JsonProperty("admin")
    abstract int getAdmin();

    @JsonProperty("founder")
    abstract int getFounder();

    @JsonProperty("short_name")
    abstract String getShortName();

    @JsonProperty("type")
    abstract String getType();

    @JsonProperty("name")
    abstract String getName();

    @JsonProperty("pic_lg")
    abstract String getPicLg();

    @JsonProperty("pic_sm")
    abstract String getPicSm();

    @JsonProperty("location")
    abstract String getLocation();

    @JsonProperty("member_count")
    abstract int getMemberCount();

    @JsonProperty("money")
    abstract float getMoney();

    @JsonProperty("influence_score")
    abstract float getInfluenceScore();

    @JsonProperty("visibility")
    abstract String getVisibility();

    @JsonProperty("country")
    abstract String getCountry();

}
