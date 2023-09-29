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
 * Descriptor of an Asset Adminstration Shell.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAssetAdministrationShellDescriptor.class)
})
public interface AssetAdministrationShellDescriptor extends Descriptor {

    /**
     * Denotes whether the Asset is of kind 'Type' or 'Instance'.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/assetKind
     *
     * @return Returns the AssetKind for the property assetKind.
     */
    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/assetKind")
    AssetKind getAssetKind();

    /**
     * Denotes whether the Asset is of kind 'Type' or 'Instance'.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/assetKind
     *
     * @param assetKind desired value for the property assetKind.
     */
    void setAssetKind(AssetKind assetKind);

    /**
     * In case 'assetKind' is applicable the 'assetType' is the asset ID of the type asset of the asset
     * under consideration as identified by 'globalAssetId'.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/assetType
     *
     * @return Returns the ExternalReference for the property assetType.
     */
    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/assetType")
    ExternalReference getAssetType();

    /**
     * In case 'assetKind' is applicable the 'assetType' is the asset ID of the type asset of the asset
     * under consideration as identified by 'globalAssetId'.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/assetType
     *
     * @param assetType desired value for the property assetType.
     */
    void setAssetType(ExternalReference assetType);

    /**
     * Global identifier of the asset the AAS is representing.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/globalAssetId
     *
     * @return Returns the String for the property globalAssetId.
     */
    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/globalAssetId")
    String getGlobalAssetId();

    /**
     * Global identifier of the asset the AAS is representing.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/globalAssetId
     *
     * @param globalAssetId desired value for the property globalAssetId.
     */
    void setGlobalAssetId(String globalAssetId);

    /**
     * Additional domain-specific, typically proprietary identifier for the asset like e.g., serial
     * number etc.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/specificAssetId
     *
     * @return Returns the List of SpecificAssetIds for the property specificAssetIds.
     */
    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/specificAssetId")
    List<SpecificAssetId> getSpecificAssetIds();

    /**
     * Additional domain-specific, typically proprietary identifier for the asset like e.g., serial
     * number etc.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/specificAssetId
     *
     * @param specificAssetIds desired value for the property specificAssetIds.
     */
    void setSpecificAssetIds(List<SpecificAssetId> specificAssetIds);

    /**
     * Descriptor of a Submodel of the Asset Administration Shell
     *
     * More information under
     * https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/submodelDescriptor
     *
     * @return Returns the List of SubmodelDescriptors for the property submodelDescriptors.
     */
    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/submodelDescriptor")
    List<SubmodelDescriptor> getSubmodelDescriptors();

    /**
     * Descriptor of a Submodel of the Asset Administration Shell
     *
     * More information under
     * https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/submodelDescriptor
     *
     * @param submodelDescriptors desired value for the property submodelDescriptors.
     */
    void setSubmodelDescriptors(List<SubmodelDescriptor> submodelDescriptors);

}
