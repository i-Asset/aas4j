package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.mixins;

import org.eclipse.digitaltwin.aas4j.v3.model.AasSubmodelElements;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public interface AasSubmodelElementsMixin {
	@JsonValue
	public abstract String toString();
	@JsonCreator
	public abstract AasSubmodelElements fromValue(String text);
}
