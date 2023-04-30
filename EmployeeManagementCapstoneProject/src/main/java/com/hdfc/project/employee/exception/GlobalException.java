package com.hdfc.project.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<String> employeeNotFoundException(){
		return new ResponseEntity<String>("Invalid EmployeeID ",HttpStatus.NOT_FOUND);

	}
}
