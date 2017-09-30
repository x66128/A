package com.star.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.star.mapper.UserMapper;
import com.star.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public User selectUserById(int id) {
		return userMapper.selectUserById(id);
	}

	public List<User> selectAllUser() {
		return  userMapper.selectAllUser();
	
	}

	public int insertUser(User user) {
		return userMapper.insertUser(user);
	}

	public int updateUser(User user) {
		return userMapper.updateUser(user);
	
	}

	public int deleteUser(int id) {
		return userMapper.deleteUser(id);
	}

	public List<User> selectUserByName(String name) {
		return userMapper.selectUserByName(name);
		
	}

	
	
}
