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
package org.agorava.empireavenue.model;

import org.agorava.spi.UserProfile;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public class ProfileInfo extends UserProfile {
    
    private String firstName;
    private String lastName;
    private String fullName;
    private String joined;
    private String country;
    private String location;

    public ProfileInfo(String id,String firstName, String lastName, String fullName, String joined, String country,
                       String location) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.joined = joined;
        this.country = country;
        this.location = location;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String getProfileImageUrl() {
        return "";
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJoined() {
        return joined;
    }

    public void setJoined(String joined) {
        this.joined = joined;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "ProfileInfo{" + "firstName=" + firstName + ", lastName=" + lastName + ", fullName=" + fullName + ", joined=" + joined + ", country=" + country + ", location=" + location + '}';
    }
    
        
    
}
