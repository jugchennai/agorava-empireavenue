package org.agorava.empireavenue.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@SuppressWarnings("unused")
abstract class ProfileMixin {

	@JsonCreator
	ProfileMixin(@JsonProperty("id") String id) {
	}

	@JsonProperty("ticker")
	private String ticker;
	@JsonProperty("first_name")
	private String firstName;
	@JsonProperty("site_name")
	private String siteName;
	@JsonProperty("site_url")
	private String siteUrl;
	@JsonProperty("last_name")
	private String lastName;
	@JsonProperty("full_name")
	private String fullName;
	@JsonProperty("joined")
	private String joined;
	@JsonProperty("country")
	private String country;
	@JsonProperty("id")
	private String location;
	@JsonProperty("id")
	private String type;
	@JsonProperty("id")
	private int maxShare;
	@JsonProperty("id")
	private float commission;
	@JsonProperty("id")
	private float lastTrade;
	@JsonProperty("id")
	private int outstandingShares;
	@JsonProperty("id")
	private int totalShares;
	@JsonProperty("id")
	private float close;
	@JsonProperty("id")
	private float closeMoney;
	@JsonProperty("id")
	private float open;
	@JsonProperty("id")
	private float yesterdayLowest;
	@JsonProperty("id")
	private float yesterdayHighest;
	@JsonProperty("id")
	private float yesterdayChange;
	@JsonProperty("id")
	private int volume;
	@JsonProperty("id")
	private String smPortrait;
	@JsonProperty("id")
	private String lgPortrait;
	@JsonProperty("id")
	private String currentStatus;
	@JsonProperty("id")
	private String currentStatusSet;
	@JsonProperty("id")
	private String marketLastClose;
	@JsonProperty("id")
	private String marketLastOpen;
	@JsonProperty("id")
	private String tradingStatus;
	@JsonProperty("id")
	private int investmentsCount;
	@JsonProperty("id")
	private int shareholdersCount;
	@JsonProperty("id")
	private int thumbsUpCount;
	@JsonProperty("id")
	private int thumbsDowncount;
	@JsonProperty("id")
	private int sharesOwnedCount;
	@JsonProperty("id")
	private int listedCount;
	@JsonProperty("id")
	private int recommendedCount;
	@JsonProperty("id")
	private int heldShares;
	@JsonProperty("id")
	private float avgDivPerShare;

	@JsonProperty("id")
	private float eavScore;
	@JsonProperty("id")
	private float flickrScore;
	@JsonProperty("id")
	private float twitterScore;
	@JsonProperty("id")
	private float facebookScore;
	@JsonProperty("id")
	private float facebookpageScore;
	@JsonProperty("id")
	private float youtubeScore;
	@JsonProperty("id")
	private float linkedinScore;
	@JsonProperty("id")
	private float foursquareScore;
	@JsonProperty("id")
	private float instagramScore;
	@JsonProperty("id")
	private float wordpressScore;
	@JsonProperty("id")
	private float gplusScore;

}
