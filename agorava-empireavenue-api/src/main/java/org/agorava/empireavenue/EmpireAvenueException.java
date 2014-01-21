/*
 * Copyright 2014 Agorava
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.agorava.empireavenue;

import org.agorava.api.exception.AgoravaException;

/**
 * Base exception for Agorava EmpireAvenue Services.<br/>
 * 
 * This will help you to catch all EmpireAvenue based Exception at the time of contacting to EA Services.<br/>
 * 
 * 
 * @author Rajmahendra Hegde
 * @since 0.7.0
 */
@SuppressWarnings("serial")
public class EmpireAvenueException extends AgoravaException {

    /**
     * Instantiates a new empire avenue exception.
     * 
     * @param errorMessage the error message
     */
    public EmpireAvenueException(String errorMessage) {
        super(errorMessage);
    }

}
