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
abstract class SharesMixin {
    @JsonCreator
    public SharesMixin(@JsonProperty("commission")float balance) {
    }


    @JsonProperty("success")
    private boolean success;

    @JsonProperty("shares_owned")
    private int sharesOwned;

    @JsonProperty("bank_balance")
    private float bankBalance;

    @JsonProperty("total_charged")
    private float totalCharged;



    @JsonProperty("total_earned")
    private float totalEarned;



    @JsonProperty("commission")
    abstract float getCommission();





}
