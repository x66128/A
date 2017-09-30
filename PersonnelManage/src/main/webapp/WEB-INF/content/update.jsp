<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑用户</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/bootstrap.js"></script>
</head>
<body>
	<%@ include file="/WEB-INF/content/header.jsp"%>
	<center>
		<h3>用户信息编辑页面</h3>
		<div class="container">
			<form class="form-horizontal" role="form" action="update"
				method="post">
				<div class="form-group">
					<label for="name" class="col-sm-2 control-label">ID</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="id" name="id" value="${requestScope.user.id }" readonly="readonly">
					</div>
				</div>
				<div class="form-group">
					<label for="name" class="col-sm-2 control-label">名字</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="name" name="name" value="${requestScope.user.name }"
							placeholder="请输入名字">
					</div>
				</div>
				<div class="form-group">
					<label for="password" class="col-sm-2 control-label">密码</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="password" value="${requestScope.user.password }"
							name="password" placeholder="请输入密码">
					</div>
				</div>
				<div class="form-group">
					<label for="birth" class="col-sm-2 control-label">生日</label>
					<div class="col-sm-10">
						<input type="datetime" class="form-control" id="birth" value="${requestScope.user.birth }"
							name="birth" placeholder="请输入生日">
					</div>
				</div>
				<div class="form-group">
					<label for="phone" class="col-sm-2 control-label">电话</label>
					<div class="col-sm-10">
						<input type="number" class="form-control" id="phone" name="phone" value="${requestScope.user.phone }"
							placeholder="请输入电话">
					</div>
				</div>
				<div class="form-group">
					<label for="department" class="col-sm-2 control-label">部门</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="department" value="${requestScope.user.department }"
							name="department" placeholder="请输入部门">
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default">更新</button>
					</div>
				</div>
			</form>
			</div>
	</center>
</body>
</html>