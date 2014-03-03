package org.agorava.empireavenue.model;


import java.util.*;

/**
 * @author Karthikeyan Annamalai
 * @since 0.7.0
 */
public class Notifications {

    private String type;
    private String created;
    private NotificationsInfo notificationsInfo;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

   public NotificationsInfo getNotificationsInfo() {
        return notificationsInfo;
    }

    public void setNotificationsInfo(NotificationsInfo notificationsInfo) {
        this.notificationsInfo = notificationsInfo;
    }

    @Override
    public String toString() {

        return new StringBuffer()
                .append("Notifications [ ")
                .append("Type : "+ this.type)
                .append(", created :"+ this.created)
               // .append("info :"+this.getNotificationsInfo().toString()+"")
                .append("]")
                .toString();
    }
}
