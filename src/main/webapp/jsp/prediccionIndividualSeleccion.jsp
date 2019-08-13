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
	   
	   
	    
	    <label for="basesAcademicas">Bases Academicas</label>
	    <select id="basesAcademicas" name="basesAcademicas" required="required">
	  
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    
	    <label for="habitosEstrategiasAprendizaje">Habitos Estrategias de Aprendizaje</label>
	    <select id="habitosEstrategiasAprendizaje" name="habitosEstrategiasAprendizaje">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	  
	    
	    
	    <label for="pagoMatricula">Pago Matricula</label>
	    <select id="pagoMatricula" name="pagoMatricula" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>   
	   
	   
	   <label for="recursosManutencion">Recursos Manutencion</label>
	    <select id="recursosManutencion" name="recursosManutencion" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	  	
	  	
	    
	    <label for="atencionPrimariaPAE">Atención Primaria PAE</label>
	    <select id="atencionPrimariaPAE" name="atencionPrimariaPAE" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	
	    
	    <label for="tutoriaAcademicaDisciplinar">Tutoría Académica, Disciplinar</label>
	    <select id="tutoriaAcademicaDisciplinar" name="tutoriaAcademicaDisciplinar" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	   
	    
	    <label for="servicioPsicologia">Servicio de Psicologia</label>
	    <select id="servicioPsicologia" name="servicioPsicologia" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	   
	    <label for="perdidaAsignatura">Perdida de asignatura</label>
	    <select id="perdidaAsignatura" name="perdidaAsignatura" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    
	    <label for="situacion_carrera_estudiante">Estado de carrera</label>
	    <select id="situacion_carrera_estudiante" name="situacion_carrera_estudiante" required="required">
	      
	      <option value="Admitido">Admitido</option>
	      <option value="Admitido que no ingreso">Admitido que no ingreso</option>
	      <option value="Inscrito sin pago">Inscrito sin pago</option>
	      <option value="Normal">Normal</option>
	      <option value="Egresado">Egresado</option>
	      <option value="Graduado">Graduado</option>
	      <option value="Prueba Academica">Prueba academica</option>
	      <option value="Perdida de la Calidad de Estudiante Academica">perdida calidad estudiante</option>
	      <option value="Perdida de la Calidad de Estudiante Voluntaria">perdida calidad estudiante voluntaria</option>
	      <option value="Solicitud reserva de cupo">solicitud reserva cupo</option>
	      <option value="Reserva de cupo">reserva de cupo</option>
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
	    
	     <label for="pertenece_Cnamarca">pertenece_C/namarca</label>
	    <select id="pertenece_Cnamarca" name="perteneceCnamarca" required="required">
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    <label for="recurso">recurso</label>
	    <select id="recurso" name="recurso" required="required">
	    
	      <option value="OTROS">OTROS</option>
	      <option value="4 POR UNA OPCION DE VIDA">4 POR UNA OPCION DE VIDA</option>
	      <option value="APOYO ECONOMICO INSTITUCION">APOYO ECONOMICO INSTITUCION</option>
	      <option value="AUXILIOS EMPRESARIALES">AUXILIOS EMPRESARIALES</option>
	      <option value="ICETEX">ICETEX</option>
	      <option value="PRESTAMO INSTITUCIONAL">PRESTAMO INSTITUCIONAL</option>
	      <option value="PRESTAMO ENTIDAD">PRESTAMO ENTIDAD</option>
	      <option value="PRESTAMO PERSONAL">PRESTAMO PERSONAL</option>
	      <option value="SER PILO PAGA">SER PILO PAGA</option>
	      <option value="SISTEMAS DE AHORRO">SISTEMAS DE AHORRO</option>
	    </select>
	    
	    <label for="PuntajeGlobal_saber11">puntaje icfes</label>
	    <input type="number" id="puntajeIcfes" name="puntajeIcfes" placeholder="ingresa puntaje" required="required">
	    <!--  <select id="puntajeIcfes" name="puntajeIcfes">
	      <option value=" "></option>
	      <option value="muyBajo">0-40</option>
	      <option value="bajo">41-60</option>
	      <option value="muyBueno">61-80</option>
	      <option value="bueno">81-100</option>	     
	    </select>-->
	    
	    
	    <input type="submit" value="Predecir">
	  </form>
	</div>
	
	

</body>
</html>