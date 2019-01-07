package com.amc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amc.main.entity.LoginEntiy;


public interface LoginRepository extends JpaRepository<LoginEntiy, Integer>
{

}
