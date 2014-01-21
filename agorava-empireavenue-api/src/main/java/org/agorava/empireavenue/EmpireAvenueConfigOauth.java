/*
 * Copyright 2014 Agorava
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.agorava.empireavenue;

import org.agorava.api.oauth.OAuth;
import org.agorava.api.oauth.application.OAuthAppSettings;
import org.agorava.api.service.OAuthEncoder;
import org.agorava.spi.ProviderConfigOauth20Final;

/**
 * The Class EmpireAvenueConfigOauth.
 *
 * @author Antoine Sabot-Durand
 */
@EmpireAvenue
public class EmpireAvenueConfigOauth extends ProviderConfigOauth20Final {
    
    /** The Constant AUTHORIZE_URL. */
    private static final String AUTHORIZE_URL = "https://www.empireavenue.com/profile/developer/authorize?client_id=%s&redirect_uri=%s&response_type=code&state=request_auth_code";

    /**
     * {@inheritDoc}
     */
    @Override
    public String getAccessTokenEndpoint() {
        return "https://api.empireavenue.com/oauth/token";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getAuthorizationUrl(OAuthAppSettings config) {

        return String.format(AUTHORIZE_URL, config.getApiKey(), OAuthEncoder.encode(config.getCallback()));

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OAuth.OAuthVersion getOAuthVersion() {
        return OAuth.OAuthVersion.OTHER;
    }
}
