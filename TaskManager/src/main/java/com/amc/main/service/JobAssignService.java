package com.amc.main.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amc.main.conversion.EmployeeAssignedConversion;
import com.amc.main.conversion.JobConversion;
import com.amc.main.dto.EmployeeAssignedJobDto;
import com.amc.main.dto.JobAssignDto;
import com.amc.main.dto.JobDto;
import com.amc.main.entity.EmployeeEntity;
import com.amc.main.entity.JobAssignEntity;
import com.amc.main.entity.JobEntity;
import com.amc.main.repository.EmployeeRepository;
import com.amc.main.repository.JobAssignRepository;
import com.amc.main.repository.JobRepository;
@Service
public class JobAssignService {
	
	@Autowired
	JobAssignRepository assignRepository;
	
	@Autowired
	JobRepository jobRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<JobDto> getEmployeeSpecificJobAssign(int empid)
	{
	
	// To hold the actual job to assign...
	List<JobEntity> to_assign = new ArrayList<JobEntity>();	
		
	List<JobAssignEntity> asslist = assignRepository.findByEmpId(empid); 	
	
	// Set Data structure for storing the jobId 
	Set<Integer> jobset = new HashSet<>();
	
	//Inserting the jobId in set
	for(JobAssignEntity assignEntity : asslist)
	{
		jobset.add(assignEntity.getJobId());
	}
	
	List<JobEntity> jlist = jobRepository.findAll();
	for(JobEntity entity : jlist)
	{
		//if it is not present in set the add the jobEntity to assign
		if(jobset.add(entity.getJobId()))
		{
			to_assign.add(entity);
		}
	}
	
	// Converting to DTO.....object
	List<JobDto> send = JobConversion.toJobDtoList(to_assign);
	return send;
	
	
	}
	
	public List<EmployeeAssignedJobDto> getAssignedById(int id)
	{
		
		List<JobAssignEntity> ls= assignRepository.findByEmpId(id);
		
		List<EmployeeAssignedJobDto> l = EmployeeAssignedConversion.toEmployeeAssignedDto(ls);
		
		
		
		return l;
	}
	
	public List<JobAssignEntity> getAllAssigned()
	{
		List<JobAssignEntity> list = assignRepository.findAll();
		return list;
	}
	
	//This method  will assign the job to employee......
	public JobAssignEntity newAssignJob(JobAssignDto  dto)
	{
		JobAssignEntity assignEntity = new JobAssignEntity();
		JobEntity jobEntity = jobRepository.findById(dto.getJobId()).orElse(null);
		EmployeeEntity employeeEntity = employeeRepository.findById(dto.getEmpId()).orElse(null);
		if(jobEntity==null || employeeEntity==null)
		{
			// Will throw exception here
		}
		else
		{
		
			
		int jobs = Integer.parseInt(employeeEntity.getNoOfJobAssigned());
		jobs=jobs+1;
		employeeEntity.setNoOfJobAssigned(jobs+"");
		assignEntity.setEmployeeEntity(employeeEntity);
		assignEntity.setJobEntity(jobEntity);
	//	assignEntity.setEmpId(dto.getEmpId());
		//assignEntity.setJobId(dto.getJobId());
		assignEntity.setJobStart(dto.getStart());
		assignEntity.setJobEnd(dto.getEnd());
		assignEntity.setTotalHrSpend(dto.getTotalHours());
	
		//System.out.println("=================="+assignEntity.getEmpId());
		//System.out.println("=================="+assignEntity.getJobId());
		
		
		assignRepository.save(assignEntity);
		employeeRepository.save(employeeEntity);
		
		}
		return assignEntity;
	}

}
