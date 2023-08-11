package com.javaisawesome.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaisawesome.dao.WelcomeDao;
import com.javaisawesome.entity.User;
import com.javaisawesome.util.LoginRequest;

@Service
public class WelcomeServiceImpl implements WelcomeService{

	@Autowired
	private WelcomeDao welcomeDao;
	
	@Override
	public User getUser(LoginRequest loginRequest) {
		return welcomeDao.getUser(loginRequest);
		
	}

}
