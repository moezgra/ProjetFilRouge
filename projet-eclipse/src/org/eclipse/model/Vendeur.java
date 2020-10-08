package org.eclipse.model;

import java.util.Arrays;

public class Vendeur extends Utilisateur {
	private Produit [] produit;
	
	
	public Produit[] getProduit() {
		return produit;
	}


	public void setProduit(Produit[] produit) {
		this.produit = produit;
	}

	@Override
	public String toString() {
		return "Vendeur [produit=" + Arrays.toString(produit) + ", getId()=" + getId() + ", getNom()=" + getNom()
				+ ", getPrenom()=" + getPrenom() + ", getNumTele()=" + getNumTele() + ", getEmail()=" + getEmail()
				+ ", getAdresse()=" + getAdresse() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	

}
