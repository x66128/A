package com.star.mapper;

import java.util.List;

import com.star.model.User;

public interface UserMapper {

	/**
	 * Usermapper��ӳ����
	 */
	public User selectUserById(int id);//��ѯ�û�ͨ��id
	public List<User> selectAllUser();//��ѯ�����û�
	public int insertUser(User user);//�����û�
	public int updateUser(User user);//�����û�
	public int deleteUser(int id);//ɾ���û�
	public List<User> selectUserByName(String name);
}
