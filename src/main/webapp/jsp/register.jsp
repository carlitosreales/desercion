<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/myStyles.css">
<link rel="stylesheet" type="text/css"  href="../css/bootstrap.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Registro Administradores</title>
</head>
<body>
	<%
	    response.setHeader("Cache-control", "no-cache");
		response.setHeader("Cache-control", "no-store");
		response.setHeader("Pragma", "no-cache");
		response.setDateHeader("Expire",0);
		String usuario = (String)session.getAttribute("usuario");
		if(usuario==null) {
			response.sendRedirect("logout.jsp");
		}
	%>
	<ul>
	  <li><a class="active" href="welcome.jsp">Home</a></li>
	  <li><a class="active" href="prediccionIndividual.jsp">Prediccion individual</a></li>
	  <li><a href="prediccionGrupal.jsp">Prediccion Grupal</a></li>
	  <li><a href="modelo.jsp">Modelo</a></li>
	  <li><a class="active" href="register.jsp">Registrar Admin </a></li>
	  <li><a href="logout.jsp"> LogOut</a></li>
	</ul>
	
	<h1> Registrate aqui </h1>
	<!--<form method="post" action="http://localhost:8080/JavaWebAplication/Register"> 
		<pre>
			<input type="text" name="usuario" placeholder = "ingresa tu usuario aqui">
			<input type="text" name="email" placeholder = "ingresa tu correo aqui">
			<input type="text" name="clave" placeholder = "ingresa tu contraseña aqui">
			
			<input type="submit" value="SingUp">
		</pre>
	</form>-->
	
	<div class="myForm">
	  <form method="post" action="/JavaWebAplication/Register" class="center">
	    <label for="fname">Usuario</label>
	    <input type="text" name="usuario" placeholder = "ingresa tu usuario aqui">
	
		<label for="lname">email</label>
	    <input type="text" name="email" placeholder = "ingresa tu contraseña aqui">
	    
	    <label for="lname">clave</label>
	    <input type="text" name="clave" placeholder = "ingresa tu contraseña aqui">
	
	  
	    <input type="submit" value="SingUp">
	  </form>
	</div>
</body>

<a href="/JavaWebAplication/jsp/welcome.jsp"  class="btn btn-primary margin-lef-15"> Volver</a>
</html>