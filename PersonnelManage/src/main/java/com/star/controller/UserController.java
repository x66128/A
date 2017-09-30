package com.star.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.star.model.User;
import com.star.service.UserService;
import com.star.validator.UserValidator;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	@Qualifier("userValidator")
	private UserValidator userValidator;
	/**
	 *请求登录
	 */
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String doLogin(@ModelAttribute User user,Model model,Errors errors)
	{
		/*Map<String, Object> map = new HashMap<String,Object>();
		User user = userService.selectUserByName(name);
		if(user!=null&&user.getPassword().equals(password))
		{
			map.put("username",name);
			map.put("password",password);
			return "frame";
		}
		
		return "error";*/
		model.addAttribute("user",user);
		userValidator.validate(user, errors);
		if(errors.hasErrors()) {
			return "error";
		}
		return "frame";
	}
	
	/**
	 * 请求查询所有用户数据
	 * @param list
	 * @return
	 */
	@RequestMapping(value ="/main")
	public ModelAndView main() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		List<User> list = userService.selectAllUser();
		mv.addObject("message", "haha");
		mv.addObject("userList", list);
		return mv;
	}
	
	/**
	 * 通过id查询一条用户数据
	 * @param id
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/goSelectById")
	public String goSelectById(int id,User user)
	{
		user= userService.selectUserById(id);
		if(user!=null)
			return "main";
		else 
			return "error";
	}
	
	
	/**
	 * 跳转到添加用户界面接口
	 * @return
	 */
	@RequestMapping(value="/insertUser")
	public String addUser()
	{
		return "insert";
	}
	
	/**
	 * 添加一条用户数据
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String doInsert(@RequestParam("name") String name,
			@RequestParam("password") String password,
			@RequestParam("birth") String birth,
			@RequestParam("phone") String phone,
			@RequestParam("department") String department
			)
	{
		User user = new User();
		user.setName(name);
		user.setPassword(password);
		user.setBirth(birth);
		user.setPhone(phone);
		user.setDepartment(department);
		if(userService.insertUser(user)>0)
			return "redirect:main";
		else
			return "error";	
	}
	
	
	@RequestMapping(value="/modify")
	public ModelAndView modify(int id)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("update");
		User user = userService.selectUserById(id);
		mv.addObject("user",user);
		return mv;
	}
	/**
	 * 更新用户信息
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/update")
	public String doUpdate(
			@RequestParam("id") String id,
			@RequestParam("name") String name,
			@RequestParam("password") String password,
			@RequestParam("birth") String birth,
			@RequestParam("phone") String phone,
			@RequestParam("department") String department
			)
	{
		int ID = Integer.valueOf(id);
		User user = new User();
		user.setId(ID);
		user.setName(name);
		user.setBirth(birth);
		user.setPassword(password);
		user.setPhone(phone);
		user.setDepartment(department);
		if(userService.updateUser(user)>0)
			return "redirect:main";
		else
			return "error";
	}
	
	/**
	 * 删除一条用户信息
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/delete")
	public String doDelete(int id)
	{
		if(userService.deleteUser(id)>0)
			return "redirect:main";
		else
			return "error";
	}
	
	/**
	 * 请求解析和返回json数据
	 */
	@RequestMapping(value="/json")
	@ResponseBody
	public ModelAndView doJson()
	{
		ModelAndView mv = new ModelAndView();
		List<User> list  = new ArrayList<User>();
		list = userService.selectAllUser();
		mv.addObject("list",list);
		mv.setViewName("json");
		return mv;
	}
	
	@RequestMapping(value="/search")
	public String search()
	{
		return "search";
	}

	@RequestMapping(value="/login")
	public String login()
	{
		return "login";
	}
	
		
	@RequestMapping(value="/getuser",method=RequestMethod.POST)
	public ModelAndView getuser(@RequestParam("name") String name)
	{
		ModelAndView mv = new ModelAndView();
		List<User> userList = userService.selectUserByName(name);
		mv.setViewName("search");
		mv.addObject("userList", userList);
		return mv;
	}
	
	
}
