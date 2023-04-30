package com.hdfc.project.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.project.employee.dto.EmployeeDTO;
import com.hdfc.project.employee.entity.Employee;
import com.hdfc.project.employee.exception.EmployeeNotFoundException;
import com.hdfc.project.employee.repository.EmployeeRepository;


@Service
public class EmployeeServiceImplementation implements IEmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public EmployeeDTO getEmployeeById(long employeeId) throws Exception {
		Employee employee = employeeRepository.findById(employeeId).orElse(null);
		if (employee == null) {
	        throw new EmployeeNotFoundException();
	    }
		return mapToDto(employee);
	}

	
	private EmployeeDTO mapToDto(Employee employee) throws Exception {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmployeeId(employee.getEmployeeId());
		employeeDTO.setEmployeeName(employee.getEmployeeName());
		employeeDTO.setDateOfBirth(employee.getDateOfBirth());
		return employeeDTO;
	}

	
	
	
	

}
