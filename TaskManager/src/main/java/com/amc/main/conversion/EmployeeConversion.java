package com.amc.main.conversion;

import java.util.ArrayList;
import java.util.List;

import com.amc.main.dto.EmployeeDto;
import com.amc.main.entity.EmployeeEntity;

public class EmployeeConversion {
	
	
	public static EmployeeDto toEmployeeDto(EmployeeEntity entity)
	{
		EmployeeDto emp = new EmployeeDto();
		emp.setEmpId(entity.getEmpId());
		emp.setEmpName(entity.getEmpName());
		emp.setContact(entity.getContact());
		emp.setNoOfJobAssigned(entity.getNoOfJobAssigned());
		
		return emp;
		
	}
	
	
	public static EmployeeEntity toEmployeeEntity(EmployeeDto dto)
	{
		EmployeeEntity entity = new EmployeeEntity();
		entity.setEmpId(dto.getEmpId());
		entity.setEmpName(dto.getEmpName());
		entity.setContact(dto.getContact());
		entity.setNoOfJobAssigned(dto.getNoOfJobAssigned());
		
		return entity;
	}
	
	public static List<EmployeeDto> toEmployeeDtoList(List<EmployeeEntity> list)
	{
		List<EmployeeDto> l = new ArrayList<EmployeeDto>();
	
		for(EmployeeEntity entity : list)
		{
		
		EmployeeDto emp = new EmployeeDto();
		emp.setEmpId(entity.getEmpId());
		emp.setEmpName(entity.getEmpName());
		emp.setContact(entity.getContact());
		emp.setNoOfJobAssigned(entity.getNoOfJobAssigned());
		
		l.add(emp);
		}
		return l;
		
	}
	
	
	public static List<EmployeeEntity> toEmployeeEntityList(List<EmployeeDto> list)
	{
		
		List<EmployeeEntity> l = new ArrayList<EmployeeEntity>();
		for(EmployeeDto dto : list)
		{
		
		EmployeeEntity entity = new EmployeeEntity();
		entity.setEmpId(dto.getEmpId());
		entity.setEmpName(dto.getEmpName());
		entity.setContact(dto.getContact());
		entity.setNoOfJobAssigned(dto.getNoOfJobAssigned());
		l.add(entity);
		
		}
		return l;
	}

}
