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

package org.eclipse.digitaltwin.aas4j.v3.model.builder;

import java.util.List;

import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;

public abstract class ProtocolInformationBuilder<T extends ProtocolInformation, B extends ProtocolInformationBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for href
     * 
     * @param href desired value to be set
     * @return Builder object with new value for href
     */
    public B href(String href) {
        getBuildingInstance().setHref(href);
        return getSelf();
    }

    /**
     * This function allows setting a value for endpointProtocol
     * 
     * @param endpointProtocol desired value to be set
     * @return Builder object with new value for endpointProtocol
     */
    public B endpointProtocol(String endpointProtocol) {
        getBuildingInstance().setEndpointProtocol(endpointProtocol);
        return getSelf();
    }

    /**
     * This function allows setting a value for endpointProtocolVersion
     * 
     * @param endpointProtocolVersion desired value to be set
     * @return Builder object with new value for endpointProtocolVersion
     */
    public B endpointProtocolVersion(String endpointProtocolVersion) {
        getBuildingInstance().setEndpointProtocolVersion(endpointProtocolVersion);
        return getSelf();
    }

    /**
     * This function allows setting a value for subprotocol
     * 
     * @param subprotocol desired value to be set
     * @return Builder object with new value for subprotocol
     */
    public B subprotocol(String subprotocol) {
        getBuildingInstance().setSubprotocol(subprotocol);
        return getSelf();
    }

    /**
     * This function allows setting a value for subprotocolBody
     * 
     * @param subprotocolBody desired value to be set
     * @return Builder object with new value for subprotocolBody
     */
    public B subprotocolBody(String subprotocolBody) {
        getBuildingInstance().setSubprotocolBody(subprotocolBody);
        return getSelf();
    }

    /**
     * This function allows setting a value for subprotocolBodyEndcodings
     * 
     * @param subprotocolBodyEndcodings desired value to be set
     * @return Builder object with new value for subprotocolBodyEndcodings
     */
    public B subprotocolBodyEndcodings(List<String> subprotocolBodyEndcodings) {
        getBuildingInstance().setSubprotocolBodyEndcodings(subprotocolBodyEndcodings);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List subprotocolBodyEndcodings
     * 
     * @param subprotocolBodyEndcoding desired value to be added
     * @return Builder object with new value for subprotocolBodyEndcodings
     */
    public B subprotocolBodyEndcoding(String subprotocolBodyEndcoding) {
        getBuildingInstance().getSubprotocolBodyEndcodings().add(subprotocolBodyEndcoding);
        return getSelf();
    }
}
