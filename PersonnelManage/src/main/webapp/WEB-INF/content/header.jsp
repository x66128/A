<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/bootstrap.min.js"></script>
<script src="js/bootstrap.js"></script>
</head>
<body>
	<nav class="navbar navbar-default" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="http://localhost:8088/PersonnelManage/">用户管理系统</a>
		</div>
		<div>
			<ul class="nav navbar-nav">
				<li><a href="${pageContext.request.contextPath}/user/login">登录</a></li>
				<li><a href="${pageContext.request.contextPath}/user/main">所有用户</a></li>
				<li><a href="${pageContext.request.contextPath}/user/search">查询</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"> 其他 <b class="caret"></b>
				</a>
					<ul class="dropdown-menu">
						<li><a href="#">授权</a></li>
						<li><a href="#">统计</a></li>
						<li><a href="#">数据</a></li>
					</ul></li>
			</ul>
			<form class="navbar-form navbar-right" role="search">
				<button type="button" class="btn btn-default btn-lg">
					<span class="glyphicon glyphicon-user"></span> User
				</button>
			</form>
		</div>


	</div>
	</nav>

</body>
</html>