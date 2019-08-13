<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="../css/myStyles.css">
	 	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	 
		<meta charset="ISO-8859-1">
		<title>Predicciones UEB</title>
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
	<div class="row">
		<div class="col-md-2"></div>  
		<div class="col-md-8">
			<h1> Bienvenido/a  al sistema de predicciones de la Universidad el Bosque: </h1>
			<h5> Usuario actual: <% out.println(usuario); %> </h5>
			<br>
			<h5> Predicciones:  </h5>
			<br>
			
			<button type="button" class="btn btn-outline-success" data-toggle="modal" data-target=".bd-example-modal-sm">Ver predicciones recientes</button>
	
			<div class="modal fade bd-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
			  <div class="modal-dialog modal-sm">
			    <div class="modal-content">
			      
						<ul class="list-group list-group-flush">
							<%
							    
								String predictions = (String)session.getAttribute("predictions");
								if(predictions!=null) {
									out.println(predictions);
								}else{
									
									out.println("<li class=\"list-group-item\">  sin predicciones recientes </li>");
								}
							%>
						</ul>
		
			    </div>
			  </div>
			</div>
			
			
			
			
			<div class="col-md-6">
				<img alt="" src="../images/ImagenesU/acreditacionaltacalidad.jpg">
			</div>
			
			
			
		</div>
	</div> 
		
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
		    	
	

</body>
</html>
