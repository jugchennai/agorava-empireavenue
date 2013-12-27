package org.agorava.empireavenue.response;

import java.util.List;

import org.agorava.empireavenue.model.Meta;
import org.agorava.empireavenue.model.ProfileInfo;
import org.agorava.spi.UserProfile;

public class ProfileInfoResponse extends Response<ProfileInfo> {

    public ProfileInfoResponse() {
    }

    public ProfileInfo getProfileInfo() {
        return retrieveData();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
