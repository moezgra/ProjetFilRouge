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

	<form id="formUser" method="POST" action ="ajoutUtilisateur">
		<div class="form-group">
			<label for="exampleInputEmail1">Addresse email</label> <input
				type="email" class="form-control" name="email"
				aria-describedby="emailHelp" placeholder="Taper votre email"> 
		</div>
		<div class="form-group">
			<label for="passe">Password</label> <input
				type="password" class="form-control" name="mot de passe"
				placeholder="Mot de passe">
		</div>
		<div class="form-group">
			<select name="type" id="type">
				<option value=""></option>
				<option value="acheteur">acheteur</option>
				<option value=vendeur>vendeur</option>
			</select>
		</div>
	</form>
	<script type="text/javascript">
		
	<%-- <%@ include file="../../js/form.js"%> --%>
		
	</script>
</body>
</html>