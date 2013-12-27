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
