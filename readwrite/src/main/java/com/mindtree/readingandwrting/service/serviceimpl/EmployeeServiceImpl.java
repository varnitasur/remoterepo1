package com.mindtree.readingandwrting.service.serviceimpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.result.Output;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.readingandwrting.entity.Employee;
import com.mindtree.readingandwrting.repository.EmployeeRepository;
import com.mindtree.readingandwrting.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public String writeDataIntoFileDB() {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Employee Details");
		
		Row rowHeader = sheet.createRow(0);
		rowHeader.createCell(0).setCellValue("Employee ID");
		rowHeader.createCell(1).setCellValue("Employee Name");
		rowHeader.createCell(2).setCellValue("Employee Designation");
		rowHeader.createCell(3).setCellValue("Employee Salary");
		
		List<Employee> employees = employeeRepository.findAll();
		
		int rowNum=1;
		
		for(Employee employee : employees) {
			
			Row rowEmployee = sheet.createRow(rowNum++);
			rowEmployee.createCell(0).setCellValue(employee.getEmployeeId());
			rowEmployee.createCell(1).setCellValue(employee.getEmployeeName());
			rowEmployee.createCell(2).setCellValue(employee.getEmployeeDesignation());
			rowEmployee.createCell(3).setCellValue(employee.getEmployeeSalary());
		}
		
		try {
			FileOutputStream file = new FileOutputStream("employee.xlsx");
			try {
				workbook.write(file);
				file.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		return "Written Successfully";
	}

	@Override
	public List<Employee> readDataFromFile() {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		FileInputStream inputFile = null;
		try {
			inputFile = new FileInputStream("employee.xlsx");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		try {
			XSSFWorkbook workbook = new  XSSFWorkbook(inputFile);
			
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			int count= 0;
			
			for(Row row : sheet) {
				if(count>0) {
				Employee employee = new Employee();
				employee.setEmployeeId((int) row.getCell(0).getNumericCellValue());
				employee.setEmployeeName(row.getCell(1).getStringCellValue());
				employee.setEmployeeDesignation(row.getCell(2).getStringCellValue());
				employee.setEmployeeSalary(row.getCell(3).getNumericCellValue());
				employees.add(employee);
				}
				count++;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		return employees;
	}

	@Override
	public String writeDataIntoTxtFileDB() {
		
		
		
		//Serialization
		
List<Employee> employ= new ArrayList<Employee>();
		
		Employee emp1 = new Employee(1, "Raj", 10000, "Gamer");
		Employee emp2 = new Employee(2, "Subham", 12000, "Player");
		Employee emp3 = new Employee(3,"Sonal",15000,"Model");
		employ.add(emp1);
		employ.add(emp2);
		employ.add(emp3);
		
	
			try {
				FileWriter fileWriter = new FileWriter("output.txt");
				
				for(Employee employee : employ) {
					fileWriter.write(employee.toString());
				}
				
				fileWriter.close();
				FileOutputStream file1 = new FileOutputStream(new File("employees.txt"));
				ObjectOutputStream op = new ObjectOutputStream(file1);
				op.writeObject(employ);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		
	//Deserialiation
		
			try {
				FileInputStream file2 = new FileInputStream("employees.txt");
				ObjectInputStream ip = new ObjectInputStream(file2);
				
				try {
					List<Employee> employees = (List<Employee>) ip.readObject();
					System.out.println(employees.toString());
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return "Written into text file";
	}

}
