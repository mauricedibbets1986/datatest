package com.demo.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.domain.Employee;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	public EmployeeRepository er;
	
	public void opslaan() {
		Employee employee = new Employee();
		employee.name = "Piet";
		er.save(employee);
	}
	
}
