package com.amc.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amc.main.entity.EmployeeEntity;

public interface EmployeeDao extends JpaRepository<EmployeeEntity, Integer>  
{

}
