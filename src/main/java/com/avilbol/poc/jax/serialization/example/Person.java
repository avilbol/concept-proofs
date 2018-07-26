package com.avilbol.poc.jax.serialization.example;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
	
	private String name;
	private String lastname;
	private BigDecimal moneySaved;
	
	private List<Certification> certifications;
	
	private Ubication ubication;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public BigDecimal getMoneySaved() {
		return moneySaved;
	}
	
	public void setMoneySaved(BigDecimal moneySaved) {
		this.moneySaved = moneySaved;
	}
	
	public List<Certification> getCertifications() {
		return certifications;
	}
	
	public void setCertifications(List<Certification> certifications) {
		this.certifications = certifications;
	}
	
	public Ubication getUbication() {
		return ubication;
	}
	
	public void setUbication(Ubication ubication) {
		this.ubication = ubication;
	}
}
