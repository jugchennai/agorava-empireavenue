/*
 * Copyright 2013 Agorava.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.scribe.builder.api;

import org.agorava.core.oauth.scribe.DefaultApi20Final;
import org.agorava.core.utils.URLUtils;
import org.scribe.model.OAuthConfig;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public class EmpireAvenueApi extends DefaultApi20Final {

    private static final String AUTHORIZE_URL = "https://www.empireavenue.com/profile/developer/authorize?client_id=%s&redirect_uri=%s&response_type=code&state=request_auth_code";

    @Override
    public String getAccessTokenEndpoint() {
        return "https://api.empireavenue.com/oauth/token";
    }

    @Override
    public String getAuthorizationUrl(OAuthConfig config) {

        return String.format(AUTHORIZE_URL, config.getApiKey(), URLUtils.formURLEncode(config.getCallback()));

    }

}
