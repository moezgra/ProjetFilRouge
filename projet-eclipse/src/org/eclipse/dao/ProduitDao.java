package org.eclipse.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.config.MyConnection;
import org.eclipse.model.Produit;



public class ProduitDao implements Dao<Produit> {

	public Produit save(Produit produit) {
	
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement(
						"insert into produit (designation, prixUnitaire, QteStockee, imageURL) values (?,?,?,?); ",
						PreparedStatement.RETURN_GENERATED_KEYS);
			
				ps.setString(1, produit.getDesignation());
				ps.setInt(2, produit.getPrixUnit());
				ps.setInt(3, produit.getQuantStockee());
				ps.setString(4, produit.getImageURL());
				ps.executeUpdate();
				ResultSet resultat = ps.getGeneratedKeys();
				if (resultat.next()) {
					produit.setId(resultat.getInt(1));
					return produit;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
}
	
	
		
	public void remove(Produit produit) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("DELETE FROM produit WHERE id = ? ; ");
				ps.setInt(1, produit.getId());
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public Produit update(Produit produit) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c
						.prepareStatement("UPDATE Produit SET designation=?, prixUnitaire=?, QteStockee=?, imageURL=? WHERE id=?;");
				ps.setString(1, produit.getDesignation());
				ps.setInt(2, produit.getPrixUnit());
				ps.setInt(3, produit.getQuantStockee());
				ps.setString(4, produit.getImageURL());
				ps.setInt(5, produit.getId());
				int nbr = ps.executeUpdate();
				if (nbr == 1) {
					return produit;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public Produit findById(int id) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("SELECT * FROM produit WHERE id = ?;");
				ps.setInt(1, id);
				ResultSet result = ps.executeQuery();
				if (result.next()) {
					String designation = result.getString(2);
					int prixUnit = result.getInt(3);
					int quantStockee = result.getInt(4);
					Produit produit = new Produit(id, designation, prixUnit, quantStockee);
					return produit;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public List<Produit> findAll() {
		ArrayList<Produit> produits = new ArrayList<Produit>();
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("SELECT * FROM produit;");
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					int id = result.getInt(1);
					String designation = result.getString(2);
					int prixUnit = result.getInt(3);
					int quantStockee = result.getInt(4);
					Produit produit = new Produit(id, designation, prixUnit, quantStockee);
					produits.add(produit);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return produits;
	}
}
