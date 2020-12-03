package org.eclipse.service;

import java.util.ArrayList;


import org.eclipse.model.Produit;


public class ProduitService {
	
	ArrayList<Produit>produits = new ArrayList<Produit>();
	


	public ProduitService() {
		produits.add(new Produit(1, "Amandier d'Indonésie", 18, 35));
		produits.add(new Produit(2, "Carottes blanches", 11, 45));
		
	}

	public ArrayList<Produit> getProduits() {
		return produits;
	}

	public void setProduits(ArrayList<Produit> produits) {
		this.produits = produits;
	} 
	
	public void addProduit(Produit produit) {
		produits.add(produit);
	}
		
	
	public void remove(Produit produit) {	
		produits.remove(produit);
	}
	public void save(Produit produit) {
		produits.add(produit);
		
	}
	public void updateProduit(int id, Produit produit) {
		for (int i = 0; i < produits.size(); i++) {
			Produit findProduitById = produits.get(i);
			if (id == findProduitById.getId()) {
				produits.remove(findProduitById);
				produits.add(produit);
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
			if (produit.getQuantStockee() > 0) {
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
	
	
	