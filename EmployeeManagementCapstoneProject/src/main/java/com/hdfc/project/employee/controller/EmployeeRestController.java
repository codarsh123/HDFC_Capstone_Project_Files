package com.hdfc.project.employee.controller;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.project.employee.dto.EmployeeDTO;
import com.hdfc.project.employee.service.IEmployeeService;



@RestController
@RequestMapping("/capstone/project")
public class EmployeeRestController {
//https://localhost:8585/capstone/project/get/employee/5
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeRestController.class);
	@Autowired
	IEmployeeService service;
	
	@GetMapping("/get/employee/{employeeId}")
	public EmployeeDTO getEmployeeById(@PathVariable long employeeId) throws Exception {
		LOGGER.info("Web service called by getEmployeeById at {}", LocalDateTime.now());
		return service.getEmployeeById(employeeId);
	}
}
