package org.eclipse.model;



public class Acheteur extends Utilisateur{

	private String nom;
	private String prenom;
	private Adresse adresse;
	
	public Acheteur() {
		super();
	}

	public Acheteur(String nom, String prenom, Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public Acheteur(int id, String nom, String prenom, String adresseEmail, String motDePasse, String type, String nom2,
			String prenom2, Adresse adresse) {
		super(id, nom, prenom, adresseEmail, motDePasse, type);
		nom = nom2;
		prenom = prenom2;
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

	
}	


