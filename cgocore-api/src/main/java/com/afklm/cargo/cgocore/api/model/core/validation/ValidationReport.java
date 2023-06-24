package com.afklm.cargo.cgocore.api.model.core.validation;

import java.util.ArrayList;
import java.util.List;

public class ValidationReport {
	
	private List<ValidationResult> results = new ArrayList<>();

	public void addResult(ValidationResult result) {
		results.add(result);
	}

	public void addResult(String level, String mipCode, String description) {
		results.add(new ValidationResult(level, mipCode, description));
	}
	

	public boolean hasRejects() {
		return results.stream().anyMatch(e -> e.getLevel().equals(ValidationResult.ERROR));
	}

	public boolean hasWarnings() {
		return results.stream().anyMatch(e -> e.getLevel().equals(ValidationResult.WARNING));
	}

	

	public List<ValidationResult> getResults() {
		return results;
	}

	public void setResults(List<ValidationResult> results) {
		this.results = results;
	}
}
