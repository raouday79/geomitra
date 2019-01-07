package com.amc.main;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amc.main.dto.JobDto;
import com.amc.main.entity.JobEntity;
import com.amc.main.service.JobService;
import com.amc.main.utility.NotFoundException;


@RestController
@CrossOrigin
@RequestMapping(value="/api")
public class RestJobController {

	
	
	@Autowired
	JobService jobService;
	
	
	@GetMapping(value="pg-jobs")
	public Page<JobEntity> getAllJobpg(@RequestParam(name="pg",defaultValue="0") int pg)
	{
		
	Page<JobEntity> pages = jobService.getJobByPage(pg);
	System.out.println(pg);
	/*
	Page<JobEntity> pages	=	jobDao.findAll(PageRequest.of(pg,10,Sort.by("jobid").ascending()));
	System.out.println(pages);*/
	
	return pages;
		
	}
	
	
	///// This will return list of jobs
	
	@GetMapping("jobs/{pg}")
	public List<JobDto> getPageJob(@PathVariable(name="pg") int pg)
	{
		
		List<JobDto> list = jobService.getJobList(pg);
		
		return list;
		
		/*final int MAX_SIZE = 15;
		List<JobEntity> list = new  ArrayList<>();
		list =	jobDao.findAll(PageRequest.of(pg, MAX_SIZE)).getContent();
		return list;
		*/
	}
	
	// This method will post a new Job..
	
	@PostMapping(value="jobsave",consumes=MediaType.APPLICATION_JSON_VALUE)
	public JobDto saveAll(@RequestBody JobDto dto)
	{
		jobService.registerJob(dto);
		
		return dto;
	}
	
	
	// This request will update the job...
	
	@PutMapping(value="update-job")
	public JobDto updateJob(@RequestBody JobDto dto)
	{
		jobService.updateJob(dto);
		
		return dto;
		
	}
	
	
	@GetMapping(value="job/{id}")
	public ResponseEntity<JobDto> getJobById(@PathVariable(name="id") int id) throws NotFoundException,Exception
	{
		
		
		System.out.println();
		
		JobDto job =	jobService.findJobById(id);
		if(job==null)
		{
			throw new NotFoundException("Job With jobid {"+id+"} not found");
		}
		
		return new ResponseEntity<>(job,HttpStatus.OK);
		
	}
	
	
	
	
}
