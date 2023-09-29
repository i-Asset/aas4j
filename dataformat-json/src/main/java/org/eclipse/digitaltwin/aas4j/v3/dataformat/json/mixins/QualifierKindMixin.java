package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.mixins;

import org.eclipse.digitaltwin.aas4j.v3.model.QualifierKind;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public interface QualifierKindMixin {
	@JsonValue
	public abstract String toString();
	@JsonCreator
	public abstract QualifierKind fromValue(String text);
}
