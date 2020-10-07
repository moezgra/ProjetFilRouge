package org.eclipse.model;

public class Produit {
	private int id;
	private String designation;
	private String discription;
	private float prixUnit;
	private int quantStock;
	private String urlImage;

	public Produit() {
		super();
	}

	public Produit(int id, String designation, String discription, float prixUnit, int quantStock, String urlImage) {
		super();
		this.id = id;
		this.designation = designation;
		this.discription = discription;
		this.prixUnit = prixUnit;
		this.quantStock = quantStock;
		this.urlImage = urlImage;
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

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public float getPrixUnit() {
		return prixUnit;
	}

	public void setPrixUnit(float prixUnit) {
		this.prixUnit = prixUnit;
	}

	public int getQuantStock() {
		return quantStock;
	}

	public void setQuantStock(int quantStock) {
		this.quantStock = quantStock;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", designation=" + designation + ", discription=" + discription + ", prixUnit="
				+ prixUnit + ", quantStock=" + quantStock + ", urlImage=" + urlImage + "]";
	}

}
