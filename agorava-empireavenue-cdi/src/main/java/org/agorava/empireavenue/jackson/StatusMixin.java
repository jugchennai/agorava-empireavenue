package org.agorava.empireavenue.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("data")
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class StatusMixin {

    @JsonCreator
    StatusMixin(@JsonProperty("status")
    String status,
            @JsonProperty("content_id")
            int contentId) {

    }

    @JsonProperty("status")
    abstract String getStatus();

    @JsonProperty("content_id")
    abstract int getContentId();

}
