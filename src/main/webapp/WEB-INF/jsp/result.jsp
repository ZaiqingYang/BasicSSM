<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="org.zqy.dao.entity.Person"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>query result</title>
</head>
<body>
<h1>查询结果是:</h1>
<%
	Person person = (Person)request.getAttribute("person"); 
	if(person != null){
%>
<h3>Id:<%=person.getId() %></h3>
<h3>Name:<%=person.getName() %></h3>
<h3>Age:<%=person.getAge() %></h3>
<%} %>
</body>
</html> 