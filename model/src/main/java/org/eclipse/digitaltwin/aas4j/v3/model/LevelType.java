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
 * Value represented by up to four variants of a numeric value in a specific role: MIN, NOM, TYP and
 * MAX. True means that the value is available, false means the value is not available.
 */
@IRI("aas:LevelType")
public enum LevelType {

    /**
     * Maximum of the value
     */
    @IRI("https://admin-shell.io/aas/3/0/LevelType/max")
    MAX("max"),

    /**
     * Minimum of the value
     */
    @IRI("https://admin-shell.io/aas/3/0/LevelType/min")
    MIN("min"),

    /**
     * Nominal value (value as designated)
     */
    @IRI("https://admin-shell.io/aas/3/0/LevelType/nom")
    NOM("nom"),

    /**
     * Value as typically present
     */
    @IRI("https://admin-shell.io/aas/3/0/LevelType/typ")
    TYP("typ");

    private String value;

    LevelType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public static LevelType fromValue(String text) {
        for (LevelType b : LevelType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    @IRI("https://admin-shell.io/aas/3/0/LevelType/min")
    final public boolean getMin() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

    @IRI("https://admin-shell.io/aas/3/0/LevelType/max")
    final public boolean getMax() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

    @IRI("https://admin-shell.io/aas/3/0/LevelType/nom")
    final public boolean getNom() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

    @IRI("https://admin-shell.io/aas/3/0/LevelType/typ")
    final public boolean getTyp() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

}
