package org.eclipse.model;

import java.util.ArrayList;



public class Panier {
	private int id;
	private int totalPanier;
	
	ArrayList<LigneCommandePanierProduit> panierProduits = new ArrayList<LigneCommandePanierProduit>();
	Acheteur acheteur = new Acheteur();

	public Panier(ArrayList<LigneCommandePanierProduit> panierProduits, Acheteur acheteur) {
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

	public ArrayList<LigneCommandePanierProduit> getPanier() {
		return panierProduits;
	}

	public void setPanier(ArrayList<LigneCommandePanierProduit> panier) {
		this.panierProduits = panier;
	}

	public Acheteur getAcheteur() {
		return acheteur;
	}

	public void setAcheteur(Acheteur acheteur) {
		this.acheteur = acheteur;
	}

	public void addInCart(LigneCommandePanierProduit panier) {
		panierProduits.add(panier);
	}

	public void removeInCart(LigneCommandePanierProduit panier) {
		panierProduits.remove(panier);
	}

	public LigneCommandePanierProduit findById(int id) {
		for (int i = 0; i < panierProduits.size(); i++) {
			LigneCommandePanierProduit findlignedeCommandePanierProduit = panierProduits.get(i);
			if (id == findlignedeCommandePanierProduit.getId()) {
				return panierProduits.get(i);
			}

		}
		return null;
	}

	public void updateOne(int id, LigneCommandePanierProduit ligneCommandePanierProduit) {
		for (int i = 0; i < panierProduits.size(); i++) {
			LigneCommandePanierProduit findCommandePanierProduit = panierProduits.get(i);
			if (id == findCommandePanierProduit.getId()) {
				panierProduits.remove(findCommandePanierProduit);
				panierProduits.add(ligneCommandePanierProduit);
			}
		}
	}

	public float prixTotalPanier() {
		float prixTotal = 0;
		for (LigneCommandePanierProduit produit : panierProduits) {
			prixTotal = prixTotal + produit.montant();

		}
		return prixTotal;
	}

	public ArrayList<LigneCommandePanierProduit> findAll() {
		return panierProduits;

	}
}
	


