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
package org.agorava.empireavenue.impl;

import static com.google.common.collect.Maps.newHashMap;
import java.util.Map;
import org.agorava.EmpireAvenueBaseService;
import org.agorava.empireavenue.ProfileService;
import org.agorava.empireavenue.model.ProfileInfo;
import org.agorava.empireavenue.model.Status;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public class ProfileServiceImpl extends EmpireAvenueBaseService implements ProfileService {

    /**
     *
     * @see org.agorava.empireavenue.ProfileService#updateStatus(java.lang.String)
     */
    @Override
    public Status updateStatus(String statusMessage) {

        Map<String, Object> data = newHashMap();
        data.put("status", statusMessage);
        return getService().post(buildUri(SET_STATUS), data, Status.class);
    }

    /**
     *
     * @see org.agorava.empireavenue.ProfileService#getProfileInfo()
     */
    @Override
    public ProfileInfo getProfileInfo() {
        return getService().get(buildUri(PROFILE_INFO), ProfileInfo.class);
    }
}
