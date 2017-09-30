package com.star.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.star.model.User;

@Service
public interface UserService {

	public User selectUserById(int id);//查询用户通过id
	public List<User> selectAllUser();//查询所有用户
	public int insertUser(User user);//插入用户
	public int updateUser(User user);//更新用户
	public int deleteUser(int id);//删除用户
	public List<User> selectUserByName(String name);//通过姓名查询用户
	
}
