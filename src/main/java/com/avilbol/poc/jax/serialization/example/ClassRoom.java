package com.avilbol.poc.jax.serialization.example;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ClassRoom {
	
	@XmlJavaTypeAdapter(value = ListAdapter.class)
	private List<Person> students;
	
	private Person teacher;
	
	
	private String name;
	
	public List<Person> getStudents() {
		return students;
	}
	
	public void setStudents(List<Person> students) {
		this.students = students;
	}
	
	public Person getTeacher() {
		return teacher;
	}
	
	public void setTeacher(Person teacher) {
		this.teacher = teacher;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
