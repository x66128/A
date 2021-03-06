package cn.appsys.controller.developer;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.appsys.pojo.DevUser;
import cn.appsys.service.developer.DevUserService;
import cn.appsys.tools.Constants;

@Controller
@RequestMapping(value = "/dev")
public class DevUserController {
	@Resource
	private DevUserService devUserService;
	private Logger logger = Logger.getLogger(DevUserController.class);
	// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	@RequestMapping(value = "/login")
	public String login() {
		logger.debug("++++++developer+APP开发者平台+login++页面展示++++");
		return "devlogin";
	}

	// ++++++++++++++++++++++++++++++++++++用户登录的方法+++++++++++++++++++++++++++++++++++
	//用户登录
	@RequestMapping(value = "/dologin",method=RequestMethod.POST)
	public String dologin(@RequestParam String devCode, @RequestParam String devPassword, HttpSession session,
			HttpServletRequest request) {
		logger.debug("++++++edveloper+APP开发者平台+dologin++登录方法++++");
		DevUser user = null;
		// 调用service方法，进行用户匹配
		user = devUserService.login(devCode, devPassword);
		if (null != user) {
			// 放入session
			session.setAttribute(Constants.DEV_USER_SESSION, user);
			// 页面跳转到(mian.jsp)
			return "redirect:/dev/flatform/main";
		} else {
			// 保留在devlogin.jsp 带出一些提示信息
			request.setAttribute("error", "用户名或密码不正确");
			return "devlogin";
		}
	}
	
	//判断用户是否已经登录
	@RequestMapping(value="/flatform/main")
	public String main(HttpSession session) {
		if (session.getAttribute(Constants.DEV_USER_SESSION)==null) {
			return "redirect:/dev/login";
		}
		return "developer/main";
	}
	//退出登录
	@RequestMapping(value="/logout")
	public String logout(HttpSession session) {
		//清除session
		session.removeAttribute(Constants.DEV_USER_SESSION);
		return "devlogin";
	}
	// +++++++++++++++++++++++++++++++++++++结束++++++++++++++++++++++++++++++++++
	
	
	
	
}
