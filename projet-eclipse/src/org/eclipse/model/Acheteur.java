package org.eclipse.model;



public class Acheteur extends Utilisateur{

	private String nom;
	private String prenom;
	private Adresse adresse;
	
	public Acheteur() {
		super();
	}

	public Acheteur(int id, String adresseEmail, String motDePasse, String nom, String prenom,
			Adresse adresse) {
		super(id, adresseEmail, motDePasse);
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Acheteur [nom=" + nom + ", prenom=" + prenom + ", adresse="	+ adresse + "]";
	}
	
	

}