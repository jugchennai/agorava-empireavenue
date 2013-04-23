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

import java.io.File;
import java.io.FileNotFoundException;
import javax.inject.Inject;
import org.agorava.EmpireAvenue;
import org.agorava.core.api.SocialMediaApiHub;
import org.agorava.core.api.oauth.OAuthToken;
import org.agorava.core.oauth.scribe.OAuthTokenScribe;
import org.agorava.empireavenue.ProfileService;
import org.agorava.empireavenue.model.ProfileInfo;
import org.agorava.empireavenue.model.Status;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.DependencyResolvers;
import org.jboss.shrinkwrap.resolver.api.maven.MavenDependencyResolver;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
@RunWith(Arquillian.class)
public class EmpireAvenueTest {

    @Inject
    @EmpireAvenue
    SocialMediaApiHub serviceHub;
    @Inject
    ProfileService profileService;

    @Deployment
    public static Archive<?> createTestArchive() throws FileNotFoundException {

        WebArchive ret = ShrinkWrap
                .create(WebArchive.class, "test.war")
                .addPackages(true, "org.agorava")
                .addClass(EmpireAvenueServiceProducer.class)
                .addAsLibraries(new File("../agorava-empireavenue-api/target/agorava-empireavenue-api.jar"));
        System.out.println(System.getProperty("arquillian"));
        if (("weld-ee-embedded-1.1".equals(System.getProperty("arquillian")) || System.getProperty("arquillian") == null)) {
            // Don't embed dependencies that are already in the CL in the embedded container from surefire
            /*ret.addAsLibraries(DependencyResolvers.use(MavenDependencyResolver.class).loadMetadataFromPom("pom.xml")
             .artifact("org.jboss.solder:solder-impl").resolveAs(GenericArchive.class));
             */ } else {
            ret.addAsLibraries(DependencyResolvers.use(MavenDependencyResolver.class).loadMetadataFromPom("pom.xml")
                    .artifact("org.jboss.solder:solder-impl").artifact("org.scribe:scribe")
                    .artifact("org.apache.commons:commons-lang3").artifact("org.codehaus.jackson:jackson-mapper-asl")
                    .artifact("com.google.guava:guava").resolveAsFiles());
        }
        return ret;
    }

    @Before
    public void init() {
        OAuthToken token = new OAuthTokenScribe("334872715-u75bjYqWyQSYjFMnKeTDZUn8i0QAExjUQ4ENZXH3",
                "08QG7HVqDjkr1oH1YfBRWmd0n8EG73CuzJgTjFI0sk");
        serviceHub.getSession().setAccessToken(token);
        serviceHub.getService().initAccessToken();
    }

    @Test
    public void authorizationUrlTest() {

        assertTrue(serviceHub.getService().getAuthorizationUrl().startsWith("http"));
    }

    @Test
    public void sendAUpdateTest() {
        Status status = profileService.updateStatus("I am posting this from my program.");
        assertNotNull(status);
        System.out.println(status);
    }

    @Test
    public void getProfileInfoTest() {
        ProfileInfo profileInfo = profileService.getProfileInfo();
        assertNotNull(profileInfo);
        System.out.println(profileInfo);
    }
}