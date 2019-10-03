<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/myStyles.css">
<link rel="stylesheet" type="text/css"  href="../css/bootstrap.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
		<h3>Bienvenido/a al sistema de predicción </h3>
		<p>Por favor diligencie la totalidad de los datos y oprima el boton continuar para hacer una predicción del posible estado desertivo del estudiante</p>
	</div>	
	<div class="myForm">
	  <form method="post" class="form-signin" action="/JavaWebAplication/PrediccionIndividual">
	   
	   
	    
	    <label for="basesAcademicas">Bases Academicas</label>
	    <select id="basesAcademicas" name="basesAcademicas" required="required">
	  
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    <label for="orientacionProfesional">Orientacion Profesional</label>
	    <select id="orientacionProfesional" name="orientacionProfesional" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    
	    <label for="cambioPrograma">Cambio programa academico</label>
	    <select id="cambioPrograma" name="cambioPrograma" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    <label for="habitosEstrategiasAprendizaje">Habitos Estrategias de Aprendizaje</label>
	    <select id="habitosEstrategiasAprendizaje" name="habitosEstrategiasAprendizaje">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    <label for="problemasAprendizaje">Problemas de Aprendizaje</label>
	    <select id="problemasAprendizaje" name="problemasAprendizaje" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    
	    <label for="relacionEstudianteDocente">Relacion estudiante docente</label>
	    <select id="relacionEstudianteDocente" name="relacionEstudianteDocente" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    
	    <label for="ausentismo">Ausentismo</label>
	    <select id="ausentismo" name="ausentismo" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    
	    <label for="accesoAtic">Acceso A Tic</label>
	    <select id="accesoAtic" name="accesoAtic" required="required">
	      
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
	  	
	  	
	  	<label for="dificultadesAdaptación">Dificultades adaptación</label>
	    <select id="dificultadesAdaptación" name="dificultadesAdaptacion">

	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    
	    <label for="dificultadesSocialización">Dificultades socialización</label>
	    <select id="dificultadesSocialización" name="dificultadesSocializacion" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    <label for="motivacion">Motivación</label>
	    <select id="motivacion" name="motivacion" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    <label for="aspectosEmocionales">Aspectos emocionales</label>
	    <select id="aspectosEmocionales" name="aspectosEmocionales" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    <label for="violenciaSocial">Violencia social</label>
	    <select id="violenciaSocial" name="violenciaSocial" required="required">
	  
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    <label for="aspectosfamiliaresCulturales">Aspectos familiares y culturales</label>
	    <select id="aspectosfamiliaresCulturales" name="aspectosfamiliaresCulturales" required="required">
	      
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
	    
	    <label for="condicioneslaborales">Condiciones laborales</label>
	    <select id="condicioneslaborales" name="condicioneslaborales" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    
	    <label for="condicionesSalud">Condiciones de salud</label>
	    <select id="condicionesSalud" name="condicionesSalud" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    <label for="disciplinaConvivencia">Disciplina y convivencia</label>
	    <select id="disciplinaConvivencia" name="disciplinaConvivencia" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    <label for="atencionPrimariaPAE">Atención Primaria PAE</label>
	    <select id="atencionPrimariaPAE" name="atencionPrimariaPAE" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    <label for="seguimientoPAE">Seguimiento PAE</label>
	    <select id="seguimientoPAE" name="seguimientoPAE" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    <label for="tutoriaAcademicaDisciplinar">Tutoría Académica, Disciplinar</label>
	    <select id="tutoriaAcademicaDisciplinar" name="tutoriaAcademicaDisciplinar" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    <label for="laboratorioPensamientoLenguaje">Laboratorio Pensamiento y Lenguaje</label>
	    <select id="laboratorioPensamientoLenguaje" name="laboratorioPensamientoLenguaje" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    
	    <label for="servicioPsicopedagogia">Servicio de Psicopedagogía</label>
	    <select id="servicioPsicopedagogia" name="servicioPsicopedagogia" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    <label for="servicioPsicologia">Servicio de Psicologia</label>
	    <select id="servicioPsicologia" name="servicioPsicologia" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    <label for="servicioOptometria">Servicio de Optometría (Facultad)</label>
	    <select id="servicioOptometria" name="servicioOptometria" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    
	    <label for="remisionFinanzasEstudiantiles">Remisión Finanzas Estudiantiles </label>
	    <select id="remisionFinanzasEstudiantiles" name="remisionFinanzasEstudiantiles" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    <label for="ofertaCulturalDeportiva">Oferta Cultural y Deportiva (BU)</label>
	    <select id="ofertaCulturalDeportiva" name="ofertaCulturalDeportiva" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	     
	 
	   
	    <label for="valoracionIncentivos">Valoración apoyo especiales desde la Facultad</label>
	    <select id="valoracionIncentivos" name="valoracionIncentivos" required="required">
	      
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>
	    
	    
	    <!--  <select id="numeroApoyos" name="numeroApoyos">
	      <option value=" "></option>
	      <option value="si">si</option>
	      <option value="no">no</option>
	    </select>-->
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
	    
	    
	    <label for="sexo">Genero</label>
	    <select id="sexo" name="sexo" required="required">
	      
	      <option value="masculino">masculino</option>
	      <option value="femenino">femenino</option>
	    </select>
	    
	    
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
	    
	    <label for="estrato">estrato del aspirante</label>
	    <select id="estrato" name="estrato" required="required">
	      
	      <option value="1">1</option>
	      <option value="2">2</option>
	      <option value="3">3</option>
	      <option value="4">4</option>
	      <option value="5">5</option>
	      <option value="6">6</option>
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