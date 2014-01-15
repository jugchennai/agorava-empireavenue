package org.agorava.empireavenue.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Karthikeyan Annamalai <writetokarthikeyan@outlook.com>
 * @since 0.7.0
 */

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class PortfolioResponseMixin extends ResponseMixin  {

    @JsonCreator
    PortfolioResponseMixin(@JsonProperty("meta")
                         MetaMixin meta,
                         @JsonProperty("data")
                         List<PortfolioMixin> data) {
        super(meta);
    }

    @JsonProperty("data")
    abstract List<PortfolioMixin> getData();
}
