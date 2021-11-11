<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="user" value="${userVO }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Information</title>
</head>
<body>
	<h3>confirm3.jsp</h3>
	<ul>
		<li>User ID: ${user.userid}</li>
		<li>Password: ${user.passwd}</li>
		<li>Name: ${user.name}</li>
		<li>Age: ${user.age}</li>
		<li>Gender: ${user.gender}</li>
	</ul>
</body>
</html>