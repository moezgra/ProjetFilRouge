package org.eclipse.model;

public class LignePanier {
	private int id;
	private int quantite;
	private Produit produit;
	private Panier panier;
	public LignePanier() {
		super();
	}
	public LignePanier(int id, int quantite, Produit produit, Panier panier) {
		super();
		this.id = id;
		this.quantite = quantite;
		this.produit = produit;
		this.panier = panier;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public Panier getPanier() {
		return panier;
	}
	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	@Override
	public String toString() {
		return "LignePanier [id=" + id + ", quantite=" + quantite + ", produit=" + produit + ", panier=" + panier + "]";
	}

	
}
