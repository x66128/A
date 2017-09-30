<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>查找用户</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<%@ include file="/WEB-INF/content/header.jsp"%>
	<center>
		<div class="col-md-6 col-md-offset-3">
			<form class="form-horizontal" role="form"
				action="http://localhost:8088/PersonnelManage/user/getuser"
				method="post">
				<div class="form-group">
					<label for="firstname" class="col-sm-2 control-label">名字</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="name" name="name"
							placeholder="请输入名字">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit"
							class="btn btn-default btn-warning btn-block">查 找</button>
					</div>
				</div>
			</form>
		</div>


		<table class="table table-hover" width="70%">
			<thead>
				<tr>
					<td>id</td>
					<td>用户名</td>
					<td>生日</td>
					<td>电话</td>
					<td>部门</td>
					<td>详情</td>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="p" items="${requestScope.userList }">
					<tr class="popover-toggle">
						<td>${p.id }</td>
						<td>${p.name }</td>
						<td>${p.password }</td>
						<td>${p.birth }</td>
						<td>${p.phone }</td>
						<td>${p.department }</td>
						<td>
							<button type="button" class="btn btn-warning popover-toggle"
								title="温馨提示" data-container="body"
								data-toggle="popover" data-placement="bottom"
								data-content="用户名：${p.name } 密码：${p.password }">↓</button>
						</td>
						<td><a
							href="${pageContext.request.contextPath}/user/modify?id=${p.id}">编辑</a></td>
						<td><a
							href="${pageContext.request.contextPath}/user/delete?id=${p.id}"
							onclick='return confirm("确定删除此用户？")'>删除</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</center>
	<script>
		$(function() {
			$("[data-toggle='popover']").popover();
		});
	</script>
</body>
</html>