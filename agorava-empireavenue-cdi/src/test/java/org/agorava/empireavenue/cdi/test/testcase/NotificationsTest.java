package org.agorava.empireavenue.cdi.test.testcase;

        import org.agorava.empireavenue.cdi.test.EmpireAvenueTestDeploy;
import org.agorava.empireavenue.response.NotificationsResponse;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Karthikeyan Annamalai
 * @since 0.7.0
 */
@RunWith(Arquillian.class)
public class NotificationsTest extends EmpireAvenueTestDeploy {

    private static String ticker = "RMH";
    private static int page = 2;
    private static Integer maxresults = 101;

    @Test
    public void authorizationUrlTest() {
        assertTrue(service.getAuthorizationUrl().startsWith("https"));
    }

    @Test
    public void getAllNotificationsTest() {
        NotificationsResponse notificationsResponse = notificationsService.getAllNotification();
        assertNotNull(notificationsResponse);
        assertNotNull(notificationsResponse.getAllNotification());


    }
}
