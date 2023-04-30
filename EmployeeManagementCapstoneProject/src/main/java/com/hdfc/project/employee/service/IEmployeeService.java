package com.hdfc.project.employee.service;

import com.hdfc.project.employee.dto.EmployeeDTO;
import com.hdfc.project.employee.exception.EmployeeNotFoundException;

public interface IEmployeeService {

	public EmployeeDTO getEmployeeById(long employeeId) throws EmployeeNotFoundException,Exception;
}
