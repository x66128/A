package cn.appsys.controller.backend;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.appsys.pojo.BackendUser;
import cn.appsys.service.backend.BacKendUserService;
import cn.appsys.tools.Constants;

@Controller
@RequestMapping(value="/manager")
public class UserLoginController {
	@Resource
	private BacKendUserService backendUserService;
	private Logger logger = Logger.getLogger(UserLoginController.class);
	// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	@RequestMapping(value = "/login")
	public String login() {
		logger.debug("++++++developer+APP后台平台+login++页面展示++++");
		return "backendlogin";
	}

	// ++++++++++++++++++++++++++++++++++++用户登录的方法+++++++++++++++++++++++++++++++++++
	//用户登录
	@RequestMapping(value = "/dologin",method=RequestMethod.POST)
	public String dologin(@RequestParam String userCode, @RequestParam String userPassword, HttpSession session,
			HttpServletRequest request) {
		logger.debug("++++++edveloper+APP后台平台+dologin++登录方法++++");
		BackendUser user = null;
		// 调用service方法，进行用户匹配
		user = backendUserService.login(userCode, userPassword);
		if (null != user) {
			// 放入session
			session.setAttribute(Constants.USER_SESSION, user);
			// 页面跳转到(mian.jsp)
			return "redirect:/manager/backend/main";
		} else {
			// 保留在devlogin.jsp 带出一些提示信息
			request.setAttribute("error", "用户名或密码不正确");
			return "backendlogin";
		}
	}
	
	//判断用户是否已经登录
	@RequestMapping(value="/backend/main")
	public String main(HttpSession session) {
		if (session.getAttribute(Constants.USER_SESSION)==null) {
			return "redirect:/manager/login";
		}
		return "backend/main";
	}
	//退出登录
	@RequestMapping(value="/logout")
	public String logout(HttpSession session) {
		//清除session
		session.removeAttribute(Constants.USER_SESSION);
		return "backendlogin";
	}
	// +++++++++++++++++++++++++++++++++++++结束++++++++++++++++++++++++++++++++++
	
	
	
}
