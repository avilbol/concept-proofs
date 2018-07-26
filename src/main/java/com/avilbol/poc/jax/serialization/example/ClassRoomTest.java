package com.avilbol.poc.jax.serialization.example;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ClassRoomTest {

	public static void main(String[] args) throws JAXBException {
		ClassRoom classroom = generateClassRoomForPhysics();
		JAXBContext jc = JAXBContext.newInstance(ClassRoom.class);
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(classroom, System.out);
	}

	public static ClassRoom generateClassRoomForPhysics() {
		ClassRoom classroom = new ClassRoom();
		//classroom.setName("Physics");
		List<Person> students = new ArrayList<>();
		Person student = new Person();
		student.setLastname("Herrera");
		students.add(student);
		//classroom.setStudents(null);
		//classroom.setTeacher(new Person());
		//classroom.getTeacher().setLastname("Jimenez");
		return classroom;
	}

	public static ClassRoom generateClassRoomForMath() {
		ClassRoom classroom = new ClassRoom();
		return classroom;
	}
}
