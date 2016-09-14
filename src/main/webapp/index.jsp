<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index Of BasicSSM</title>
</head>
<body>
<h1>This is a index of BasicSSM</h1>
<h3>请输入id进行查询Person:</h3>
<form action="${pageContext.request.contextPath}/getbyid" method="post">
	<input name="id" type="text"><br>
	<input type="submit" value="查询">
</form>
</body>
</html>