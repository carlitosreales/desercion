<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/myStyles.css">
<link rel="stylesheet" type="text/css"  href="../css/bootstrap.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>Predicción grupal</title>
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

	<h1> Predicción Grupal </h1>
	<!-- 
	<section>
			<div class="mitadIzq">
				<h3> Descargar formato para prediccion grupal</h3>
				<a href="C:\Users\Bosca\Pictures\JavaWebAplication\App_Plantilla\Plantilla2.xlsx" download />Descargar Archivo</a> 
			
			</div>
			<div class="mitadDer">
				<div class="myForm">
	 				 <form method="post" action="http://localhost:8080/JavaWebAplication/PrediccinGrupal"
	 				  enctype="multipart/form-data">
						 <input type="file" id="file" name="file">
						 <input type="submit" value="Predecir">
	  				</form>
				
				</div>
			</div>
	</section>
	 -->
	<div class="container">
    <!-- Example row of columns -->
    <div class="row">
      <div class="col-md-6">
        <h2>Descargar formato de predicción Grupal</h2>
        <p> A continuación se presenta un link para la descarga del archivo Excel, este debe ser diligenciado en su totalidad y subir en formato CSV.  </p>
        <a href="../resources/Plantilla.xlsx" download="Plantilla.xlsx">Descargar Archivo</a>
      </div>
      <div class="col-md-6">
        <h2>Subir archivo y obtener predicción</h2>
        <p>Una vez diligenciado el archivos, asegurese de guardarlo como un archivo con extencion csv y continuar con la predicción del mismo </p>
        <div class="myForm">
	 				 <form method="post" action="/JavaWebAplication/PrediccinGrupal"
	 				  enctype="multipart/form-data">
						 <input type="file" id="file" name="file" required>
						 <input type="submit" value="Predecir">
	  				</form>
				
		</div>
      </div> 
    <hr>
    </div>

  </div> <!-- /container -->
	
</body>
</html>