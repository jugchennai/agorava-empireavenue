package org.agorava.empireavenue.response;

import java.util.List;

import org.agorava.empireavenue.model.Meta;
import org.agorava.empireavenue.model.Status;

public class StatusResponse extends Response<Status> {

    public StatusResponse() {
    }

    public Status getStatus() {
        return retrieveData();
    }

}
