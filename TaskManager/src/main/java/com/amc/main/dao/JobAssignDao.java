package com.amc.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amc.main.entity.JobAssignEntity;



public interface JobAssignDao extends JpaRepository<JobAssignEntity, Integer>
{

}
