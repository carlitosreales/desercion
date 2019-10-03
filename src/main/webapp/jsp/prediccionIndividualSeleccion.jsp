<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/myStyles.css">
<link rel="stylesheet" type="text/css"  href="../css/bootstrap.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Predicción individual Con selección de atributos</title>
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

<h1> Predicción Individual </h1>
	<div class="margin-lef-15">
		<h3> Con selección de atributos </h3>
		<p> Al igual que el modulo de selección individual, en este modulo se ofrece la misma función pero con lo datos seleccionados, con mas relaccion con la variable de clase (deserción)</p>
	</div>	
	<div class="myForm">
	  <form method="post" class="form-signin" action="/JavaWebAplication/PrediccionIndividualSeleccion">
	   
	   
	    
	    
	    
	  
	    
	    
	    <label for="pagoMatricula">Pago Matricula</label>
	    <select id="pagoMatricula" name="pagoMatricula" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>   
	   
	   
	   <label for="aspectosEmocionales">Aspectos emocionales</label>
	    <select id="aspectosEmocionales" name="aspectosEmocionales" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    
	     <label for="expetactivaCalidad">Expetactiva de calidad</label>
	    <select id="expetactivaCalidad" name="expetactivaCalidad" required="required">
	     
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    <label for="procesosAdministrativosServicios">Procesos administrativos y servicios</label>
	    <select id="procesosAdministrativosServicios" name="procesosAdministrativosServicios" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    <label for="valoracionIncentivos">Valoración apoyo especiales desde la Facultad</label>
	    <select id="valoracionIncentivos" name="valoracionIncentivos" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	     <label for="nombredocumento">Tipo de Documento identificacion</label>
	    <select id="nombredocumento" name="nombredocumento" required="required">
	      <option value="Cedula de Ciudadania">Cedula de Ciudadania</option>
	      <option value="Pasaporte">Pasaporte</option>
	      <option value="Cedula de Extranjeria">Cedula de Extranjeria</option>
	      <option value="Tarjeta de identidad">Tarjeta de identidad</option>
	    </select>
	    
	    
	    <label for="estadoCivil">Estado civil</label>
	    <select id="estadoCivil" name="estadoCivil" required="required">
	      
	      <option value="Soltero(a)">Soltero(a)</option>
	      <option value="Casado(a)">Casado(a)</option>
	      <option value="Union Libre">Union Libre</option>
	    </select>
	    
	     <label for="edad">Edad</label>
	    <input type="number" id="edad" name="edad" placeholder="ingresa la edad" required="required">
	    
	    
	    <label for="jornada">Jornada</label>
	    <select id="jornada" name="jornada" required="required">
	      
	      <option value="Diurno">Diurno</option>
	      <option value="Nocturno">Nocturno</option>
	    </select>
	    
	    <label for="tipo_estudiante">tipo_estudiante</label>
	    <select id="tipo_estudiante" name="tipo_estudiante" required="required">
	      <option value="Antiguo">Antiguo</option>
	      <option value="Nuevo">Nuevo</option>
	    </select>
	    
	    
	     <label for="semestre">Semestre</label>
	    <select id="semestre" name="semestre" required="required">
	    
	      <option value="1">1</option>
	      <option value="2">2</option>
	      <option value="3">3</option>
	      <option value="4">4</option>
	      <option value="5">5</option>
	      <option value="6">6</option>
	      <option value="7">7</option>
	      <option value="8">8</option>
	      <option value="9">9</option>
	      <option value="10">10</option>
	    </select>
	    
	    <input type="submit" value="Predecir">
	  </form>
	</div>
	
	

</body>
</html>