<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset= UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajout Utilisateur</title>
</head>
<body>

	
	<form action="AjoutUtilisateurServlet" method="post">
	
		<label for="adresseEmail"> Adresse Email : </label>
		<input	name="adresseEmail" type="text" /> 
		
		<label for="motDePasse">Mote de passe : </label>
		<input name="motDePasse" type="text">
		
		<label for="nom"> Nom :</label>
		<input 	name="nom" type="text" />
		
		<label for=prenom> Prénom :</label>
		<input name="prenom" type="text" />
		
		<label for="type"> Type :</label>
		<input name="type" type="text" />
		
		<button class="btn btn-primary">Ajouter</button>
	</form>
		
		
	
		
	</script>
</body>
</html>