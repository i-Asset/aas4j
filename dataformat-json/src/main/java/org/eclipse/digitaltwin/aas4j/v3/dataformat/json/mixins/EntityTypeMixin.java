package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.mixins;

import org.eclipse.digitaltwin.aas4j.v3.model.EntityType;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public interface EntityTypeMixin {
	@JsonValue
	public abstract String toString();
	@JsonCreator
	public abstract EntityType fromValue(String text);
}
