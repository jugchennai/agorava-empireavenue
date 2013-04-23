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

import org.scribe.model.OAuthConfig;
import org.scribe.model.Verb;
import org.scribe.utils.OAuthEncoder;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public class EmpireAvenueApi extends DefaultApi20  {
    
    private static final String AUTHORIZE_URL = "https://www.empireavenue.com/profile/developer/authorize?client_id=%s&response_type=code&state=request_auth_code";
    private static final String SCOPED_AUTHORIZE_URL = AUTHORIZE_URL + "&scope=%s";

    @Override
    public String getAccessTokenEndpoint() {
        return "https://api.empireavenue.com/oauth/token";
    }

    @Override
    public String getAuthorizationUrl(OAuthConfig config) {
// Preconditions
// .checkValidUrl(config.getCallback(),
// "Must provide a valid url as callback. StackOverflow");

        // Append scope if present
        if (config.hasScope()) {
            return String.format(SCOPED_AUTHORIZE_URL, config.getApiKey(),
                    OAuthEncoder.encode(config.getCallback()),
                    OAuthEncoder.encode(config.getScope()));
        } else {
            return String.format(AUTHORIZE_URL, config.getApiKey());
        }
    }

    public Verb getAccessTokenVerb() {
        return Verb.POST;
    }
}
