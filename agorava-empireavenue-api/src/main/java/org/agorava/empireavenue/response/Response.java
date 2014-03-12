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
package org.agorava.empireavenue.response;

import org.agorava.empireavenue.EmpireAvenueException;
import org.agorava.empireavenue.model.Meta;

import java.util.List;

/**
 * The Class Response.
 *
 * @param <T> the generic type
 * @author Rajmahendra Hegde
 * @since 0.7.0
 */
public abstract class Response<T> {

    /**
     * The meta.
     */
    private Meta meta;

    /**
     * The data.
     */
    private List<T> data;

    /**
     * Gets the data.
     *
     * @return the data
     */
    @SuppressWarnings("unused")
    private List<T> getData() {
        return data;
    }

    /**
     * Sets the data.
     *
     * @param data the new data
     */
    @SuppressWarnings("unused")
    private void setData(final List<T> data) {
        this.data = data;
    }

    /**
     * Instantiates a new response.
     */
    public Response() {
    }

    /**
     * Instantiates a new response.
     *
     * @param meta the meta
     */
    public Response(Meta meta) {
        this.meta = meta;
    }

    /**
     * Gets the meta.
     *
     * @return the meta
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * Retrieve data.
     *
     * @return the t
     */
    protected T retrieveData() {
        errorCheck();
        return data.get(0);
    }


    /**
     * Retrieve all data.
     *
     * @return the list
     */
    protected List<T> retrieveAllData() {
        errorCheck();
        return data;
    }

    /**
     * Error check.
     */
    private void errorCheck() {
        if (meta.getError() != null)
            throw new EmpireAvenueException("EmpireAvenueError: " + meta.getError());
        if (data.size() < 1)
            throw new EmpireAvenueException("No record(s) found");

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
