<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
</head>
<body>
  <a href="${pageContext.request.contextPath}/getAllUsers">用户列表</a>
  <form action="${pageContext.request.contextPath}/upload" method="post" enctype="multipart/form-data">
  	<input type="file" name="file" id="fileInput" />
  	<input type="submit" value="提交" />
  </form>
</body>
</html>  