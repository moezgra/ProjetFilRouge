	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container">
			<a class="navbar-brand" href="index.html">Leaderplant</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item active"><a class="nav-link"
						href="C:\Users\MGR\git\ProjetFilRouge\projet-eclipse\WebContent\images\fleurs-de-france.png">Fleurs</a></li>
					<li class="nav-item"><a class="nav-link" href="cart.html">Panier</a></li>
					<li class="nav-item"><c:url var="deconnexion" value="/disconnect"></c:url> <a class="nav-link"
							href="${ deconnexion }">deconnexion</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<!-- end Navigation-->
	<!-- banner-->
	<div class="container">
		<div id="banner" class="row">
			<div class="offset-lg-2 col-lg-8">
				<img src="C:\Users\MGR\git\ProjetFilRouge\projet-eclipse\WebContent\images\Flowers.jpg" alt="Flowers">
			</div>
			<!-- end banner-->
		</div>
	</div>