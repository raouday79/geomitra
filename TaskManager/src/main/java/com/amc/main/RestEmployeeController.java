package com.amc.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amc.main.dao.EmployeeDao;
import com.amc.main.entity.EmployeeEntity;

@RestController
@RequestMapping(value="/api")
public class RestEmployeeController {
	
	@Autowired
	EmployeeDao edao; 
	
	@PostMapping(value="add-employee",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity saveEmployee(@RequestBody	EmployeeEntity employeeEntity)
	{
		
		edao.save(employeeEntity);
		ResponseEntity response = new ResponseEntity<>(employeeEntity,HttpStatus.OK);
		
		return response;
		
		
	}
}
