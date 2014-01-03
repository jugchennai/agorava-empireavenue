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

import java.util.List;

import org.agorava.empireavenue.EmpireAvenueException;
import org.agorava.empireavenue.model.Meta;
/**
*
* @author Rajmahendra Hegde <rajmahendra@gmail.com>
* @since 0.7.0
*/
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

   
    protected List<T> retrieveAllData() {
        errorCheck();
        return data;
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
