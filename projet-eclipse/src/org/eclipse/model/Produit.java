package org.eclipse.model;

public class Produit {
	private int id;
	private String designation;
	private int prixUnit;
	private int quantStockee;
	private String imageURL;


	public Produit() {
		super();
	}

		
	public Produit(int id) {
		super();
		this.id = id;
	}

	
	
	public Produit(int id, String designation, int prixUnit, int quantStockee) {
		super();
		this.id = id;
		this.designation = designation;
		this.prixUnit = prixUnit;
		this.quantStockee = quantStockee;
	}


	public Produit(int id, String designation, int prixUnit, int quantStockee, String imageURL) {
		super();
		this.id = id;
		this.designation = designation;
		this.prixUnit = prixUnit;
		this.quantStockee = quantStockee;
		this.imageURL = imageURL;
	}


	public Produit(String designation, int prixUnit, int quantStockee, String imageURL) {
		super();
		this.designation = designation;
		this.prixUnit = prixUnit;
		this.quantStockee = quantStockee;
		this.imageURL = imageURL;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public int getPrixUnit() {
		return prixUnit;
	}


	public void setPrixUnit(int prixUnit) {
		this.prixUnit = prixUnit;
	}


	public int getQuantStockee() {
		return quantStockee;
	}


	public void setQuantStockee(int quantStockee) {
		this.quantStockee = quantStockee;
	}
	
	public String getImageURL() {
		return imageURL;
	}


	public void setImageURL(String imageURL) {
		this.designation = imageURL;
	}


	@Override
	public String toString() {
		return "Produit [id=" + id + ", designation=" + designation + ", prixUnit=" + prixUnit + ", quantStockee="
				+ quantStockee + ", imageURL=" + imageURL + "]";
	}
	
	

	
	
	
	
	
	

}	