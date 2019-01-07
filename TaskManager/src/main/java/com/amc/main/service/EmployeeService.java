package com.amc.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amc.main.conversion.EmployeeConversion;
import com.amc.main.dto.EmployeeDto;
import com.amc.main.entity.EmployeeEntity;
import com.amc.main.entity.JobAssignEntity;
import com.amc.main.repository.EmployeeRepository;
@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	public EmployeeEntity  registerEmployee(EmployeeEntity employeeEntity)
	{
		employeeRepository.save(employeeEntity);
		return employeeEntity;
		
	}

	public List<EmployeeDto> getAllEmployee()
	{
		List<EmployeeEntity> list = employeeRepository.findAll();
		List<EmployeeDto> l = EmployeeConversion.toEmployeeDtoList(list);
	
	return l;
	}
	
}
