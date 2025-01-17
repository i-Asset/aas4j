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

import java.util.Arrays;
import java.util.Objects;

import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;

/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.EventPayload
 * 
 * Defines the necessary information of an event instance sent out or received.
 */

@IRI("aas:EventPayload")
public class DefaultEventPayload implements EventPayload {

    @IRI("https://admin-shell.io/aas/3/0/EventPayload/observableReference")
    protected ModelReference observableReference;

    @IRI("https://admin-shell.io/aas/3/0/EventPayload/observableSemanticId")
    protected Reference observableSemanticId;

    @IRI("https://admin-shell.io/aas/3/0/EventPayload/payload")
    protected byte[] payload;

    @IRI("https://admin-shell.io/aas/3/0/EventPayload/source")
    protected ModelReference source;

    @IRI("https://admin-shell.io/aas/3/0/EventPayload/sourceSemanticId")
    protected Reference sourceSemanticId;

    @IRI("https://admin-shell.io/aas/3/0/EventPayload/subjectId")
    protected Reference subjectId;

    @IRI("https://admin-shell.io/aas/3/0/EventPayload/timeStamp")
    protected String timeStamp;

    @IRI("https://admin-shell.io/aas/3/0/EventPayload/topic")
    protected String topic;

    public DefaultEventPayload() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.observableReference,
            this.observableSemanticId,
            Arrays.hashCode(this.payload),
            this.source,
            this.sourceSemanticId,
            this.subjectId,
            this.timeStamp,
            this.topic);
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
            DefaultEventPayload other = (DefaultEventPayload) obj;
            return Objects.equals(this.observableReference, other.observableReference) &&
                Objects.equals(this.observableSemanticId, other.observableSemanticId) &&
                Arrays.equals(this.payload, other.payload) &&
                Objects.equals(this.source, other.source) &&
                Objects.equals(this.sourceSemanticId, other.sourceSemanticId) &&
                Objects.equals(this.subjectId, other.subjectId) &&
                Objects.equals(this.timeStamp, other.timeStamp) &&
                Objects.equals(this.topic, other.topic);
        }
    }

    @Override
    public ModelReference getObservableReference() {
        return observableReference;
    }

    @Override
    public void setObservableReference(ModelReference observableReference) {
        this.observableReference = observableReference;
    }

    @Override
    public Reference getObservableSemanticId() {
        return observableSemanticId;
    }

    @Override
    public void setObservableSemanticId(Reference observableSemanticId) {
        this.observableSemanticId = observableSemanticId;
    }

    @Override
    public byte[] getPayload() {
        return payload;
    }

    @Override
    public void setPayload(byte[] payload) {
        this.payload = payload;
    }

    @Override
    public ModelReference getSource() {
        return source;
    }

    @Override
    public void setSource(ModelReference source) {
        this.source = source;
    }

    @Override
    public Reference getSourceSemanticId() {
        return sourceSemanticId;
    }

    @Override
    public void setSourceSemanticId(Reference sourceSemanticId) {
        this.sourceSemanticId = sourceSemanticId;
    }

    @Override
    public Reference getSubjectId() {
        return subjectId;
    }

    @Override
    public void setSubjectId(Reference subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public String getTimeStamp() {
        return timeStamp;
    }

    @Override
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String getTopic() {
        return topic;
    }

    @Override
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * This builder class can be used to construct a DefaultEventPayload bean.
     */
    public static class Builder extends EventPayloadBuilder<DefaultEventPayload, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultEventPayload newBuildingInstance() {
            return new DefaultEventPayload();
        }
    }
}
