package org.eclipse.model;

public class LigneCommande {

	private int id;
	private int quantiteCommandee;
	private Commande commande;
	private Produit produit;

	public LigneCommande() {
		super();
	}

	public LigneCommande(int id, int quantiteCommandee, Commande commande, Produit produit) {
		super();
		this.id = id;
		this.quantiteCommandee = quantiteCommandee;
		this.commande = commande;
		this.produit = produit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantiteCommandee() {
		return quantiteCommandee;
	}

	public void setQuantiteCommandee(int quantiteCommandee) {
		this.quantiteCommandee = quantiteCommandee;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	@Override
	public String toString() {
		return "LigneCommande [id=" + id + ", quantiteCommandee=" + quantiteCommandee + ", commande=" + commande
				+ ", produit=" + produit + "]";
	}

}
