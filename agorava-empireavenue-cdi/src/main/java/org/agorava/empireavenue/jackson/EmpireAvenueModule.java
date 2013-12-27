package org.agorava.empireavenue.jackson;

import org.agorava.empireavenue.model.Meta;
import org.agorava.empireavenue.model.ProfileInfo;

import com.fasterxml.jackson.databind.module.SimpleModule;

import org.agorava.empireavenue.model.Status;
import org.agorava.empireavenue.response.ProfileInfoResponse;
import org.agorava.empireavenue.response.StatusResponse;

@SuppressWarnings("serial")
public class EmpireAvenueModule extends SimpleModule {

    public EmpireAvenueModule() {
        super("EmpireAvenueModule");
    }

    @Override
    public void setupModule(SetupContext context) {
        context.setMixInAnnotations(ProfileInfo.class, ProfileInfoMixin.class);
        context.setMixInAnnotations(Status.class, StatusMixin.class);
        context.setMixInAnnotations(StatusResponse.class, StatusResponseMixin.class);
        context.setMixInAnnotations(Meta.class, MetaMixin.class);
        context.setMixInAnnotations(ProfileInfoResponse.class, ProfileInfoResponseMixin.class);
        

    }
    
    String s="{\"meta\":{\"total_rows\":1,\"uri\":\"\\/profile\\/info\",\"limit\":\"150\",\"limit_type\":\"user\",\"requests\":12,\"reset\":1526,\"premium\":false,\"recorded\":\"2013-12-27 05:22:38\"},\"data\":[{\"ticker\":\"RMH\",\"first_name\":\"Rajmahendra Hegde\",\"full_name\":\"Rajmahendra Hegde\",\"site_name\":\"\",\"site_url\":\"\",\"country\":\"India\",\"location\":\"Chennai\",\"joined\":\"2010-08-19 06:08:41\",\"type\":\"person\",\"max_shares\":200,\"commission\":\"5.00\",\"last_trade\":\"73.27351\",\"outstanding_shares\":\"62002\",\"total_shares\":\"67002\",\"close\":\"73.27699\",\"close_money\":\"415041.84413\",\"open\":\"73.27351\",\"yesterday_lowest\":\"0.00000\",\"yesterday_change\":\"-0.00346\",\"yesterday_highest\":\"0.00000\",\"volume\":\"0\",\"market_last_close\":\"2013-12-26 17:29:35\",\"market_last_open\":\"2013-12-26 17:29:36\",\"current_status\":\"I am posting this from my program\",\"current_status_set\":\"2013-12-27 05:22:37\",\"trading_status\":\"enabled\",\"sm_portrait\":\"https:\\/\\/s3.amazonaws.com\\/empireavenue-public\\/portraits\\/p_sm_RMH_b0acd235a046.jpg\",\"lg_portrait\":\"https:\\/\\/s3.amazonaws.com\\/empireavenue-public\\/portraits\\/p_lg_RMH_b0acd235a046.jpg\",\"investments_count\":\"111\",\"shareholders_count\":\"98\",\"thumbs_up_count\":\"11\",\"thumbs_down_count\":\"0\",\"shares_owned_count\":\"19301\",\"listed_count\":\"14\",\"recommended_count\":\"1\",\"held_shares\":0,\"avg_div_per_share\":\"0.19\",\"eav_score\":\"1.000\",\"facebook_score\":\"44.104\",\"flickr_score\":\"6.278\",\"foursquare_score\":\"1.000\",\"gplus_score\":\"1.000\",\"linkedin_score\":\"23.727\",\"twitter_score\":\"20.484\",\"wordpress_score\":\"1.000\",\"youtube_score\":\"9.912\"}]}";


}

/*
 
 {"meta":{"total_rows":1,"uri":"\/profile\/info","limit":"150","limit_type":"user","requests":12,"reset":1526,"premium":false,"recorded":"2013-12-27 05:22:38"},"data":[{"ticker":"RMH","first_name":"Rajmahendra Hegde","full_name":"Rajmahendra Hegde","site_name":"","site_url":"","country":"India","location":"Chennai","joined":"2010-08-19 06:08:41","type":"person","max_shares":200,"commission":"5.00","last_trade":"73.27351","outstanding_shares":"62002","total_shares":"67002","close":"73.27699","close_money":"415041.84413","open":"73.27351","yesterday_lowest":"0.00000","yesterday_change":"-0.00346","yesterday_highest":"0.00000","volume":"0","market_last_close":"2013-12-26 17:29:35","market_last_open":"2013-12-26 17:29:36","current_status":"I am posting this from my program","current_status_set":"2013-12-27 05:22:37","trading_status":"enabled","sm_portrait":"https:\/\/s3.amazonaws.com\/empireavenue-public\/portraits\/p_sm_RMH_b0acd235a046.jpg","lg_portrait":"https:\/\/s3.amazonaws.com\/empireavenue-public\/portraits\/p_lg_RMH_b0acd235a046.jpg","investments_count":"111","shareholders_count":"98","thumbs_up_count":"11","thumbs_down_count":"0","shares_owned_count":"19301","listed_count":"14","recommended_count":"1","held_shares":0,"avg_div_per_share":"0.19","eav_score":"1.000","facebook_score":"44.104","flickr_score":"6.278","foursquare_score":"1.000","gplus_score":"1.000","linkedin_score":"23.727","twitter_score":"20.484","wordpress_score":"1.000","youtube_score":"9.912"}]}
 
 
 * */


