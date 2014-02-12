package org.agorava.empireavenue.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.agorava.empireavenue.model.NotificationsInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Karthikeyan Annamalai
 * @since 0.7.0
 */

@JsonTypeName("data")
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class NotificationsMixin {

    @JsonCreator
    NotificationsMixin(@JsonProperty("type")String type,@JsonProperty("created")String created,@JsonProperty("info")NotificationsInfo noteInfo)
    {

    }
    private String type;
    private String created;
    private NotificationsInfo noteInfo;
}
