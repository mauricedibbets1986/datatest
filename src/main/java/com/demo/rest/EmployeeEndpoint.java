package com.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.controller.EmployeeService;

@RestController
public class EmployeeEndpoint {
	@Autowired
	EmployeeService es;
	
	@GetMapping("/abc")
	
	void jojo() {
		System.out.println("endpoint aangeroepen");
		es.opslaan();
	}
	
	
	
}
