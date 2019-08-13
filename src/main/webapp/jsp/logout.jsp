<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/myStyles.css">
<link rel="stylesheet" type="text/css"  href="../css/bootstrap.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>LogOut</title>
<script type="text/javascript" src="../js/logout.js"></script>
</head>
<body>
<%
session.invalidate();


%>
<ul>
  
  <li><a href="login.jsp">Login</a></li>
  
</ul>
<link rel="stylesheet" type=""  href="../css/bootstrap.css">
</body>
</html>