package org.eclipse.model;

import java.util.ArrayList;



public class Panier {
	private int id;
	private int totalPanier;
	
	ArrayList<LignePanier> panierProduits = new ArrayList<LignePanier>();
	Acheteur acheteur = new Acheteur();

	public Panier(ArrayList<LignePanier> panierProduits, Acheteur acheteur) {
		super();
		this.panierProduits = panierProduits;
		this.acheteur = acheteur;
	}

	public Panier(Acheteur acheteur) {
		super();
		this.acheteur = acheteur;
	}

	public Panier() {
		super();

	}

	public ArrayList<LignePanier> getPanier() {
		return panierProduits;
	}

	public void setPanier(ArrayList<LignePanier> panier) {
		this.panierProduits = panier;
	}

	public Acheteur getAcheteur() {
		return acheteur;
	}

	public void setAcheteur(Acheteur acheteur) {
		this.acheteur = acheteur;
	}

	public void addInCart(LignePanier panier) {
		panierProduits.add(panier);
	}

	public void removeInCart(LignePanier panier) {
		panierProduits.remove(panier);
	}

	public LignePanier findById(int id) {
		for (int i = 0; i < panierProduits.size(); i++) {
			LignePanier findlignedeCommandePanierProduit = panierProduits.get(i);
			if (id == findlignedeCommandePanierProduit.getId()) {
				return panierProduits.get(i);
			}

		}
		return null;
	}

	public void updateOne(int id, LignePanier ligneCommandePanierProduit) {
		for (int i = 0; i < panierProduits.size(); i++) {
			LignePanier findCommandePanierProduit = panierProduits.get(i);
			if (id == findCommandePanierProduit.getId()) {
				panierProduits.remove(findCommandePanierProduit);
				panierProduits.add(ligneCommandePanierProduit);
			}
		}
	}

	public float prixTotalPanier() {
		float prixTotal = 0;
		for (LignePanier produit : panierProduits) {
			//prixTotal = prixTotal + produit.montant();

		}
		return prixTotal;
	}

	public ArrayList<LignePanier> findAll() {
		return panierProduits;

	}
}
	


