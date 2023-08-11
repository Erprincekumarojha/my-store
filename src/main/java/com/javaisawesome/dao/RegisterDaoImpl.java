package com.javaisawesome.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.javaisawesome.entity.User;

@Component
public  class RegisterDaoImpl implements RegisterDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public User registerUser(User user) {
		String sql = "INSERT INTO USER(userid, username,  email, password) VALUES (?, ?, ?, ?);";
        try {
		int save = jdbcTemplate.update(sql, user.getUserId(), user.getUsername(),
				user.getEmail(), user.getPassword());
		if (save == 0) {
			return null;
		}
        }catch(Exception e) {
          return null;	
        }
		
		return user;

	}
}