package com.amc.main.conversion;

import java.util.ArrayList;
import java.util.List;

import com.amc.main.dto.JobDto;
import com.amc.main.entity.JobEntity;

public class JobConversion {
	
	
	public static JobDto toJobDto(JobEntity jobEntity)
	{
		JobDto dto = new JobDto();
		dto.setJobId(jobEntity.getJobId());
		dto.setJobName(jobEntity.getJobName());
		dto.setJobDescription(jobEntity.getJobDescription());
		
		
		return dto;
	}
	
	public static JobEntity toJobEntity(JobDto dto)
	{
		JobEntity entity = new JobEntity();
		entity.setJobId(dto.getJobId());
		entity.setJobName(dto.getJobName());
		entity.setJobDescription(dto.getJobDescription());
		
		return entity;
		
	}

	public static List<JobDto> toJobDtoList(List<JobEntity> list)
	{
		List<JobDto> l = new ArrayList<JobDto>();
		
		for(JobEntity jobEntity : list)
		{
		JobDto dto = new JobDto();
		dto.setJobId(jobEntity.getJobId());
		dto.setJobName(jobEntity.getJobName());
		dto.setJobDescription(jobEntity.getJobDescription());
		l.add(dto);
		
		}
		return l;
	}
	
	public static List<JobEntity> toJobEntityList(List<JobDto> list)
	{
		List<JobEntity> l = new ArrayList<JobEntity>();
		for(JobDto dto : list)
		{
		
		JobEntity entity = new JobEntity();
		entity.setJobId(dto.getJobId());
		entity.setJobName(dto.getJobName());
		entity.setJobDescription(dto.getJobDescription());
		l.add(entity);
		
		}
		return l;
		
	}
}
