package org.eclipse.model;



public class Vendeur extends Utilisateur {
	
	private String designation;
	private String numSiret;
	
	public Vendeur() {
		super();
	}

	public Vendeur(int id, String adresseEmail, String motDePasse, String designation, String numSiret) {
		super(id, adresseEmail, motDePasse);
		this.designation = designation;
		this.numSiret = numSiret;
	}
	
	public Vendeur(String adresseEmail, String motDePasse, String designation, String numSiret) {
		super(adresseEmail, motDePasse);
		this.designation = designation;
		this.numSiret = numSiret;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getNumSiret() {
		return numSiret;
	}

	public void setNumSiret(String numSiret) {
		this.numSiret = numSiret;
	}

	@Override
	public String toString() {
		return "Vendeur [designation=" + designation + ", numSiret=" + numSiret + "]";
	}
	
	
	
	
}
