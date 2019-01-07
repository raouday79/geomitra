package com.amc.main.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.amc.main.conversion.JobConversion;
import com.amc.main.dto.JobDto;
import com.amc.main.entity.JobEntity;
import com.amc.main.repository.JobRepository;

@Service
public class JobService {
	
	@Autowired
	JobRepository jobRepository;
	
	
	
	
	public JobDto findJobById(int job_id) throws EntityNotFoundException
	{
		JobEntity jobEntity=	jobRepository.findById(job_id).orElse(null);
		JobDto jobDto =null;
		if(jobEntity!=null)
		{
			jobDto = JobConversion.toJobDto(jobEntity);
		
		}
		return jobDto;
	}
	
	
	public JobDto updateJob(JobDto dto)
	{
		JobEntity entity = JobConversion.toJobEntity(dto);
		
		jobRepository.save(entity);
		return dto;
	}
	
	public JobDto registerJob(JobDto dto)
	{
		JobEntity entity =  JobConversion.toJobEntity(dto);
		jobRepository.save(entity);
		return dto;
	}
	
	public Page<JobEntity> getJobByPage(int pg)
	{
		System.out.println(pg);
		Page<JobEntity> pages	=	jobRepository.findAll(PageRequest.of(pg,10,Sort.by("jobId").ascending()));
		System.out.println(pages);
		
		return pages;
	}
	
	public List<JobDto> getJobList(int pg)
	{
		final int MAX_SIZE = 15;
	
		List<JobEntity> list = new ArrayList<JobEntity>();
		list = jobRepository.findAll(PageRequest.of(pg, MAX_SIZE)).getContent();
		
		List<JobDto> l = JobConversion.toJobDtoList(list);
		
		return l;
	
	
	}
}
