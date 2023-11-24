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
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;

/**
 * Endpoint defining ProtocolInformation.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultEndpoint.class)
})
public interface Endpoint {

    /**
     * Endpoint type.
     *
     * More information under https://admin-shell.io/aas/3/0/Endpoint/protocolInformation
     *
     * @return Returns the ProtocolInformation for the property protocolInformation.
     */
    @IRI("https://admin-shell.io/aas/3/0/Endpoint/protocolInformation")
    ProtocolInformation getProtocolInformation();

    /**
     * Endpoint type.
     *
     * More information under https://admin-shell.io/aas/3/0/Endpoint/protocolInformation
     *
     * @param protocolInformation desired value for the property protocolInformation.
     */
    void setProtocolInformation(ProtocolInformation protocolInformation);

    /**
     * Endpoint type.
     *
     * More information under https://admin-shell.io/aas/3/0/Endpoint/endpointInterface
     *
     * @return Returns the String for the property endpointInterface.
     */
    @IRI("https://admin-shell.io/aas/3/0/Endpoint/endpointInterface")
    String getEndpointInterface();

    /**
     * Endpoint type.
     *
     * More information under https://admin-shell.io/aas/3/0/Endpoint/endpointInterface
     *
     * @param endpointInterface desired value for the property endpointInterface.
     */
    void setEndpointInterface(String endpointInterface);

}
