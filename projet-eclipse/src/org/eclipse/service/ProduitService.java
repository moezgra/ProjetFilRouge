package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.Produit;


public class ProduitService {
	
	ArrayList<Produit>produits = new ArrayList<Produit>();
	

	public ProduitService() {
		super();
	}

	public ProduitService(ArrayList<Produit> produits) {
		super();
		this.produits = produits;
		
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
	public ArrayList<Produit> findAll(Produit produit) {
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
	
	// on iterate dans tab produits, si qté d'un produit >0 alors on ajoute ce produit dans le tableau des "disponibles"
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
	
	
	