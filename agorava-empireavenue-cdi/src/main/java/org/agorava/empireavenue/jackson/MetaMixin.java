/*
 * Copyright 2013 Agorava.
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

@JsonTypeName("meta")
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class MetaMixin {

    @JsonCreator
    MetaMixin(@JsonProperty("total_rows")
    int totalRows,
            @JsonProperty("uri")
            String uri,
            @JsonProperty("limit")
            int limit,
            @JsonProperty("limit_type")
            String limitType,
            @JsonProperty("requests")
            int requests,
            @JsonProperty("reset")
            int reset,
            @JsonProperty("recorded")
            String recorded,
            @JsonProperty("premium")
            boolean premium,
            @JsonProperty("error")
    String error) {
    }

    @JsonProperty("total_rows")
    abstract int getTotalRows();

    @JsonProperty("uri")
    abstract String getUri();

    @JsonProperty("limit")
    abstract int getLimit();

    @JsonProperty("limit_type")
    abstract String getLimitType();

    @JsonProperty("requests")
    abstract int getRequests();

    @JsonProperty("reset")
    abstract int getReset();

    @JsonProperty("recorded")
    abstract String getRecorded();

    @JsonProperty("premium")
    abstract boolean isPremium();
    
    @JsonProperty("error")
    abstract String getError();

}
