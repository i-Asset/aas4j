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

public abstract class BasicEventElementBuilder<T extends BasicEventElement, B extends BasicEventElementBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for direction
     * 
     * @param direction desired value to be set
     * @return Builder object with new value for direction
     */
    public B direction(Direction direction) {
        getBuildingInstance().setDirection(direction);
        return getSelf();
    }

    /**
     * This function allows setting a value for lastUpdate
     * 
     * @param lastUpdate desired value to be set
     * @return Builder object with new value for lastUpdate
     */
    public B lastUpdate(String lastUpdate) {
        getBuildingInstance().setLastUpdate(lastUpdate);
        return getSelf();
    }

    /**
     * This function allows setting a value for maxInterval
     * 
     * @param maxInterval desired value to be set
     * @return Builder object with new value for maxInterval
     */
    public B maxInterval(String maxInterval) {
        getBuildingInstance().setMaxInterval(maxInterval);
        return getSelf();
    }

    /**
     * This function allows setting a value for messageBroker
     * 
     * @param messageBroker desired value to be set
     * @return Builder object with new value for messageBroker
     */
    public B messageBroker(ModelReference messageBroker) {
        getBuildingInstance().setMessageBroker(messageBroker);
        return getSelf();
    }

    /**
     * This function allows setting a value for messageTopic
     * 
     * @param messageTopic desired value to be set
     * @return Builder object with new value for messageTopic
     */
    public B messageTopic(String messageTopic) {
        getBuildingInstance().setMessageTopic(messageTopic);
        return getSelf();
    }

    /**
     * This function allows setting a value for minInterval
     * 
     * @param minInterval desired value to be set
     * @return Builder object with new value for minInterval
     */
    public B minInterval(String minInterval) {
        getBuildingInstance().setMinInterval(minInterval);
        return getSelf();
    }

    /**
     * This function allows setting a value for observed
     * 
     * @param observed desired value to be set
     * @return Builder object with new value for observed
     */
    public B observed(ModelReference observed) {
        getBuildingInstance().setObserved(observed);
        return getSelf();
    }

    /**
     * This function allows setting a value for state
     * 
     * @param state desired value to be set
     * @return Builder object with new value for state
     */
    public B state(StateOfEvent state) {
        getBuildingInstance().setState(state);
        return getSelf();
    }

    /**
     * This function allows setting a value for embeddedDataSpecifications
     * 
     * @param embeddedDataSpecifications desired value to be set
     * @return Builder object with new value for embeddedDataSpecifications
     */
    public B embeddedDataSpecifications(List<EmbeddedDataSpecification> embeddedDataSpecifications) {
        getBuildingInstance().setEmbeddedDataSpecifications(embeddedDataSpecifications);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List embeddedDataSpecifications
     * 
     * @param embeddedDataSpecification desired value to be added
     * @return Builder object with new value for embeddedDataSpecifications
     */
    public B embeddedDataSpecification(EmbeddedDataSpecification embeddedDataSpecification) {
        getBuildingInstance().getEmbeddedDataSpecifications().add(embeddedDataSpecification);
        return getSelf();
    }

    /**
     * This function allows setting a value for semanticId
     * 
     * @param semanticId desired value to be set
     * @return Builder object with new value for semanticId
     */
    public B semanticId(Reference semanticId) {
        getBuildingInstance().setSemanticId(semanticId);
        return getSelf();
    }

    /**
     * This function allows setting a value for supplementalSemanticIds
     * 
     * @param supplementalSemanticIds desired value to be set
     * @return Builder object with new value for supplementalSemanticIds
     */
    public B supplementalSemanticIds(List<Reference> supplementalSemanticIds) {
        getBuildingInstance().setSupplementalSemanticIds(supplementalSemanticIds);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List supplementalSemanticIds
     * 
     * @param supplementalSemanticIds desired value to be added
     * @return Builder object with new value for supplementalSemanticIds
     */
    public B supplementalSemanticIds(Reference supplementalSemanticIds) {
        getBuildingInstance().getSupplementalSemanticIds().add(supplementalSemanticIds);
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

    /**
     * This function allows setting a value for qualifiers
     * 
     * @param qualifiers desired value to be set
     * @return Builder object with new value for qualifiers
     */
    public B qualifiers(List<Qualifier> qualifiers) {
        getBuildingInstance().setQualifiers(qualifiers);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List qualifiers
     * 
     * @param qualifier desired value to be added
     * @return Builder object with new value for qualifiers
     */
    public B qualifier(Qualifier qualifier) {
        getBuildingInstance().getQualifiers().add(qualifier);
        return getSelf();
    }
}
