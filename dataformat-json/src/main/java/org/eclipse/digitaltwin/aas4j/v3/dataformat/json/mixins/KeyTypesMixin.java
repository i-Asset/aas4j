package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.mixins;

import org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public interface KeyTypesMixin {
	@JsonValue
	public abstract String toString();
	@JsonCreator
	public abstract KeyTypes fromValue(String text);
}
