package com.javaisawesome.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaisawesome.dao.RegisterDao;
import com.javaisawesome.entity.User;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterDao registerDao;
	
	@Override
	public User saveUser(User user) {
		return registerDao.registerUser(user); 
	}
}
