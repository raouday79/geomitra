package com.amc.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amc.main.entity.LoginEntiy;


public interface LoginDao extends JpaRepository<LoginEntiy, Integer>
{

}
