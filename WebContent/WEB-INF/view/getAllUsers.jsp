<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>
	<table>
 	 <tr><td>姓名</td>
 	 <td>年龄</td></tr>
 	<c:forEach var="item" items="${list}"  >
 		<tr>
 			<td>${item.userName}</td>
 			<td>${item.age}</td>
 		</tr>
 	</c:forEach>
 	
</body>
</html>