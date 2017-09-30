<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</head>

<body>
<%@ include file="/WEB-INF/content/header.jsp"%> 

<center>
<form class="form-horizontal col-md-7 col-md-offset-4" action="user/login" method="post">
	<div class="form-group">
		<label for="name" class="col-sm-2 control-label">用户名</label>
		<div class="col-sm-4">
			<input type="text" class="form-control" id="name" name="name"
				   placeholder="请输入用户名">
		</div>
	</div>
	<div class="form-group">
		<label for="password" class="col-sm-2 control-label">密码</label>
		<div class="col-sm-4">
			<input type="password" class="form-control" id="password" name="password" width="50%"
				   placeholder="请输入密码">
		</div>
	</div>
	<div class="form-group">
		<div class="col-sm-5">
			<div class="checkbox">
				<label>
					<input type="checkbox">请记住我
				</label>
			</div>
		</div>
	</div>
	<div class="form-group">
		<div class="col-sm-7">
			<button type="submit" class="btn btn-primary btn-lg">登录</button> &nbsp; &nbsp; &nbsp;
			 <a href="${pageContext.request.contextPath}/user/insertUser" class="btn btn-default btn-lg">注册</a>
		</div>
	</div>
</form>
</center>

</body>
</html>
