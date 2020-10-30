<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario</title>
</head>
<body>
	<h1>Introduce tu nombre de usuario</h1>
	<form method="post" action="http://localhost:8080/respuesta">
		<input type="text" name="nombre">
		<input type="submit" value="Enviar"> 	
	</form>
</body>
</html>