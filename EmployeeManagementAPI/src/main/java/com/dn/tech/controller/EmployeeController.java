package com.dn.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dn.tech.model.Employee;
import com.dn.tech.service.EmployeeService;

@RestController
public class EmployeeController {
	public EmployeeController() {
		System.out.println("Employee Controller Object Created");
	}
	@
	Autowired EmployeeService empservice;
	@PostMapping("/saveemp")
	 public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
	        try {
	        	empservice.saveEmployeeRecored(employee);  // Service layer handles saving the Employee and Addresses
	            return new ResponseEntity<>(employee, HttpStatus.CREATED);  // Return created status with the saved employee object
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);  // Return 500 error if something goes wrong
	        }
	    }
}
