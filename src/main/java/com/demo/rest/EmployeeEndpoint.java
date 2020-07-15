package com.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeEndpoint {

	@GetMapping("/abc")
	void jojo() {
		System.out.println("endpoint aangeroepen");
	}
	
	
}
