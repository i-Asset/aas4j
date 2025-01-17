/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.eclipse.digitaltwin.aas4j.v3.model;

import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;

/**
 * Reference types
 */
@IRI("aas:ReferenceTypes")
public enum ReferenceTypes {

    /**
     * External reference.
     */
    @IRI("https://admin-shell.io/aas/3/0/ReferenceTypes/ExternalReference")
    EXTERNAL_REFERENCE("ExternalReference"),

    /**
     * Model reference.
     */
    @IRI("https://admin-shell.io/aas/3/0/ReferenceTypes/ModelReference")
    MODEL_REFERENCE("ModelReference");

    private String value;

    ReferenceTypes(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public static ReferenceTypes fromValue(String text) {
        for (ReferenceTypes b : ReferenceTypes.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

}
