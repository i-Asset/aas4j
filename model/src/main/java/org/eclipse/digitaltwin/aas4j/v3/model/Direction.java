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
 * Direction
 */
@IRI("aas:Direction")
public enum Direction {

    /**
     * Input direction.
     */
    @IRI("https://admin-shell.io/aas/3/0/Direction/Input")
    INPUT("Input"),

    /**
     * Output direction
     */
    @IRI("https://admin-shell.io/aas/3/0/Direction/Output")
    OUTPUT("Output");

    private String value;

    Direction(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public static Direction fromValue(String text) {
        for (Direction b : Direction.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

}
