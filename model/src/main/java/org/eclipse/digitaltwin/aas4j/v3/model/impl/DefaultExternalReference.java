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

package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;

/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.ExternalReference
 * 
 * Reference to an external resource.
 */

@IRI("aas:ExternalReference")
public class DefaultExternalReference implements ExternalReference {

    @IRI("https://admin-shell.io/aas/3/0/Reference/key")
    protected List<Key> keys = new ArrayList<>();

    public DefaultExternalReference() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.keys);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultExternalReference other = (DefaultExternalReference) obj;
            return Objects.equals(this.keys, other.keys);
        }
    }

    @Override
    public List<Key> getKeys() {
        return keys;
    }

    @Override
    public void setKeys(List<Key> keys) {
        this.keys = keys;
    }

    /**
     * This builder class can be used to construct a DefaultExternalReference bean.
     */
    public static class Builder extends ExternalReferenceBuilder<DefaultExternalReference, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultExternalReference newBuildingInstance() {
            return new DefaultExternalReference();
        }
    }
}
