package com.javaisawesome.service;

import com.javaisawesome.entity.User;
import com.javaisawesome.util.LoginRequest;

public interface WelcomeService {

	User getUser(LoginRequest loginRequest);
}
