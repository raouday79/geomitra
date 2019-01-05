package com.amc.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amc.main.entity.JobAssignEntity;
import com.amc.main.entity.WorkingEntity;

public interface WorkingJobDao extends JpaRepository<WorkingEntity, Integer>
{
	public List<WorkingEntity> findByAssignId(int id); 
}
