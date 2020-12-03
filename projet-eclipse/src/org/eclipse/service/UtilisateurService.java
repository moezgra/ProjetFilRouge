package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.Acheteur;
import org.eclipse.model.Adresse;
import org.eclipse.model.Vendeur;



public class UtilisateurService {

	private ArrayList<Acheteur> acheteurs = new ArrayList<Acheteur>();
	private ArrayList<Vendeur> vendeurs = new ArrayList<Vendeur>();
	
	public UtilisateurService() {
		acheteurs.add(new Acheteur(1, "moez@gmail.com", "moez", "eiffel", "gustave", new Adresse()));
		vendeurs.add(new Vendeur(1, "grami@gmail.com", "grami", "leader plant", "12345"));
		
	}

	public ArrayList<Acheteur> getAcheteurs() {
		return acheteurs;
	}

	public void setAcheteurs(ArrayList<Acheteur> acheteurs) {
		this.acheteurs = acheteurs;
	}

	public ArrayList<Vendeur> getVendeurs() {
		return vendeurs;
	}

	public void setVendeurs(ArrayList<Vendeur> vendeurs) {
		this.vendeurs = vendeurs;
	}

	public void addVendeur(Vendeur vendeur) {
		vendeurs.add(vendeur);
	}
	
	public void addAcheteur(Acheteur acheteur) {
		acheteurs.add(acheteur);
	}

	public void removeAcheteur(Acheteur acheteur) {
		acheteurs.remove(acheteur);
	}

	public void removeVendeur(Vendeur vendeur) {
		vendeurs.remove(vendeur);
	}

	public Acheteur findByIdAcheteur(int id) {
		for (int i = 0; i < acheteurs.size(); i++) {
			Acheteur findAcheteurById = acheteurs.get(i);
			if (id == findAcheteurById.getId()) {
				return acheteurs.get(i);
			}

		}
		return null;

	}
	
	public Vendeur findByIdVendeur(int id) {
		for (int i = 0; i < vendeurs.size(); i++) {
			Vendeur findVendeurById = vendeurs.get(i);
			if (id == findVendeurById.getId()) {
				return vendeurs.get(i);
			}

		}
		return null;

	}

	public Acheteur findByLoginAcheteur(String adresseEmail, String motDePasse) {
		for (int i = 0; i < acheteurs.size(); i++) {
			Acheteur findAcheteur = acheteurs.get(i);
			if (adresseEmail.equals(findAcheteur.getAdresseEmail()) && motDePasse.equals(findAcheteur.getMotDePasse())) {
				return acheteurs.get(i);
			}

		}
		return null;

	}

	public Vendeur findByLoginVendeur(String adresseEmail, String motDePasse) {
		for (int i = 0; i < vendeurs.size(); i++) {
			Vendeur findVendeur = vendeurs.get(i);
			if (adresseEmail.equals(findVendeur.getAdresseEmail()) && motDePasse.equals(findVendeur.getMotDePasse())) {
				return vendeurs.get(i);
			}

		}
		return null;

	}

	

	public void updateAcheteur(int id, Acheteur acheteur) {
		for (int i = 0; i < acheteurs.size(); i++) {
			Acheteur findAcheteurById = acheteurs.get(i);
			if (id == findAcheteurById.getId()) {
				acheteurs.remove(findAcheteurById);
				acheteurs.add(acheteur);
			}

		}

	}

	public void updateVendeur(int id, Vendeur vendeur) {
		for (int i = 0; i < vendeurs.size(); i++) {
			Vendeur findVendeurById = vendeurs.get(i);
			if (id == findVendeurById.getId()) {
				vendeurs.remove(findVendeurById);
				vendeurs.add(vendeur);
			}

		}

	}

	public ArrayList<Acheteur> findAllAcheteur() {
		return acheteurs;

	}

	public ArrayList<Vendeur> findallVendeur() {
		return vendeurs;
	}

	@Override
	public String toString() {
		return "UtilisateurService [acheteurs=" + acheteurs + ", vendeurs=" + vendeurs + "]";
	}

	
}


