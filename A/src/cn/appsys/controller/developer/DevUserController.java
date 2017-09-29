package cn.appsys.controller.developer;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.appsys.service.developer.DevUserService;

@Controller
@RequestMapping(value="/dev")
public class DevUserController {
	@Resource
	private DevUserService service;
	private Logger logger=Logger.getLogger(DevUserController.class);
	@RequestMapping(value="login")
	public String login() {
		logger.debug("++++++++login++登陆++++");
		return "devlogin";		
	}
}
