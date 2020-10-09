package org.eclipse.main;

import org.eclipse.model.Produit;
import org.eclipse.service.ProduitService;


public class Main {

	public static void main(String[] args) {
		
		ProduitService produitServ = new ProduitService();
		Produit produit = new Produit(1, "Machine à laver Xlm12", "machine puissante 1500 t/mn", 487, 27, "www.zff.fe");
		produitServ.save(produit);
		Produit produit2 = new Produit(2, "Tv tft 120cm", "Ecran plat àcristaux génèration x845", 845, 22, "www.zfr.fe");
		produitServ.save(produit2);
		produitServ.remove(produit2);

		produitServ.save(new Produit(3, "souris", "couleur noire",10, 0, "www.zfr.fe"));


		System.out.println("Tableau de produits : " + produitServ.getProduits());
		
		System.out.println("findById :" + produitServ.findById(3));
	
		produit.setQuantStock(150);
		System.out.println(produitServ.getProduits());
		
		

	}

}
