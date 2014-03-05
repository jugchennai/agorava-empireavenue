package org.agorava.empireavenue.response;

import org.agorava.empireavenue.model.Lists;

import java.util.List;

/**
 * @author Karthikeyan Annamalai
 * @since 0.7.0
 */
public class ListsResponse extends Response<Lists> {

    public ListsResponse() {

    }

    public Lists getListInfo() {
        return retrieveData();
    }

    public List<Lists> getAllListInfo() {
        return retrieveAllData();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
