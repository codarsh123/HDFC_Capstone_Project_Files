package com.hdfc.capstoneproject.employee.service;

import com.hdfc.capstoneproject.employee.dto.EmployeeDTO;
import com.hdfc.capstoneproject.employee.exception.EmployeeNotFoundException;

public interface IEmployeeService {

	public EmployeeDTO getEmployeeById(long employeeId) throws EmployeeNotFoundException;
}
