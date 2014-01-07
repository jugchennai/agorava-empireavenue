/*
 * Copyright 2014 Agorava.
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

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ArchivePath;
import org.jboss.shrinkwrap.api.Filter;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;

import java.io.FileNotFoundException;
import javax.inject.Inject;
import org.agorava.api.atinject.Current;
import org.agorava.api.oauth.OAuthService;
import org.agorava.api.oauth.OAuthSession;
import org.agorava.api.oauth.Token;
import org.agorava.api.service.OAuthLifeCycleService;
import org.agorava.empireavenue.EmpireAvenue;
import org.agorava.empireavenue.service.HistoryService;
import org.agorava.empireavenue.service.LeadersService;
import org.agorava.empireavenue.service.ProfileService;
import org.junit.Before;

/**
*
* @author Rajmahendra Hegde <rajmahendra@gmail.com>
* @since 0.7.0
*/
public class EmpireAvenueTestDeploy {
    
	private final String TOKEN = "";
    
    @Inject
    @EmpireAvenue
    protected ProfileService profileService;

    @Inject
    @EmpireAvenue
    protected LeadersService leadersService;

    @Inject
    @EmpireAvenue
    protected HistoryService historyService;
    
    @Inject
    @EmpireAvenue
    protected OAuthService service;

    @Inject
    protected OAuthLifeCycleService oAuthLifeCycleService;

    @Inject
    @EmpireAvenue
    @Current
    protected OAuthSession sessionTest;

    @Before
    public void init() {
 

        Token token = new Token(TOKEN.trim(), "");
        sessionTest.setAccessToken(token);
        oAuthLifeCycleService.endDance();
    }
    
    
    @Deployment
    public static Archive<?> createTestArchive() throws FileNotFoundException {
        JavaArchive testJar = ShrinkWrap.create(JavaArchive.class, "agorava-empireavenue.jar")
                .addPackages(true, new Filter<ArchivePath>() {
                    @Override
                    public boolean include(ArchivePath path) {
                        return !((path.get().contains("test") || path.get().contains("servlet") || path.get().contains
                                ("jsf")));
                    }
                }, "org.agorava")
                .addAsResource("META-INF/services/javax.enterprise.inject.spi.Extension")
                .addAsResource("META-INF/services/org.apache.deltaspike.core.spi.config.ConfigSourceProvider")
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");

        JavaArchive[] libs = Maven.resolver()
                .loadPomFromFile("pom.xml")
                .resolve("org.apache.deltaspike.core:deltaspike-core-impl")
                .withTransitivity().as(JavaArchive.class);


        WebArchive ret = ShrinkWrap
                .create(WebArchive.class, "test.war")
                .addClasses(EmpireAvenueServiceProducer.class)
                .addAsLibraries(libs)
                .addAsLibraries(testJar)
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addAsWebInfResource("agorava.properties");
        return ret;
    }
}
