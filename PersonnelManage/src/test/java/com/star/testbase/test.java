package com.star.testbase;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.star.model.User;
import com.star.service.UserService;

public class test extends TestBase{
	
	  	@Autowired  
	    private UserService us;  
	    Logger logger = Logger.getLogger(test.class);  
	      
	    @Test  
	    public void selectUserByIdTest(){  
	    	for(int i=0;i<100;i++) {
	    		User user= new User();
	    		user.setName("loan"+i);
	    		user.setPassword("loan"+i);
	    		user.setBirth("111");
	    		user.setPhone("loan"+i);
	    		user.setDepartment("loan");
	    		us.insertUser(user);
	    	}
	    }  
	    
	    @Test
	    public void deleteUserBygroup()
	    {
	    	for(int i=20;i<50000;i++)
	    		us.deleteUser(i);
	    }
	    
	    @Test
	   /**
	    *
	    * @param json×Ö·û´®
	    */
	   public void parseJson()
	   {
	    	/*½âÎöjson
	    	List<REQUEST> list =JSON.parseArray(json, REQUEST.class);
	    	for(REQUEST q:list)
	    		System.out.println("JSON½âÎö£º"+q);*/
	    	/*
	    	 * Éú³Éjson×Ö·û´®
	    	 */
	    	List<User> list = us.selectAllUser();
	    	StringBuffer sb =new StringBuffer();
	    	for(User u :list) {
	    		sb.append(JSON.toJSONString(u));
	    	}
	    	System.out.println(sb);
	   }
	      
}
