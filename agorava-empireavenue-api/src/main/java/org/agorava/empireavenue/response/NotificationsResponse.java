package org.agorava.empireavenue.response;

import javax.management.Notification;
import java.util.List;

/**
 * @author Karthikeyan Annamalai
 * @since 0.7.0
 */
public class NotificationsResponse extends Response<Notification> {
    public NotificationsResponse() {
    }

    public List<Notification> getAllNotification() {
        return retrieveAllData();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}