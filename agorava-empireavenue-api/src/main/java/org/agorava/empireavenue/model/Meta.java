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
package org.agorava.empireavenue.model;

/**
 * 
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 * @since 0.7.0
 */
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

        return new StringBuffer().append("Meta[").append(error)
                .append(",")
                .append(totalRows)
                .append(",")
                .append(recorded)
                .append(",")
                .append(limitType)
                .append(",")
                .append(limit)
                .append(",")
                .append(totalRows)
                .append("]")
                .toString();
    }

    public int getTotalRows() {
        return totalRows;
    }

    public String getUri() {
        return uri;
    }

    public int getLimit() {
        return limit;
    }

    public String getLimitType() {
        return limitType;
    }

    public int getRequests() {
        return requests;
    }

    public int getReset() {
        return reset;
    }

    public String getRecorded() {
        return recorded;
    }

    public boolean isPremium() {
        return premium;
    }

    public String getError() {
        return error;
    }

}
