<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="user" value="${u}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사용자 정보</h1>
	<ul>
		<li>아이디 : ${user.userid}</li>
		<li>패스워드 : ${user.passwd}</li>
		<li>이름 : ${user.name}</li>
		<li>나이 : ${user.age}</li>
		<li>성별 : ${user.gender}</li>
	</ul>
</body>
</html>