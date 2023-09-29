package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.mixins;

import org.eclipse.digitaltwin.aas4j.v3.model.Direction;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public interface DirectionMixin {
	@JsonValue
	public abstract String toString();
	@JsonCreator
	public abstract Direction fromValue(String text);
}
