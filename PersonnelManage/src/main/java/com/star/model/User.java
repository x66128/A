package com.star.model;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * ”√ªß¿‡
	 */
	private static final long serialVersionUID = 8553343831574073093L;
	private int id;
	private String name;
	private String password;
	private String birth;
	private String phone;
	private String department;
	
	public User()
	{
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", birth=" + birth + ", phone=" + phone
				+ ", department=" + department + "]";
	}

	
	
}
