package org.agorava.empireavenue.response;

import java.util.List;
import org.agorava.empireavenue.model.Notifications;

/**
 * @author Karthikeyan Annamalai
 * @since 0.7.0
 */
public class NotificationsResponse extends Response<Notifications> {
    public NotificationsResponse() {
    }

    public List<Notifications> getAllNotification() {
        return retrieveAllData();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}