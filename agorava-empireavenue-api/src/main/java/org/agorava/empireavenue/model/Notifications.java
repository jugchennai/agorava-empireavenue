package org.agorava.empireavenue.model;


/**
 * @author Karthikeyan Annamalai
 * @since 0.7.0
 */
public class Notifications {

    public Notifications()
    {

    }

    private String type;
    private String created;
    private NotificationsInfo notificationsInfo;

    public String getType() {
        return type;
    }

    public String getCreated() {
        return created;
    }

    public NotificationsInfo getNotificationsInfo() {
        return notificationsInfo;
    }

    @Override
    public String toString() {

        return new StringBuffer()
                .append("Notifications [ ")
                .append("Type : " + this.type)
                .append(", created :" + this.created)
                        // .append("info :"+this.getNotificationsInfo().toString()+"")
                .append("]")
                .toString();
    }
}
