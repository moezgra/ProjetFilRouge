package org.eclipse.model;

public class Client extends Utilisateur {

	private Commande commande;
	

	public Client() {
		super();
	}
	
	
	public Client(int id, String nom, String prenom, String login, String password, String type, Commande commande) {
		super(id, nom, prenom, login, password, type);
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
		return "Client [commande=" + commande + "]";
	}

	
	

}
