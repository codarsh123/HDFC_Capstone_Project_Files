package com.hdfc.employee.resttemplet.clientcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hdfc.employee.resttemplet.cliententity.EmployeeDTO;

@RestController
@RequestMapping("/client/web/service")
public class ClientRestController {

	@Autowired
	private RestTemplate restTemplet;
	
	//private static final String BASE_URL= "https://localhost:8282/capstone/practice/get/employees/";//test
	private static final String BASE_URL= "https://localhost:8585/capstone/project/get/employee/";//main program
	//private static final String BASE_URL= "https://127.0.0.1:52249/capstone/project/get/employee/";//with kubectl

	@GetMapping("/get/{employeeId}")
	public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable long employeeId) {
		return restTemplet.getForEntity(BASE_URL+employeeId, EmployeeDTO.class);
	}
	
	
}
