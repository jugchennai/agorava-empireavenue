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

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.agorava.EmpireAvenue;
import org.agorava.EmpireAvenueServicesHub;
import org.agorava.core.api.SocialMediaApiHub;
import static org.agorava.core.api.oauth.OAuthAppSettingsBuilder.*;
import org.agorava.core.api.oauth.Param;
import org.agorava.core.cdi.OAuthApplication;
import org.agorava.core.oauth.SimpleOAuthAppSettingsBuilder;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public class EmpireAvenueServiceProducer {
    
    @EmpireAvenue
    @ApplicationScoped
    @OAuthApplication(builder = SimpleOAuthAppSettingsBuilder.class, params = {@Param(name = API_KEY, value = "6afde745d6132a48a1f235634cc644b1789cc2d1be88d6f0a6"),
            @Param(name = API_SECRET, value = "8217894278bea5a1aff29b60b80374c51ba420c7ba21943eab")})
    @Produces
    public SocialMediaApiHub OAuthSettinsProducer(EmpireAvenueServicesHub service) {
        return service;
    }
}
