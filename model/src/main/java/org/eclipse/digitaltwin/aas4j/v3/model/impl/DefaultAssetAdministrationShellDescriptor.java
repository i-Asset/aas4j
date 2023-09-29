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
 * Default implementation of package
 * org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShellDescriptor
 * 
 * Descriptor of an Asset Adminstration Shell.
 */

@IRI("aas:AssetAdministrationShellDescriptor")
public class DefaultAssetAdministrationShellDescriptor implements AssetAdministrationShellDescriptor {

    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/assetKind")
    protected AssetKind assetKind;

    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/assetType")
    protected ExternalReference assetType;

    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/endpoint")
    protected List<Endpoint> endpoints = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/globalAssetId")
    protected String globalAssetId;

    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/specificAssetId")
    protected List<SpecificAssetId> specificAssetIds = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/submodelDescriptor")
    protected List<SubmodelDescriptor> submodelDescriptors = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/HasExtensions/extension")
    protected List<Extension> extensions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Identifiable/administration")
    protected AdministrativeInformation administration;

    @IRI("https://admin-shell.io/aas/3/0/Identifiable/id")
    protected String id;

    @IRI("https://admin-shell.io/aas/3/0/Referable/category")
    protected String category;

    @IRI("https://admin-shell.io/aas/3/0/Referable/description")
    protected List<LangString> descriptions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Referable/displayName")
    protected List<LangString> displayNames = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Referable/idShort")
    protected String idShort;

    public DefaultAssetAdministrationShellDescriptor() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.assetKind,
            this.assetType,
            this.globalAssetId,
            this.specificAssetIds,
            this.submodelDescriptors,
            this.endpoints,
            this.administration,
            this.id,
            this.category,
            this.descriptions,
            this.displayNames,
            this.idShort,
            this.extensions);
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
            DefaultAssetAdministrationShellDescriptor other = (DefaultAssetAdministrationShellDescriptor) obj;
            return Objects.equals(this.assetKind, other.assetKind) &&
                Objects.equals(this.assetType, other.assetType) &&
                Objects.equals(this.globalAssetId, other.globalAssetId) &&
                Objects.equals(this.specificAssetIds, other.specificAssetIds) &&
                Objects.equals(this.submodelDescriptors, other.submodelDescriptors) &&
                Objects.equals(this.endpoints, other.endpoints) &&
                Objects.equals(this.administration, other.administration) &&
                Objects.equals(this.id, other.id) &&
                Objects.equals(this.category, other.category) &&
                Objects.equals(this.descriptions, other.descriptions) &&
                Objects.equals(this.displayNames, other.displayNames) &&
                Objects.equals(this.idShort, other.idShort) &&
                Objects.equals(this.extensions, other.extensions);
        }
    }

    @Override
    public AssetKind getAssetKind() {
        return assetKind;
    }

    @Override
    public void setAssetKind(AssetKind assetKind) {
        this.assetKind = assetKind;
    }

    @Override
    public ExternalReference getAssetType() {
        return assetType;
    }

    @Override
    public void setAssetType(ExternalReference assetType) {
        this.assetType = assetType;
    }

    @Override
    public String getGlobalAssetId() {
        return globalAssetId;
    }

    @Override
    public void setGlobalAssetId(String globalAssetId) {
        this.globalAssetId = globalAssetId;
    }

    @Override
    public List<SpecificAssetId> getSpecificAssetIds() {
        return specificAssetIds;
    }

    @Override
    public void setSpecificAssetIds(List<SpecificAssetId> specificAssetIds) {
        this.specificAssetIds = specificAssetIds;
    }

    @Override
    public List<SubmodelDescriptor> getSubmodelDescriptors() {
        return submodelDescriptors;
    }

    @Override
    public void setSubmodelDescriptors(List<SubmodelDescriptor> submodelDescriptors) {
        this.submodelDescriptors = submodelDescriptors;
    }

    @Override
    public List<Endpoint> getEndpoints() {
        return endpoints;
    }

    @Override
    public void setEndpoints(List<Endpoint> endpoints) {
        this.endpoints = endpoints;
    }

    @Override
    public AdministrativeInformation getAdministration() {
        return administration;
    }

    @Override
    public void setAdministration(AdministrativeInformation administration) {
        this.administration = administration;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public List<LangString> getDescriptions() {
        return descriptions;
    }

    @Override
    public void setDescriptions(List<LangString> descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public List<LangString> getDisplayNames() {
        return displayNames;
    }

    @Override
    public void setDisplayNames(List<LangString> displayNames) {
        this.displayNames = displayNames;
    }

    @Override
    public String getIdShort() {
        return idShort;
    }

    @Override
    public void setIdShort(String idShort) {
        this.idShort = idShort;
    }

    @Override
    public List<Extension> getExtensions() {
        return extensions;
    }

    @Override
    public void setExtensions(List<Extension> extensions) {
        this.extensions = extensions;
    }

    /**
     * This builder class can be used to construct a DefaultAssetAdministrationShellDescriptor bean.
     */
    public static class Builder extends AssetAdministrationShellDescriptorBuilder<DefaultAssetAdministrationShellDescriptor, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultAssetAdministrationShellDescriptor newBuildingInstance() {
            return new DefaultAssetAdministrationShellDescriptor();
        }
    }
}
