<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://kit.fontawesome.com/a6c393237d.js"></script>
</head>
<body>
	<%@ include file="../../header/headerVendeur.jsp"%>

	<form action="ajoutProduit" method="post">
		<label for="designation"> Désignation : </label>
		<input	name="designation" type="text" /> 
		<label for="prixUnitaire">Prix unitaire de l'article : </label>
		<input name="prixUnitaire" type="number">
		<label for="quantiteStock"> Quantité en stock :</label>
		<input 	name="quantiteStock" type="number" />
		<label for=imageUrl> Image URL :</label>
		<input name="imageUrl" type="text" />
		<button class="btn btn-primary">Ajouter</button>
	</form>
</body>
</html>