package com.hdfc.employee.resttemplet.cliententity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Employee {
	private long employeeId;
	private String employeeName;
	private LocalDate dateOfBirth;
}
