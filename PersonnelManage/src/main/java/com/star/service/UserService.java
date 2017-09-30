package com.star.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.star.model.User;

@Service
public interface UserService {

	public User selectUserById(int id);//��ѯ�û�ͨ��id
	public List<User> selectAllUser();//��ѯ�����û�
	public int insertUser(User user);//�����û�
	public int updateUser(User user);//�����û�
	public int deleteUser(int id);//ɾ���û�
	public List<User> selectUserByName(String name);//ͨ��������ѯ�û�
	
}
