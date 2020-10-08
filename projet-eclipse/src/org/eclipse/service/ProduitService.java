package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.Produit;

import com.sun.tools.classfile.Annotation.element_value;


public class ProduitService {
	
	ArrayList<Produit>produits = new ArrayList();

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
	
	public void findById (Produit produit) {
		for (Produit element : produits) {
			if(element.findById() == produit.findById()) {
				
			}
			
		}
	}
		
	
	
		
	


	@Override
	public String toString() {
		return "ProduitService [produits=" + produits + "]";
	}
	
	
}
	
	
	