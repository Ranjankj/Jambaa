package com.ranjan.database.jdbctutorial.entity;

import java.sql.Date;

public class Person {
	private int id;
	private String name;
	private String location;
	private Date dateOfBirth;
	public Person(){};
	public Person(int id, String name, String location, Date dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.dateOfBirth = dateOfBirth;
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
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ", location=" + location + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	

	
}
