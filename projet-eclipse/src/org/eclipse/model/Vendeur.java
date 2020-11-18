package org.eclipse.model;

import java.util.Arrays;

public class Vendeur extends Utilisateur {
	private Produit produit;

	public Vendeur() {
		super();
	}

	public Vendeur(int id, String nom, String prenom, String login, String password, String type, Produit produit) {
		super(id, nom, prenom, login, password, type);
		this.produit = produit;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	@Override
	public String toString() {
		return "Vendeur [produit=" + produit + "]";
	}
	
	
	
	
	
}
