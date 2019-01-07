package com.amc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amc.main.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>  
{

}
