package com.hdfc.capstoneproject.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.capstoneproject.employee.dto.EmployeeDTO;
import com.hdfc.capstoneproject.employee.entity.Employee;
import com.hdfc.capstoneproject.employee.exception.EmployeeNotFoundException;
import com.hdfc.capstoneproject.employee.repository.EmployeeRepository;
@Service
public class EmployeeServiceImplementation implements IEmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public EmployeeDTO getEmployeeById(long employeeId) throws EmployeeNotFoundException {
		Employee employee = employeeRepository.findById(employeeId).orElse(null);
		if (employee == null) {
	        throw new EmployeeNotFoundException();
	    }
		return mapToDto(employee);
	}

	
	private EmployeeDTO mapToDto(Employee employee) {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmployeeId(employee.getEmployeeId());
		employeeDTO.setEmployeeName(employee.getEmployeeName());
		employeeDTO.setDateOfBirth(employee.getDateOfBirth());
		return employeeDTO;
	}

	
	
	
	

}
