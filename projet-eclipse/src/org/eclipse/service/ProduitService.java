package org.eclipse.service;

import java.util.List;

import org.eclipse.dao.ProduitDao;
import org.eclipse.model.Produit;

public class ProduitService {
	private ProduitDao produitDao = new ProduitDao();

	public void remove(Produit produit) {
		produitDao.remove(produit);
	}

	public Produit save(Produit produit) {
		return produitDao.save(produit);

	}

	public Produit updateProduit(int id, Produit produit) {
		return produitDao.update(produit);

	}

	public List<Produit> findAll() {
		return produitDao.findAll();

	}

	public Produit findById(int produitId) {
		return produitDao.findById(produitId);
	}

}
