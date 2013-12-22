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
package org.agorava.empireavenue;

import org.agorava.empireavenue.model.ProfileInfo;
import org.agorava.empireavenue.model.Status;

/**
 * Operations on Profile Information /profile
 *
 *
 * EmpireAvenue Info:<br/>
 * URI: https://api.empireavenue.com/profile/bank/balance <br/>
 * Rate Limit: User <br/>
 * Authentication: Required<br/><br/>
 *
 * API Calls<br/>
 * profile/bank/balance<br/>
 * profile/counts<br/>
 * profile/info<br/>
 * profile/brands<br/>
 * profile/shareholders<br/>
 * profile/communities<br/>
 * profile/rankings<br/>
 * profile/notifications<br/>
 *
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public interface ProfileService {

    static final String SET_STATUS = "profile/set/status";
    static final String PROFILE_INFO = "profile/info";

    /**
     * Set statusMessage to the authenticated user's status<br/><br/>
     *
     * EmpireAvenue : https://apidocs.empireavenue.com/v1/post?call=profile/set/status<br/><br/>
     *
     * This message is maximum 140 characters long and UTF-8 safe.
     *
     * @param statusMessage the message to be updated
     * @return ID of the updated status entry.
     */
    Status updateStatus(String statusMessage);

    /**
     * Returns the base information of a person's profile<br/><br/>
     * 
     *  EmpireAvenue : https://apidocs.empireavenue.com/v1/get?call=profile/info<br/><br/>
     * 
     *  <b>Limit</b>: Maximum of 100 user profiles fetched in any one call 
     *
     * @return ProfileInfo Profile information of the user
     */
    ProfileInfo getProfileInfo();
}
