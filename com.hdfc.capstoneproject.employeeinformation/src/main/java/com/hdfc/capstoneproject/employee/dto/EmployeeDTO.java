package com.hdfc.capstoneproject.employee.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeDTO {

	private long employeeId;
	private String employeeName;
	private LocalDate dateOfBirth;

}
