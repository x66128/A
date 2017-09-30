<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//Dth HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dth">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理系统</title>

	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<%@ include file="/WEB-INF/content/header.jsp"%>
	<center>

		<h3>所有用户显示</h3>
		
		<table class="table table-hover" width="70%">
			<thead>
				<tr>
					<td>id</td>
					<td>用户名</td>
					<td>密码</td>
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
								title="提示" data-container="body"
								data-toggle="popover" data-placement="bottom"
								data-content="${p.name }-${p.password }-${p.phone }-${p.department }">↓</button>
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
	  $(function (){
		    $("[data-toggle='popover']").popover();
		});
</script>
</body>
</html>