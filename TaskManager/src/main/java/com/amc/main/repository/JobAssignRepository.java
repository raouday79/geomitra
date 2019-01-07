package com.amc.main.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.amc.main.entity.JobAssignEntity;


public interface JobAssignRepository extends JpaRepository<JobAssignEntity, Integer>
{

	
	public List<JobAssignEntity> findByEmpId(int id);
}
