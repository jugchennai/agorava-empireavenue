package org.agorava.empireavenue.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * @author Karthikeyan Annamalai
 * @since 0.7.0
 */

@JsonTypeName("data")
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class NotificationsInfoMixin {




    @JsonCreator
    NotificationsInfoMixin() {
    }

    @JsonProperty("from_ticker")
    private String fromTicker;

    @JsonProperty("from_full_name")
    private String fromFullName;

    @JsonProperty("to_ticker")
    private String toTicker;

    @JsonProperty("to_full_name")
    private String toFullName;

    @JsonProperty("message")
    private String message;

    @JsonProperty("reply_type")
    private String replyType;

    @JsonProperty("shareholder_thread_id")
    private String shareholderThreadId;

    @JsonProperty("shareholder_mail_subject")
    private String shareholderMailSubject;

    @JsonProperty("shareholder_mail_isowner")
    private Boolean shareholderMailIsowner;

    @JsonProperty("topic")
    private String topic;

    @JsonProperty("community_id")
    private int communityId;

    @JsonProperty("community_topic_id")
    private int communityTopicId;

    @JsonProperty("community_name")
    private String communityName;

    @JsonProperty("mission_title")
    private String missionTitle;

    @JsonProperty("mission_id")
    private int missionId;

    @JsonProperty("message_type")
    private String messageType;

    @JsonProperty("thread_id")
    private int threadId;

    @JsonProperty("headline_id")
    private int headlineId;

    @JsonProperty("community_notification_type")
    private String communityNotificationType;

    @JsonProperty("inviter_full_name")
    private String inviterFullName;

    @JsonProperty("inviter_ticker")
    private String inviterTicker;

    @JsonProperty("request_full_name")
    private String requestFullName;

    @JsonProperty("request_ticker")
    private String requestTicker;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("stock_info")
    private String stockInfo;

    @JsonProperty("earnings")
    private double earnings;

    @JsonProperty("dividends")
    private double dividends;

    @JsonProperty("gains")
    private double gains;

    @JsonProperty("expenses")
    private double expenses;

    @JsonProperty("shares_bought")
    private int sharesBought;

    @JsonProperty("shares_bought_user_count")
    private int sharesBoughtUserCount;

    @JsonProperty("shares_sold")
    private int sharesSold;

    @JsonProperty("shares_sold_user_count")
    private int sharesSoldUserCount;

    @JsonProperty("shares")
    private int shares;

    @JsonProperty("price")
    private double price;

    @JsonProperty("buyer_ticker")
    private String buyerTicker;

    @JsonProperty("buyer_name")
    private String buyerName;

    @JsonProperty("seller_ticker")
    private String sellerTicker;

    @JsonProperty("seller_name")
    private String sellerName;

    @JsonProperty("mention_type")
    private String mentionType;

    @JsonProperty("post")
    private String post;

    @JsonProperty("status_id")
    private String statusId;

    @JsonProperty("community_thread_id")
    private int communityThreadId;

    @JsonProperty("community_title")
    private String communityTitle;

    @JsonProperty("community_topic")
    private String communityTopic;

    @JsonProperty("subject")
    private String subject;



}
