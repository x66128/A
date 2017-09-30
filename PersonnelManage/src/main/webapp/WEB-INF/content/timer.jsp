<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>倒计时</title>
<script src="js/bootstrap.min.js"></script>
<script src="js/bootstrap.js"></script>
</head>
<body>
	<center>
		<div class="container">
			<div class="panel panel-default">
				<div class="panel-body">系统倒计时</div>
				<div class="panel-footer">
					您有5分钟时间使用系统，请开始登陆<a
						href="${pageContext.request.contextPath}/user/login">登陆</a>
				</div>
			</div>
		</div>
		<nav class="navbar navbar-inverse navbar-fixed-bottom" role="navigation">
				
						<h5 align="center"><font color="white">Copyright By Starbucks-Star 2017年9月</font></h5>
			
			</nav>
	<%@ include file="/WEB-INF/content/timer.html"%>
	</center>
</body>
</html>