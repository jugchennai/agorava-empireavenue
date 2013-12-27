package org.agorava.empireavenue.jackson;

import java.util.List;

import org.agorava.empireavenue.model.Meta;
import org.agorava.empireavenue.model.ProfileInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ProfileInfoResponseMixin {

    @JsonCreator
    ProfileInfoResponseMixin(@JsonProperty("meta")
    MetaMixin meta,
            @JsonProperty("data")
            List<ProfileInfoMixin> data) {

    }

    @JsonProperty("meta")
    abstract MetaMixin getMeta();

    @JsonProperty("data")
    abstract List<ProfileInfoMixin> getData();

}
