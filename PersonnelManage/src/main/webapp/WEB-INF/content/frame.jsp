<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理系统</title>
</head>
<body>
	<%@ include file="/WEB-INF/content/header.jsp"%>
	<center>
		<h3>用户信息主目录</h3>
		<div class="container">
			<div class="panel panel-default">
				<div class="panel-body">查询所有用户</div>
				<div class="panel-footer">
					<a href="${pageContext.request.contextPath}/user/main">前往</a>
				</div>
			</div>

			<div class="panel panel-default">
				<div class="panel-body">增加用户</div>
				<div class="panel-footer">
					<a href="${pageContext.request.contextPath}/user/insertUser">前往</a>
				</div>
			</div>

			<div class="panel panel-default">
				<div class="panel-body">Json测试</div>
				<div class="panel-footer">
					<a href="${pageContext.request.contextPath}/user/json">前往</a>
				</div>
			</div>
		</div>
	</center>
</body>
</html>