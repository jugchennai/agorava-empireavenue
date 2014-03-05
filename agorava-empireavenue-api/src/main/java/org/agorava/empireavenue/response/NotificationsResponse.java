package org.agorava.empireavenue.response;

import org.agorava.empireavenue.model.Notifications;

import java.util.List;

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