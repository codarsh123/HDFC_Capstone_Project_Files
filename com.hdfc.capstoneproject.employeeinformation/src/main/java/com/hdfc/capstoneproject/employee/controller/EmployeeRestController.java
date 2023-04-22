package com.hdfc.capstoneproject.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.capstoneproject.employee.dto.EmployeeDTO;
import com.hdfc.capstoneproject.employee.exception.EmployeeNotFoundException;
import com.hdfc.capstoneproject.employee.service.IEmployeeService;

@RestController
@RequestMapping("/capstone/project")
public class EmployeeRestController {

	@Autowired
	IEmployeeService service;
	
	@GetMapping("/get/employee/{employeeId}")
	public EmployeeDTO getEmployeeById(@PathVariable long employeeId) throws EmployeeNotFoundException {
		return service.getEmployeeById(employeeId);
	}
}
