package org.eclipse.model;

public class Utilisateur {
	private int id;
	private String adresseEmail;
	private String motDePasse;
	
	public Utilisateur() {
		super();
	}

	public Utilisateur(int id, String adresseEmail, String motDePasse) {
		super();
		this.id = id;
		this.adresseEmail = adresseEmail;
		this.motDePasse = motDePasse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", adresseEmail=" + adresseEmail + ", motDePasse=" + motDePasse + "]";
	}
	
	
	
	
	
}