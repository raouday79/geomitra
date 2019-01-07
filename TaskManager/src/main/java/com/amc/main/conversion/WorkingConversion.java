package com.amc.main.conversion;

import com.amc.main.dto.EmployeeAssignedJobDto;
import com.amc.main.dto.WorkingDto;
import com.amc.main.entity.JobAssignEntity;
import com.amc.main.entity.WorkingEntity;

public class WorkingConversion {
	
	
	public static WorkingEntity toWorkingEntity(WorkingDto workingDto)
	{
		WorkingEntity entity = new WorkingEntity();
		
		entity.setDate(workingDto.getDate());
		entity.setHourSpent(workingDto.getHourSpent());
		
		EmployeeAssignedJobDto assignedJobDto = workingDto.getEmployeeWorking();
		JobAssignEntity assignEntity = EmployeeAssignedConversion.toAssignEntity(assignedJobDto);
		int a = Integer.parseInt(workingDto.getHourSpent());
		int b = Integer.parseInt(assignEntity.getTotalHrSpend());
		int c = a+b;
		assignEntity.setTotalHrSpend(c+"");
		
		return entity;
		
	}

}
