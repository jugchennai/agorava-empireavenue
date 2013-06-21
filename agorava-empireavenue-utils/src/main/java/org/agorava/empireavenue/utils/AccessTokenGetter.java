/*
 * Copyright 2012 Agorava
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

package org.agorava.empireavenue.utils;

import org.agorava.EmpireAvenueLiteral;
import org.agorava.EmpireAvenueRoot;
import org.agorava.core.api.oauth.OAuthService;
import org.agorava.core.api.oauth.OAuthToken;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import java.util.Scanner;

/**
 * @author Antoine Sabot-Durand
 */
public class AccessTokenGetter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        WeldContainer weld = new Weld().initialize();


        OAuthService service = weld.instance().select(OAuthService.class, EmpireAvenueLiteral.INSTANCE).get();

        System.out.println("Go to this URL to authenticate :");
        System.out.println(service.getAuthorizationUrl());
        System.out.println();
        System.out.print("Enter your authorization code here : ");
        service.setVerifier(in.nextLine());
        service.initAccessToken();
        OAuthToken accessToken = service.getAccessToken();
        System.out.println("Your Access Token is : " + accessToken.getToken());


    }
}
