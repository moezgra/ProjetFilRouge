<h2><c:out value="Page ${ sessionScope.utilisateur.type }"/></h2>

<c:out value="Bonjour ${ sessionScope.utilisateur.login} ${ sessionScope.utilisateur.password }."/>

<c:url var="deconnection" value="/deconnexion"></c:url>
<a href="${ deconnection }">Cliquer ici pour se déconnecter.</a>