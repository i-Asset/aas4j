package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.mixins;

import org.eclipse.digitaltwin.aas4j.v3.model.ModellingKind;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public interface ModellingKindMixin {
	@JsonValue
	public abstract String toString();
	@JsonCreator
	public abstract ModellingKind fromValue(String text);
}
