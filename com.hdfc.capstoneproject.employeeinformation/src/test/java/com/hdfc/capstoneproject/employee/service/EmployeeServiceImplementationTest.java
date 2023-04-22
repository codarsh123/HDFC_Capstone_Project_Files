package com.hdfc.capstoneproject.employee.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hdfc.capstoneproject.employee.dto.EmployeeDTO;
import com.hdfc.capstoneproject.employee.entity.Employee;
import com.hdfc.capstoneproject.employee.exception.EmployeeNotFoundException;
@SpringBootTest
class EmployeeServiceImplementationTest {

	@Autowired
	IEmployeeService service;
	
	@Test
	void testGetEmployeeById() throws EmployeeNotFoundException {
	long employeeId = 1L;
	Employee employee =new Employee();
	employee.setEmployeeId(employeeId);
	employee.setEmployeeName("Adarsh Verma");
	employee.setDateOfBirth(LocalDate.of(2000, 8, 18));
	
	EmployeeDTO employeeDTO= service.getEmployeeById(employeeId);
	assertNotNull(employeeDTO);
	assertEquals(employee.getEmployeeId(), employeeDTO.getEmployeeId());
	assertEquals(employee.getEmployeeName(), employeeDTO.getEmployeeName());
	assertEquals(employee.getDateOfBirth(), employeeDTO.getDateOfBirth());
	}

}
