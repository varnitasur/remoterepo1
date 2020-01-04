package com.mindtree.serializedemoprog;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;

public class SerializationApp {
	public static void main(String[] args) {

		List<Student> studList = new ArrayList<Student>();
		studList.add(new Student("arpana", "kumari", 21));
		studList.add(new Student("ankita", "singh", 23));
		studList.add(new Student("saumya", "tripathi", 24));
		studList.add(new Student("suraj", "choudhary", 20));

		SerializationTest serializationTest = new SerializationTest();
		 serializationTest.serialize(studList,"Student.txt");
		List<Student> studentlist = serializationTest.deserialize("Student.txt");
		System.out.println(studentlist);

	}

}
