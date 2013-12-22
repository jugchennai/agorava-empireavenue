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
package org.agorava.empireavenue.cdi.test;

import org.agorava.empireavenue.EmpireAvenue;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.agorava.api.oauth.application.OAuthAppSettings;
import org.agorava.api.oauth.application.OAuthApplication;

/**
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public class EmpireAvenueServiceProducer {
    
    @ApplicationScoped
    @Produces
    @EmpireAvenue
    @OAuthApplication
    public OAuthAppSettings produceSettings;

    /*
    @ApplicationScoped
    @Produces
    @EmpireAvenue
    public org.agorava.core.api.oauth.OAuthAppSettings produceFirstSetting() {
        PropertyOAuthAppSettingsBuilder builder = new PropertyOAuthAppSettingsBuilder();
        return builder.build();
    }

    @SessionScoped
    @Produces
    @EmpireAvenue
    @Current
    public org.agorava.core.api.oauth.OAuthSession produceOauthSession(@EmpireAvenue @Default org.agorava.core.api.oauth.OAuthSession session) {
        return session;

    }
*/
}
