package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.Produit;
import org.eclipse.model.Utilisateur;


public class UtilisateurService {
	ArrayList<Utilisateur>utilisateurs = new ArrayList<Utilisateur>();

	public UtilisateurService() {
		super();
	}

	public UtilisateurService(ArrayList<Utilisateur> utilisateurs) {
		super();
		this.utilisateurs = utilisateurs;
	}

	public ArrayList<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(ArrayList<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	
	
	public void save(Utilisateur utilisateur) {
		utilisateurs.add(utilisateur);
		
	}
	
	public void remove(Utilisateur utilisateur) {	
		utilisateurs.remove(utilisateur);
	}
	
	public void update(Utilisateur utilisateur) {
		for (Utilisateur element: utilisateurs) {
			if (element.getId() == utilisateur.getId()) {
				element = utilisateur;
			}
		}
	}
	public ArrayList<Utilisateur> findAll(Utilisateur utilisateur) {
		return utilisateurs;
		
	}
	public Utilisateur findById(int utilisatuerId) {
		for (Utilisateur element : utilisateurs) {
			if(utilisatuerId == element.getId()) {
				return element;
			}
		}
		return null;
	}
	
	
	public Utilisateur findByLoginAndPassword(String login, String password) {
		for (Utilisateur utilisateur : utilisateurs) {
			if(login == utilisateur.getLogin() &&  password == utilisateur.getPassword()){
				return utilisateur;
			}
			
		}
		return null;
		
	}
	
	
	@Override
	public String toString() {
		return "UtilisateurService [utilisateurs=" + utilisateurs + "]";
	}
	
	

}
