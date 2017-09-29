package cn.appsys.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class SysInterceptor extends HandlerInterceptorAdapter{
	private static Logger log = Logger.getLogger(SysInterceptor.class);
	
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
	}
}
