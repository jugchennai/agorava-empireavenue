package org.agorava.empireavenue.cdi;

import org.agorava.AgoravaConstants;
import org.agorava.api.atinject.GenericBean;
import org.agorava.api.oauth.OAuth;
import org.agorava.api.oauth.OAuthRequest;
import org.agorava.api.oauth.Token;
import org.agorava.api.oauth.application.OAuthAppSettings;
import org.agorava.oauth.OAuth20FinalServiceImpl;

/**
*
*@author Antoine Sabot-Durand
* @author Rajmahendra Hegde <rajmahendra@gmail.com>
* @since 0.7.0
*/
@GenericBean
@OAuth(OAuth.OAuthVersion.OTHER)
public class EmpireAvenueOAuth20Service extends OAuth20FinalServiceImpl {

    @Override
    public void signRequest(Token accessToken, OAuthRequest request) {
        OAuthAppSettings config = getTunedOAuthAppSettings();
        super.signRequest(accessToken, request);
        request.addQuerystringParameter(AgoravaConstants.CLIENT_ID, config.getApiKey());
    }
}
