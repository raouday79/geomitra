package com.amc.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amc.main.entity.JobEntity;

//@RepositoryRestResource(collectionResourceRel="jobs",path="jobs")
public interface JobDao extends JpaRepository<JobEntity, Integer>
{

	/*   
	@Query("select j from JobEntity j limit ?1,?2")
	List<JobEntity> findAllPage(String start,String total); */ 
	
	List<JobEntity> findByJobname(final String job_name);  
}
