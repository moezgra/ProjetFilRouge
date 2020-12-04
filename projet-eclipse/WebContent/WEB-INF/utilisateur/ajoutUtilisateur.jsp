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
<h1>Inscription</h1>
	
	<form action="AjoutUtilisateur" method="post">
	
		<label for="adresseEmail"> Adresse Email : </label>
		<input	name="adresseEmail" type="text" /> <br>
		
		<label for="motDePasse">Mote de passe : </label>
		<input name="motDePasse" type="password"> <br>
		
		<label for="nom"> Nom :</label>
		<input 	name="nom" type="text" /> <br>
		
		<label for=prenom> Prénom :</label>
		<input name="prenom" type="text" /> <br>
		
		<label for="type"> Type :</label>
		<select id=type name=type>
			<option value="acheteur">Client</option>
			<option value="vendeur">Vendeur</option>
		</select> <br>
		
		<button class="btn btn-primary">Ajouter</button>
	</form>
		
		
	
		
	</script>
</body>
</html>