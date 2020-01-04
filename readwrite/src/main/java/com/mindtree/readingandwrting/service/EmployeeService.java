package com.mindtree.readingandwrting.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.readingandwrting.entity.Employee;

@Service
public interface EmployeeService {

	String writeDataIntoFileDB();

	List<Employee> readDataFromFile();

	String writeDataIntoTxtFileDB();

}
