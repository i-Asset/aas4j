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

import java.util.Objects;

import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;

/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.Endpoint
 * 
 * Endpoint defining ProtocolInformation.
 */

@IRI("aas:Endpoint")
public class DefaultEndpoint implements Endpoint {

    @IRI("https://admin-shell.io/aas/3/0/Endpoint/address")
    protected String address;

    @IRI("https://admin-shell.io/aas/3/0/Endpoint/type")
    protected String type;

    public DefaultEndpoint() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.type,
            this.address);
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
            DefaultEndpoint other = (DefaultEndpoint) obj;
            return Objects.equals(this.type, other.type) &&
                Objects.equals(this.address, other.address);
        }
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This builder class can be used to construct a DefaultEndpoint bean.
     */
    public static class Builder extends EndpointBuilder<DefaultEndpoint, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultEndpoint newBuildingInstance() {
            return new DefaultEndpoint();
        }
    }
}
