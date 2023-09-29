package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.mixins;

import org.eclipse.digitaltwin.aas4j.v3.model.AssetKind;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public interface AssetKindMixin {
	@JsonValue
	public abstract String toString();
	@JsonCreator
	public abstract AssetKind fromValue(String text);
}
