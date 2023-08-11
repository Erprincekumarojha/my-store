package com.javaisawesome.dao;

import com.javaisawesome.entity.User;
import com.javaisawesome.util.LoginRequest;

public interface WelcomeDao {
	
	User getUser(LoginRequest loginRequest);

}
