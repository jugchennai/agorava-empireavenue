package org.agorava.empireavenue.impl;

import org.agorava.EmpireAvenueBaseService;
import org.agorava.empireavenue.EmpireAvenue;
import org.agorava.empireavenue.response.NotificationsResponse;
import org.agorava.empireavenue.service.NotificationsService;

/**
 * @author Karthikeyan Annamalai
 * @since 0.7.0
 */
@EmpireAvenue
public class NotificationsServiceImpl extends EmpireAvenueBaseService implements NotificationsService {

    @Override
    public NotificationsResponse getAllNotification() {
        return getService().get(buildAbsoluteUri(NOTIFICATIONS_ALL), NotificationsResponse.class);
    }
}
