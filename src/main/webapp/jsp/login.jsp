<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

	<meta charset="ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="../css/myStyles.css">
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	
	<title>Login</title>
</head>
<body>
		
			<div class="row " align="center" >
				
				<div class="col-md-4">
					<a href="../index.jsp"> 
						<img src="../images/ImagenesU/logout.png" id="img-salida">
					</a>
				
				    
				</div>
				
				<div class="col-md-4 formularioLogin"  align="center">	
					
					<form class="form-login" method="post" action="../Login">
				      <img class="mb-4" src="../images/ImagenesU/images.jpg" alt="" width="110" height="110">  
				      <label for="inputEmail" class="sr-only">usuario</label>
				      <input type="text" name="usuario" placeholder = "Ingresa tu usuario" required autofocus>
				      <label for="inputPassword" class="sr-only">Password</label> <br>
				      <input type="password" id="inputPassword" class="form-control" name="clave" placeholder = "Ingresa tu contraseña" required> <br>
				      <button class="btn btn-success" type="submit">Ingresar</button>
				    </form>
				    <br>
				    <div >
						<img src="../images/ImagenesU/Pae.PNG" height="150">
					</div>
			   </div>
				 
			</div>	
	
</body>
</html>