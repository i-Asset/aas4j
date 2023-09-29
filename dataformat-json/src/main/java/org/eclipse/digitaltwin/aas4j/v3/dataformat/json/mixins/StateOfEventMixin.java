package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.mixins;

import org.eclipse.digitaltwin.aas4j.v3.model.StateOfEvent;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public interface StateOfEventMixin {
	@JsonValue
	public abstract String toString();
	@JsonCreator
	public abstract StateOfEvent fromValue(String text);
}
