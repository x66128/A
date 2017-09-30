package com.star.validator;

import org.springframework.stereotype.Repository;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.star.model.User;

@Repository("userValidator")
public class UserValidator implements Validator{

	public boolean supports(Class<?> arg0) {
		
		return User.class.equals(arg0);
	}
	//У�����
	public void validate(Object arg0, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", null , "��¼������Ϊ��");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", null , "���벻��Ϊ��");
		User user = (User)arg0;
		if(user.getName().length()<4) {
			errors.rejectValue("name",null, "�û�����������4λ");
		}
		if(user.getPassword()!=null&&!user.getPassword().equals("")&&user.getPassword().length()<4){
			errors.rejectValue("password",null,"���볤������4λ");
		}
	}
}
