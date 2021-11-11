<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- VO등 객체로 받아올 때 -->
<c:set var="user" value="${userinfo }"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Information</title>
</head>
<body>
	<h3>confirm2.jsp</h3>
	<ul>
		<li>User ID: ${user.userid}</li>
		<li>Password: ${user.passwd}</li>
		<li>Name: ${user.name}</li>
		<li>Age: ${user.age}</li>
		<li>Gender: ${user.gender}</li>
	</ul>
</body>
</html>