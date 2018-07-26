package com.avilbol.poc.jax.serialization.example;

import java.util.Date;

public class Certification {

	private Date dateOfPursuing;
	private String fullname;
	private String description;
	
	public Date getDateOfPursuing() {
		return dateOfPursuing;
	}
	
	public void setDateOfPursuing(Date dateOfPursuing) {
		this.dateOfPursuing = dateOfPursuing;
	}
	
	public String getFullname() {
		return fullname;
	}
	
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
