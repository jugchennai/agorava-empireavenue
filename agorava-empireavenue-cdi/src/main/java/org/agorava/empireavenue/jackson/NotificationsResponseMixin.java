package org.agorava.empireavenue.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Karthikeyan Annamalai
 * @since 0.7.0
 */
abstract class NotificationsResponseMixin extends ResponseMixin{

    @JsonCreator
    NotificationsResponseMixin(@JsonProperty("meta")
                               MetaMixin meta, @JsonProperty("data")
                               List<ListsMixin> data) {
        super(meta);
    }

    @JsonProperty("data")
    abstract List<NotificationsMixin> getData();
}