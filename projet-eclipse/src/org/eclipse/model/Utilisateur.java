package org.eclipse.model;

public class Utilisateur {
	private int id;
	private String nom;
	private String prenom;
	private String adresseEmail;
	private String motDePasse;
	private String type;
	
	public Utilisateur() {
		super();
	}

	public Utilisateur(int id, String nom, String prenom, String adresseEmail, String motDePasse, String type) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresseEmail = adresseEmail;
		this.motDePasse = motDePasse;
		this.type = type;
	}

	public Utilisateur(String nom, String prenom, String adresseEmail, String motDePasse, String type) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresseEmail = adresseEmail;
		this.motDePasse = motDePasse;
		this.type = type;
	}

	public Utilisateur(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getAdresseEmail() {
		return adresseEmail;
	}

	public void setAdresseEmail(String adresseEmail) {
		this.adresseEmail = adresseEmail;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresseEmail=" + adresseEmail
				+ ", motDePasse=" + motDePasse + ", type=" + type + "]";
	}
	
	
	
}	
	
	