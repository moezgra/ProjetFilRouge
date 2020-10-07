package org.eclipse.model;

public class Client extends Utilisateur {

	private Commande commande;
	
	

	public Client() {
		super();
	}



	public Client(int id, String nom, String prenom, String numTele, String email, Adresse adresse, Commande commande) {
		super(id, nom, prenom, numTele, email, adresse);
		this.commande = commande;
	}


	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	@Override
	public String toString() {
		return "Client [commande=" + commande + ", getId()=" + getId() + ", getNom()=" + getNom() + ", getPrenom()="
				+ getPrenom() + ", getNumTele()=" + getNumTele() + ", getEmail()=" + getEmail() + ", getAdresse()="
				+ getAdresse() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}



	

	
	

}
