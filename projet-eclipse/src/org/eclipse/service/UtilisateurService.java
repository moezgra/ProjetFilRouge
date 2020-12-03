package org.eclipse.service;


import java.util.List;


import org.eclipse.dao.UtilisateurDao;



import org.eclipse.model.Utilisateur;



public class UtilisateurService {
	

	private UtilisateurDao utilisateurtDao = new UtilisateurDao();

	public void remove(Utilisateur utilisateur) {
		utilisateurtDao.remove(utilisateur);
	}

	public Utilisateur save(Utilisateur utilisateur) {
		return utilisateurtDao.save(utilisateur);

	}

	public Utilisateur updateProduit(int id, Utilisateur utilisateur) {
		return utilisateurtDao.update(utilisateur);

	}

	public List<Utilisateur> findAll() {
		return utilisateurtDao.findAll();

	}

	public Utilisateur findById(int utilisateurId) {
		return utilisateurtDao.findById(utilisateurId);
	}

}


