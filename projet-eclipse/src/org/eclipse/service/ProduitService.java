package org.eclipse.service;

import java.util.ArrayList;


import org.eclipse.model.Produit;


public class ProduitService {
	
	ArrayList<Produit>produits = new ArrayList<Produit>();
	


	public ProduitService() {
		produits.add(new Produit(1, "Machine à laver Xlm12", "machine puissante 1500 t/mn", 487, 27, "www.zff.fe"));
		produits.add(new Produit(2, "Tv tft 120cm", "Ecran plat ï¿½cristaux génération x845", 1250, 22, "www.zfr.fe"));
		produits.add(new Produit(3, "Ordinateur portable dell", "cpu9, ddr=250gb, rm=16gb", 270, 56, "www.xzd.fr"));
		produits.add(new Produit(4, "réfrigérateur Samsung", "cpu9, 180cm, 3 coffres à glaces", 845, 56, "www.xzd.fr"));
		produits.add(new Produit(5, "cuisinière gaz", "Table gaz 4 foyers, four gaz, 56L, Blanc", 85, 56, "www.xzd.fr"));
	}

	public ArrayList<Produit> getProduits() {
		return produits;
	}

	public void setProduits(ArrayList<Produit> produits) {
		this.produits = produits;
	} 
	
	public void save(Produit produit) {
		produits.add(produit);
		
	}
	public void remove(Produit produit) {	
		produits.remove(produit);
	}
	public void update(Produit produit) {
		for (Produit element: produits) {
			if (element.getId() == produit.getId()) {
				element = produit;
			}
		}
	}
	public ArrayList<Produit> findAll() {
		return produits;
		
	}
	
	public Produit findById(int produitId) {
		for (Produit element : produits) {
			if(produitId == element.getId()) {
				return element;
			}
		}
		return null;
	}
	
	// on iterate dans tab produits, si qtï¿½ d'un produit >0 alors on ajoute ce produit dans le tableau des "disponibles"
	public ArrayList<Produit> findByQuantiteEnStock() {
		ArrayList<Produit> disponibles = new ArrayList<>();
		for (Produit produit : produits) {
			if (produit.getQuantStock() > 0) {
				disponibles.add(produit);
			}
		}
		return disponibles;
	}
	
	
	@Override
	public String toString() {
		return "ProduitService [produits=" + produits + "]";
	}
	
	
}
	
	
	