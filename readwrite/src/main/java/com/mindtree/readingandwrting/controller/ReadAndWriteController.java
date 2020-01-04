package com.mindtree.readingandwrting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.readingandwrting.entity.Employee;
import com.mindtree.readingandwrting.service.EmployeeService;

@RestController
public class ReadAndWriteController {

	@Autowired
	EmployeeService service;
	
	@PostMapping("/writeintoexcelfile")
	public String writeDataIntoFile() {
	
		String response = service.writeDataIntoFileDB();
		
		return response;
	}
	
	@GetMapping("/readfromexcelfile")
	public List<Employee> readFromFile(){
		
		List<Employee> employees = service.readDataFromFile();
		return employees;
	}
	
	@PostMapping("/writeintotxtfile")
	public String writeDataIntoTxtFile() {
	
		String response = service.writeDataIntoTxtFileDB();
		
		return response;
	}
	}
