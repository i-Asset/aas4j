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

public abstract class AssetAdministrationShellDescriptorBuilder<T extends AssetAdministrationShellDescriptor, B extends AssetAdministrationShellDescriptorBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for assetKind
     * 
     * @param assetKind desired value to be set
     * @return Builder object with new value for assetKind
     */
    public B assetKind(AssetKind assetKind) {
        getBuildingInstance().setAssetKind(assetKind);
        return getSelf();
    }

    /**
     * This function allows setting a value for assetType
     * 
     * @param assetType desired value to be set
     * @return Builder object with new value for assetType
     */
    public B assetType(ExternalReference assetType) {
        getBuildingInstance().setAssetType(assetType);
        return getSelf();
    }

    /**
     * This function allows setting a value for globalAssetId
     * 
     * @param globalAssetId desired value to be set
     * @return Builder object with new value for globalAssetId
     */
    public B globalAssetId(String globalAssetId) {
        getBuildingInstance().setGlobalAssetId(globalAssetId);
        return getSelf();
    }

    /**
     * This function allows setting a value for specificAssetIds
     * 
     * @param specificAssetIds desired value to be set
     * @return Builder object with new value for specificAssetIds
     */
    public B specificAssetIds(List<SpecificAssetId> specificAssetIds) {
        getBuildingInstance().setSpecificAssetIds(specificAssetIds);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List specificAssetIds
     * 
     * @param specificAssetId desired value to be added
     * @return Builder object with new value for specificAssetIds
     */
    public B specificAssetId(SpecificAssetId specificAssetId) {
        getBuildingInstance().getSpecificAssetIds().add(specificAssetId);
        return getSelf();
    }

    /**
     * This function allows setting a value for submodelDescriptors
     * 
     * @param submodelDescriptors desired value to be set
     * @return Builder object with new value for submodelDescriptors
     */
    public B submodelDescriptors(List<SubmodelDescriptor> submodelDescriptors) {
        getBuildingInstance().setSubmodelDescriptors(submodelDescriptors);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List submodelDescriptors
     * 
     * @param submodelDescriptor desired value to be added
     * @return Builder object with new value for submodelDescriptors
     */
    public B submodelDescriptor(SubmodelDescriptor submodelDescriptor) {
        getBuildingInstance().getSubmodelDescriptors().add(submodelDescriptor);
        return getSelf();
    }

    /**
     * This function allows setting a value for endpoints
     * 
     * @param endpoints desired value to be set
     * @return Builder object with new value for endpoints
     */
    public B endpoints(List<Endpoint> endpoints) {
        getBuildingInstance().setEndpoints(endpoints);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List endpoints
     * 
     * @param endpoint desired value to be added
     * @return Builder object with new value for endpoints
     */
    public B endpoint(Endpoint endpoint) {
        getBuildingInstance().getEndpoints().add(endpoint);
        return getSelf();
    }

    /**
     * This function allows setting a value for administration
     * 
     * @param administration desired value to be set
     * @return Builder object with new value for administration
     */
    public B administration(AdministrativeInformation administration) {
        getBuildingInstance().setAdministration(administration);
        return getSelf();
    }

    /**
     * This function allows setting a value for id
     * 
     * @param id desired value to be set
     * @return Builder object with new value for id
     */
    public B id(String id) {
        getBuildingInstance().setId(id);
        return getSelf();
    }

    /**
     * This function allows setting a value for category
     * 
     * @param category desired value to be set
     * @return Builder object with new value for category
     */
    public B category(String category) {
        getBuildingInstance().setCategory(category);
        return getSelf();
    }

    /**
     * This function allows setting a value for descriptions
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for descriptions
     */
    public B descriptions(List<LangString> descriptions) {
        getBuildingInstance().setDescriptions(descriptions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List descriptions
     * 
     * @param description desired value to be added
     * @return Builder object with new value for descriptions
     */
    public B description(LangString description) {
        getBuildingInstance().getDescriptions().add(description);
        return getSelf();
    }

    /**
     * This function allows setting a value for displayNames
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayNames
     */
    public B displayNames(List<LangString> displayNames) {
        getBuildingInstance().setDisplayNames(displayNames);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List displayNames
     * 
     * @param displayName desired value to be added
     * @return Builder object with new value for displayNames
     */
    public B displayName(LangString displayName) {
        getBuildingInstance().getDisplayNames().add(displayName);
        return getSelf();
    }

    /**
     * This function allows setting a value for idShort
     * 
     * @param idShort desired value to be set
     * @return Builder object with new value for idShort
     */
    public B idShort(String idShort) {
        getBuildingInstance().setIdShort(idShort);
        return getSelf();
    }

    /**
     * This function allows setting a value for extensions
     * 
     * @param extensions desired value to be set
     * @return Builder object with new value for extensions
     */
    public B extensions(List<Extension> extensions) {
        getBuildingInstance().setExtensions(extensions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List extensions
     * 
     * @param extension desired value to be added
     * @return Builder object with new value for extensions
     */
    public B extension(Extension extension) {
        getBuildingInstance().getExtensions().add(extension);
        return getSelf();
    }
}
