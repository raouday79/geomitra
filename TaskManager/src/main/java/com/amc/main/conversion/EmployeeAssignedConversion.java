package com.amc.main.conversion;

import java.util.ArrayList;
import java.util.List;

import com.amc.main.dto.EmployeeAssignedJobDto;
import com.amc.main.dto.EmployeeDto;
import com.amc.main.dto.JobAssignDto;
import com.amc.main.dto.JobDto;
import com.amc.main.entity.JobAssignEntity;

public class EmployeeAssignedConversion {
	
	
	public static List<EmployeeAssignedJobDto> toEmployeeAssignedDto(List<JobAssignEntity> l)
	{
		List<EmployeeAssignedJobDto> list = new ArrayList<EmployeeAssignedJobDto>();
		for(JobAssignEntity entity : l)
		{
			EmployeeAssignedJobDto edto = new EmployeeAssignedJobDto();
			JobAssignDto dto = new JobAssignDto();
			dto.setJobAssignId(entity.getJobAssignId());
			dto.setEmpId(entity.getEmpId());
			dto.setJobId(entity.getJobId());
			dto.setStart(entity.getJobStart());
			dto.setEnd(entity.getJobEnd());
			dto.setTotalHours(entity.getTotalHrSpend());
			
			
			EmployeeDto employeeDto = EmployeeConversion.toEmployeeDto(entity.getEmployeeEntity());
			
			
			JobDto jobDto = JobConversion.toJobDto(entity.getJobEntity());
			
			edto.setAssignDto(dto);
			edto.setJobDto(jobDto);
			edto.setEmployeeDto(employeeDto);
			
			list.add(edto);
			
			
		}
		
		return list;
		
	}
	
	public static JobAssignEntity toAssignEntity(EmployeeAssignedJobDto dto)
	{
		JobAssignEntity entity = new JobAssignEntity();
		entity.setJobAssignId(dto.getAssignDto().getJobAssignId());
		entity.setJobEntity(JobConversion.toJobEntity(dto.getJobDto()));
		entity.setEmployeeEntity(EmployeeConversion.toEmployeeEntity(dto.getEmployeeDto()));
		entity.setJobStart(dto.getAssignDto().getStart());
		entity.setJobEnd(dto.getAssignDto().getEnd());
		entity.setTotalHrSpend(dto.getAssignDto().getTotalHours());
		
		return entity;
		
		
		
		
	}

}
