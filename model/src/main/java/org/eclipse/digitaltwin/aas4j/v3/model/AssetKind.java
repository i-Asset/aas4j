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
 * Enumeration for denoting whether an asset is a type asset or an instance asset.
 */
@IRI("aas:AssetKind")
public enum AssetKind {

    /**
     * Instance asset
     */
    @IRI("https://admin-shell.io/aas/3/0/AssetKind/Instance")
    INSTANCE("Instance"),

    /**
     * Neither a type asset nor an instance asset
     */
    @IRI("https://admin-shell.io/aas/3/0/AssetKind/NotApplicable")
    NOT_APPLICABLE("NotApplicable"),

    /**
     * Type asset
     */
    @IRI("https://admin-shell.io/aas/3/0/AssetKind/Type")
    TYPE("Type");

    private String value;

    AssetKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public static AssetKind fromValue(String text) {
        for (AssetKind b : AssetKind.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

}
