package org.eclipse.model;

public class Utilisateur {
	private int id;
	private String nom;
	private String prenom;
	private String numTele;
	private String email;
	private Adresse adresse;
	public Utilisateur() {
		super();
	}
	public Utilisateur(int id, String nom, String prenom, String numTele, String email, Adresse adresse) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.numTele = numTele;
		this.email = email;
		this.adresse = adresse;
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
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", numTele=" + numTele + ", email="
				+ email + ", adresse=" + adresse + "]";
	}
	
	
	
}
