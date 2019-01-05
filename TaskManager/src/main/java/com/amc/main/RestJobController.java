package com.amc.main;

import java.util.ArrayList;
import java.util.List;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.amc.main.dao.JobDao;
import com.amc.main.entity.JobEntity;


@RestController
@RequestMapping(value="/api")
public class RestJobController {

	@Autowired
	JobDao jobDao;
	
	@CrossOrigin
	@GetMapping(value="pg-jobs")
	public Page<JobEntity> getAllJobpg(@RequestParam(name="pg",defaultValue="0") int pg)
	{
		System.out.println(pg);
	Page<JobEntity> pages	=	jobDao.findAll(PageRequest.of(pg,10,Sort.by("jobid").ascending()));
	System.out.println(pages);
	
	return pages;
		
	}
	
	
	
	@CrossOrigin
	@GetMapping(value="all-jobs")
	public List<JobEntity> getAllJob()
	{
	List<JobEntity> list	=	jobDao.findAll(PageRequest.of(0, 15)).getContent();
	
	return list;
		
	}
	
	///// This request page in pagination
	@CrossOrigin
	@GetMapping("jobs/{pg}")
	public List<JobEntity> getPageJob(@PathVariable(name="pg") int pg)
	{
		final int MAX_SIZE = 15;
		
		List<JobEntity> list = new  ArrayList<>();
		
		list =	jobDao.findAll(PageRequest.of(pg, MAX_SIZE)).getContent();
		
		return list;
		
	}
	
	// This method will post a new Job..
	@CrossOrigin
	@PostMapping(value="jobsave",consumes=MediaType.APPLICATION_JSON_VALUE)
	public JobEntity saveAll(@RequestBody JobEntity jobEntity)
	{
		System.out.println(jobEntity);
		jobDao.save(jobEntity);
		
		return jobEntity;
	}
	
	
	// This request will update the job...
	@CrossOrigin
	@PutMapping(value="update-job")
	public JobEntity updateJob(@RequestBody JobEntity entity)
	{
		jobDao.save(entity);
		
		return entity;
		
	}
	
	@CrossOrigin
	@GetMapping(value="job/{id}")
	public ResponseEntity<JobEntity> getJobById(@PathVariable(name="id") int id)
	{
		
		JobEntity jobEntity =	jobDao.findById(id).get();
		return new ResponseEntity<>(jobEntity,HttpStatus.OK);
		
	}
	
	///------------------------------------------------------------------------------------------------------------------
	
	
	
}
