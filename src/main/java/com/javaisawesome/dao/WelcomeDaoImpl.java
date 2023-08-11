package com.javaisawesome.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.javaisawesome.entity.User;
import com.javaisawesome.util.LoginRequest;

@Component
public class WelcomeDaoImpl implements WelcomeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public User getUser(LoginRequest loginRequest) {
		String sql = "select * from user where userid = ? AND password = ? ";
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(sql, loginRequest.getUserId(),
				loginRequest.getPassword());
		if (queryForList == null || queryForList.size()==0) {
			return null;
		}
		User user = new User();
		user.setUserId((String) queryForList.get(0).get("userid"));
		user.setPassword((String) queryForList.get(0).get("password"));
		user.setEmail((String) queryForList.get(0).get("email"));
		user.setUsername((String) queryForList.get(0).get("username"));
		return user;
	}

}
