package org.agorava.empireavenue.response;

import java.util.List;

import org.agorava.empireavenue.EmpireAvenueException;
import org.agorava.empireavenue.model.Meta;
import org.agorava.empireavenue.model.Status;

public abstract class Response<T> {
    private Meta meta;
    private List<T> data;

    private List<T> getData() {
        return data;
    }

    private void setData(List<T> data) {
        this.data = data;
    }

    public Response() {
    }

    public Response(Meta meta) {
        this.meta = meta;
    }

    public Meta getMeta() {
        return meta;
    }

    protected T retrieveData() {
        errorCheck();
        return data.get(0);
    }

    @SuppressWarnings("unchecked")
    protected T[] retrieveAllData() {
        errorCheck();
        return (T[]) data.toArray();
    }

    private void errorCheck() {
        if (meta.getError() != null)
            throw new EmpireAvenueException("EmpireAvenueError: " + meta.getError());
        if (data.size() < 1)
            throw new EmpireAvenueException("No record(s) found");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
