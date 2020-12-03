package org.eclipse.model;

import java.util.Date;

public class Commande {
	private int id;
	private Date dateCommande;
	private Acheteur acheteur;
	
	public Commande() {
		super();
	}

	public Commande(int id) {
		super();
		this.id = id;
	}

	public Commande(int id, Date dateCommande, Acheteur acheteur) {
		super();
		this.id = id;
		this.dateCommande = dateCommande;
		this.acheteur = acheteur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Acheteur getAcheteur() {
		return acheteur;
	}

	public void setAcheteur(Acheteur acheteur) {
		this.acheteur = acheteur;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", dateCommande=" + dateCommande + ", acheteur=" + acheteur + "]";
	}
	
	
	
	
}	
	