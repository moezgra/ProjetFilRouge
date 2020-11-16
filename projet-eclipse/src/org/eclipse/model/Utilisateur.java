package org.eclipse.model;

public class Utilisateur {
	private int id;
	private String nom;
	private String prenom;
	private String numTele;
	private String email;
	private String login;
	private String password;
	private Adresse adresse;
	private String type;
	 
	public Utilisateur() {
		super();
	}
	
	
	public Utilisateur(int id, String nom, String prenom, String numTele, String email, String login, String password,
			Adresse adresse, String type) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.numTele = numTele;
		this.email = email;
		this.login = login;
		this.password = password;
		this.adresse = adresse;
		this.type = type;
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


	public String getNumTele() {
		return numTele;
	}


	public void setNumTele(String numTele) {
		this.numTele = numTele;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Adresse getAdresse() {
		return adresse;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", numTele=" + numTele + ", email="
				+ email + ", login=" + login + ", password=" + password + ", adresse=" + adresse + ", type=" + type
				+ "]";
	}
	
	
}
