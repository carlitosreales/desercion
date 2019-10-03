<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="../css/myStyles.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
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
		<div class="row">
			
			<div class="col-md-12">
						
						<div id="accordion">
						 
						 <!-- Explicacion leve de los algoritmos utilizados para la clasificacion -->
						  <div class="card">
						    <div class="card-header" id="headingOne">
						      <h5 class="mb-0">
						        <button class="btn btn-link" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
						          Mineria de datos: 
						        </button>
						      </h5>
						    </div>
						    <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordion">
						      <div class="card-body">
						        	<p>  Para llevar a cabo este modelo piloto, fue necesario una base de datos de
						        		 789 registros correspondientes a los estudiantes de ingenieria de la Universidad 
						        		 El Bosque. <br>
									     Al ser un modelo predictivo, utilizamos el metodo de clasificaci�n, apoyandonos en dos 
									     algoritms diferentes:
									</p>
									
						      		<div class="col-md-6">
								       	 <h2>Algoritmo de NaiveBayes</h2>
								       	 <p> 
								       	 	Teorema de Bayes: permite inferir la probabilidad de un secuceso, basado en el 
								       	 	conocimiento que se tiene de sucesos relacionados. 
								       	 	Dada la entrada de un nuevo escenario el clasificador, basado en los eventos pasados
								       	 	determina a cual de las dos clase pertenece este nuevo registro.
								       	 	
								       	 </p>
								        <img alt="" src="../images/NaiveBayes/ResultadosNaiveBayes.PNG">
								    </div>
								    <div class="col-md-6">
								       		 <h2>Algoritmo de J48</h2>
								       		 <p> 
								       	 	Generacion de reglas, basado en arboles de decision.
								       	 	
								       	 	</p>
								        	<img alt="" src="../images/j48-0.95/Resultados.PNG">
								    </div>
						      </div>
						    </div>
						  </div>
						 
						  <div class="card">
						    <div class="card-header" id="headingTwo">
						      <h5 class="mb-0">
						        <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
						          Selecci�n de Atibutos
						        </button>
						      </h5>
						    </div>
						    <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordion">
						      <div class="card-body">
						        <p> Gracias a los algoritmos de Correlaci�n ( metodo de Ranker ) y CfsSubsetEval (metodo de BestFirst) que ofrece weka, podemos distinguir los atributos mas relacionados con la variable de clase (deserci�n) </p>
				       			<img alt="" src="../images/Seleccion_Asociacion/Datosencomun.PNG">	
						      </div>
						    </div>
						  </div>
						 
						  <div class="card">
						    <div class="card-header" id="headingThree">
						      <h5 class="mb-0">
						        <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
						          Asociaci�n de Atributos
						        </button>
						      </h5>
						    </div>
						    <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordion">
						      <div class="card-body">
						        <p>Gracias al algoritmo a priori que solo funciona con variables continuas, logramos ver reglas de absatracion que a simple vista no se podrian ver<p>
				       			 <img alt="" src="../images/Seleccion_Asociacion/Apriori.PNG">
						      </div>
						    </div>
						  </div>
						 
						  <!-- Prediccion individual con seleccion de datos  -->
						  <div class="card">
						    <div class="card-header" id="headingFour">
						      <h5 class="mb-0">
						        <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
						          Predici�n individual basada en la selecci�n de atributos
						        </button>
						      </h5>
						    </div>
						    <div id="collapseFour" class="collapse" aria-labelledby="headingFour" data-parent="#accordion">
						      <div class="card-body">
						        <a class="active" href="prediccionIndividualSeleccion.jsp">Modelo</a>
						      </div>
						    </div>
						  </div>
						 	 
						</div>
			</div>
		
		</div>
	
		
			
		
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>		  
</body>
</html>