<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>Ecommerce</title>
</head>
<body>
	<h1>Page d'authentification</h1>

	<form action="connexion" method="POST">
		<div>
			<label class="bg-primary text-white" for="login">Login</label> <input type=text id=login id=login name=login>
		</div>
		<div>
			<label class="bg-primary text-white" for="password">Mot de
				passe</label> <input type=password id=password name=password>
		</div>
		<button class="btn btn-primary">Se connecter</button>
	</form>

</body>
</html>