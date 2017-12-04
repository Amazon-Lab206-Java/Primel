package com.rimelp.grouplanguages.models;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Language {

	@Size(min = 2, max = 20)
	private String name;
	
	@Size(min = 2, max = 20)
	private String creator;
	
	@NotBlank
	private String currentVersion;
	
	public Language() {
		
	}
	
	public Language(String name, String creator, String currentVersion) {
		this.name = name;
		this.creator = creator;
		this.currentVersion = currentVersion;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCurrentVersion() {
		return currentVersion;
	}

	public void setCurrentVersion(String currentVersion) {
		this.currentVersion = currentVersion;
	}
	
}
