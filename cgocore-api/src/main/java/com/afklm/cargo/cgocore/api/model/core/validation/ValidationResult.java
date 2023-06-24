package com.afklm.cargo.cgocore.api.model.core.validation;

public class ValidationResult {
	
	public static final String ERROR = "ERROR";
	public static final String WARNING = "WARNING";
	
	/*
	 * constructors
	 */
	public ValidationResult() {}

	
	
	public ValidationResult(String level, String mipCode, String description) {
		super();
		this.level = level;
		this.mipCode = mipCode;
		this.description = description;
	}
	
	
	/*
	 * properties
	 */
	private String level;
	private String mipCode;
	private String description;

	

	/*
	 * getters and setters
	 */
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getMipCode() {
		return mipCode;
	}
	public void setMipCode(String mipCode) {
		this.mipCode = mipCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
