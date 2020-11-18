package org.eclipse.service;

import java.util.ArrayList;

import org.eclipse.model.Utilisateur;

public class UtilisateurService {

	private ArrayList<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();

	public UtilisateurService() {
		utilisateurs.add(new Utilisateur(1, "dupont", "marc", "dupont", "123", "client"));
		utilisateurs.add(new Utilisateur(1, "pasteur", "louis", "pasteur", "123", "client"));
		utilisateurs.add(new Utilisateur(1, "eiffel", "gustave", "eiffel", "123", "vendeur"));
		utilisateurs.add(new Utilisateur(1, "baba", "ali", "eiffel", "123", "vendeur"));
	}

	public Utilisateur findByLoginAndPassword(String login, String password) {
		for (Utilisateur utilisateur : utilisateurs) {
			if (utilisateur.getLogin().equals(login) && utilisateur.getPassword().equals(password)) {
				return utilisateur;
			}
		}
		return null;
	}

}
