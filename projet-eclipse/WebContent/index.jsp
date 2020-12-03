<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">	
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>  
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://kit.fontawesome.com/a6c393237d.js"></script>
</head>
<body>
	<!-- Navigation -->
	<div class="container-fluid bg-dark text-white text-center">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<div class="container">
				<a class="navbar-brand" href="index.html">LeaderPlant</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarResponsive" aria-controls="navbarResponsive"
					aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarResponsive">
					<ul class="navbar-nav ml-auto">
						<li class="nav-item"><a class="nav-link" href="cart.html">Panier</a></li>
						<li class="nav-item active"><a class="nav-link"			
							href="/e-commerce-project/connexionVendeur">Vendeur</a></li>
						<li class="nav-item"><a class="nav-link" href="cart.html">Besoin d'aide?</a>
						</li>
					</ul>
				</div>
			</div>
		</nav>

		<form action="connexionAcheteur" method="POST">
			<label for="email"> Adresse email : </label> <input name="email"
				type="email"> <label for="password"> Mot de passe :
			</label> <input name="password" type="password"> <input type="submit"
				value="continuer">
		</form>
		
		
		<a href=""> Vous n'avez pas de compte ? </a>
	</div>

	<!-- end Navigation-->
	<!-- <!-- banner-->
	<div class="container">
		<!-- <div id="banner" class="row">
			<div class="offset-lg-2 col-lg-8">

				<img src="C:\Users\MGR\git\ProjetFilRouge\projet-eclipse\WebContent\images\fleurs-de-france.png" alt="Fleurs de France">
			</div>
			end banner
		</div> -->

		<div class="row">
			<div class="col">
				<h1 class="text-center my-4">Nos produits de la saison</h1>
			</div>
		</div>
	</div> 
	
	
 

	
	<div class="container">
	<h1><i>LeaderPlant</i><img src="C:\Users\MGR\git\ProjetFilRouge\projet-eclipse\WebContent\images\fleurs-de-france.png"></h1>
  <h3>Une pépinière engagée pour le développement durable.</h3>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
      <li data-target="#myCarousel" data-slide-to="4"></li>
      
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">

      <div class="item active">
        <img src="C:\Users\MGR\git\ProjetFilRouge\projet-eclipse\WebContent\images\pommier.jpg" alt="Pommier Malus" style="width:100%;">
        <div class="carousel-caption">
          <h3>Pommier</h3>
          <p>Pommier malus, so red!</p>
        </div>
      </div>

      <div class="item">
        <img src="C:\Users\MGR\git\ProjetFilRouge\projet-eclipse\WebContent\images\Flowers.jpg" alt="flowers" style="width:100%;">
        <div class="carousel-caption">
          <h3 style="color: black;">Flowers</h3>
          <p style="color: black;">La joie des fleurs..!</p>
        </div>
      </div>
    
      <div class="item">
        <img src="C:\Users\MGR\git\ProjetFilRouge\projet-eclipse\WebContent\images\cerisier-napoleon.jpg" alt="Cerises" style="width:100%;">
        <div class="carousel-caption">
          <h3>Cerisier</h3>
          <p>Du bonheur dans votre jardin!</p>
        </div>
      </div>
      
      <div class="item">
        <img src="C:\Users\MGR\git\ProjetFilRouge\projet-eclipse\WebContent\images\citrus-faustrime.jpg" alt="citronier" style="width:100%;">
        <div class="carousel-caption">
          <h3 style="color: yellow;">Citrus faustrime</h3>
           <p style="color: yellow;">L'hybride naturel!</p>
        </div>
      </div>
      
       <div class="item">
        <img src="C:\Users\MGR\git\ProjetFilRouge\projet-eclipse\WebContent\images\agastache-golden-jubilee.jpg" alt="Agastache" style="width:100%;">
        <div class="carousel-caption">
          <h3 style="color: red;">Agastache golden jubile</h3>
           <p style="color: red;">Un parfum enivrant et anisé!</p>
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
	
	

</body>
</html>