package com.amc.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amc.main.entity.JobAssignEntity;
import com.amc.main.entity.WorkingEntity;

public interface WorkingJobRepository extends JpaRepository<WorkingEntity, Integer>
{
	public List<WorkingEntity> findByAssignId(int id); 
}
