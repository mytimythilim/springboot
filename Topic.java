package io.javabrains.springbootstarter.topic;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;

public class Topic {
	
	private String id;
	private String name;
	private String description;

	public Topic() {
		super();
		this.id = "Spring";
		this.name = "Spring boot";
		this.description = "Spring description";
	}
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
