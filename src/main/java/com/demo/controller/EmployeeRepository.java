package com.demo.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.demo.domain.Employee;

@Component
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
