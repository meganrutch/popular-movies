<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.* " %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yahoo!!! From jsp</title>
</head>
<body>
<div>
</div>
<form action="/login" method="post">
<p><font color="red">${error}</font></p>
Enter your name: <input type="text" name="name"/> password <input type="password" name="password"/><input type="submit" />
</form>
</body>
</html>