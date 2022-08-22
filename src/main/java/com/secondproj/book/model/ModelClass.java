package com.secondproj.book.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ModelClass {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String location;
	private String description;
	public ModelClass(int id, String name, String location, String description) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.description = description;
	}
	public ModelClass() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	

}
