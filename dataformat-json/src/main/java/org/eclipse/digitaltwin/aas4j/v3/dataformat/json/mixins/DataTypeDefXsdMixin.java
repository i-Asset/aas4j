package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.mixins;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public interface DataTypeDefXsdMixin {
	@JsonValue
	public abstract String toString();
	@JsonCreator
	public abstract DataTypeDefXsdMixin fromValue(String text);
}
