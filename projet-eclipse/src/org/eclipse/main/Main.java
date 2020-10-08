package org.eclipse.main;

import org.eclipse.model.Produit;
import org.eclipse.service.ProduitService;


public class Main {

	public static void main(String[] args) {
		
		ProduitService produitServ = new ProduitService();
		Produit produit1 = new Produit(1, "Machine à laver Xlm12", "machine puissante 1500 t/mn", 487, 27, "www.zff.fe");
		produitServ.save(produit1);
		produitServ.save(new Produit(2, "Tv tft 120cm", "Ecran plat àcristaux génèration x845", 845, 22, "www.zfr.fe"));
		produitServ.remove(produit1);
		System.out.println("Tableau de produits : " + produitServ.getProduits());
	
		
		
		

	}

}
