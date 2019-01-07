package com.amc.main.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.amc.main.repository.LoginRepository;

public class LoginService {
	
	@Autowired
	LoginRepository loginRepository;

}
