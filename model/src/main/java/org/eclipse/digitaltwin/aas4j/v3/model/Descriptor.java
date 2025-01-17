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

import java.util.List;

import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;

/**
 * Descriptor holding the endpoints.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultDescriptor.class),
    @KnownSubtypes.Type(value = AssetAdministrationShellDescriptor.class),
    @KnownSubtypes.Type(value = SubmodelDescriptor.class)
})
public interface Descriptor extends Identifiable {

    /**
     * Endpoint of the network Resource
     *
     * More information under https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/endpoint
     *
     * @return Returns the List of Endpoints for the property endpoints.
     */
    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/endpoint")
    List<Endpoint> getEndpoints();

    /**
     * Endpoint of the network Resource
     *
     * More information under https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/endpoint
     *
     * @param endpoints desired value for the property endpoints.
     */
    void setEndpoints(List<Endpoint> endpoints);

}
