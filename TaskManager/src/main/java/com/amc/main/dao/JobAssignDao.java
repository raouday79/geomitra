package com.amc.main.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.amc.main.entity.JobAssignEntity;


public interface JobAssignDao extends JpaRepository<JobAssignEntity, Integer>
{

	
	public List<JobAssignEntity> findByEmpId(int id);
}
