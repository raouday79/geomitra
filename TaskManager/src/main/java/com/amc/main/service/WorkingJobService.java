package com.amc.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amc.main.conversion.WorkingConversion;
import com.amc.main.dto.JobRecordDto;
import com.amc.main.dto.WorkingDto;
import com.amc.main.entity.JobAssignEntity;
import com.amc.main.entity.WorkingEntity;
import com.amc.main.repository.JobAssignRepository;
import com.amc.main.repository.WorkingJobRepository;
import com.amc.main.utility.NotFoundException;
@Service
public class WorkingJobService 
{

	@Autowired
	WorkingJobRepository workingJobRepository;
	
	@Autowired
	JobAssignRepository jobAssignRepository;
	
	
	public List<WorkingEntity> getWorkingByAssignId(int id)
	{
		List<WorkingEntity> ws = workingJobRepository.findByAssignId(id);
		return ws;
	}
	
	
	public WorkingDto postWorkingDetails(WorkingDto workingDto)
	{
		WorkingEntity workingEntity = WorkingConversion.toWorkingEntity(workingDto);
		workingJobRepository.save(workingEntity);
		return workingDto;
	}
	
	public JobRecordDto postWorkingDetails2(JobRecordDto dto) throws NotFoundException, Exception
	{
		JobAssignEntity assignEntity = jobAssignRepository.findById(dto.getAssignId()).orElse(null);
		if(assignEntity==null)
		{
			throw new NotFoundException("Can not find Job with AssignID "+dto.getAssignId()+"Please Check");
			
		}
		else
		{
			WorkingEntity workingEntity = new WorkingEntity();
			workingEntity.setAssignEntity(assignEntity);
			workingEntity.setDate(dto.getDate());
			workingEntity.setHourSpent(dto.getHourSpent());
			
			
			workingJobRepository.save(workingEntity);
			int a = Integer.parseInt(dto.getHourSpent());
			int b = Integer.parseInt(assignEntity.getTotalHrSpend());
			assignEntity.setTotalHrSpend(a+b+"");
			jobAssignRepository.save(assignEntity);
		
	
		return dto;
		}
	}
}
