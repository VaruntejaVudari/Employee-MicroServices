package com.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.entity.Employee;
import com.emp.service.EmployeeServiceImpl;
import com.emp.service.iEmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private iEmployeeService employeeService;

	@GetMapping("/{eid}")
	public Employee getEmployee(@PathVariable("eid")Long eid) {
		Employee employee = this.employeeService.getEmployee(eid);
		return employee;
	}
}
