package org.agorava.empireavenue;

import org.agorava.api.oauth.application.OAuthAppSettings;
import org.agorava.api.service.OAuthEncoder;
import org.agorava.spi.ProviderConfigOauth20Final;

/**
 * @author Antoine Sabot-Durand
 */
@EmpireAvenue
public class EmpireAvenueConfigOauth extends ProviderConfigOauth20Final {
    private static final String AUTHORIZE_URL = "https://www.empireavenue.com/profile/developer/authorize?client_id=%s&redirect_uri=%s&response_type=code&state=request_auth_code";

        @Override
        public String getAccessTokenEndpoint() {
            return "https://api.empireavenue.com/oauth/token";
        }

        @Override
        public String getAuthorizationUrl(OAuthAppSettings config) {

            return String.format(AUTHORIZE_URL, config.getApiKey(), OAuthEncoder.encode(config.getCallback()));

        }

}
