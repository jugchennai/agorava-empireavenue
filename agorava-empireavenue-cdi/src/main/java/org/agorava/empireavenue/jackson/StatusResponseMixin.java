package org.agorava.empireavenue.jackson;

import java.util.List;

import org.agorava.empireavenue.model.Meta;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class StatusResponseMixin {

    @JsonCreator
    StatusResponseMixin(@JsonProperty("meta")
    MetaMixin meta, @JsonProperty("data")
    List<StatusMixin> data) {

    }

    @JsonProperty("meta")
    abstract MetaMixin getMeta();

    @JsonProperty("data")
    abstract List<StatusMixin> getData();
}
