package org.agorava.empireavenue.model;

public class Meta {
    private int totalRows;
    private String uri;
    private int limit;
    private String limitType;
    private int requests;
    private int reset;
    private String recorded;
    private boolean premium;
    private String error;

    @Override
    public String toString() {

        return new StringBuffer().append("Meta[")
                .append(error + ",")
                .append(totalRows + ",")
                .append(recorded + ",")
                .append(limitType + ",")
                .append(limit + ",")
                .append(totalRows)
                .append("]")
                .toString();
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getLimitType() {
        return limitType;
    }

    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }

    public int getRequests() {
        return requests;
    }

    public void setRequests(int requests) {
        this.requests = requests;
    }

    public int getReset() {
        return reset;
    }

    public void setReset(int reset) {
        this.reset = reset;
    }

    public String getRecorded() {
        return recorded;
    }

    public void setRecorded(String recorded) {
        this.recorded = recorded;
    }

}
