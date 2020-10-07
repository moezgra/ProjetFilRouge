package org.eclipse.model;


public class Panier {
	private int id;
	private int nomArticle;
	private int qteArticle;
	private float prixUniArticle;
	private float prixTotalArticle;
	private float prixTotPan;
	public Panier() {
		super();
	}
	public Panier(int id, int nomArticle, int qteArticle, float prixUniArticle, float prixTotalArticle,
			float prixTotPan) {
		super();
		this.id = id;
		this.nomArticle = nomArticle;
		this.qteArticle = qteArticle;
		this.prixUniArticle = prixUniArticle;
		this.prixTotalArticle = prixTotalArticle;
		this.prixTotPan = prixTotPan;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNomArticle() {
		return nomArticle;
	}
	public void setNomArticle(int nomArticle) {
		this.nomArticle = nomArticle;
	}
	public int getQteArticle() {
		return qteArticle;
	}
	public void setQteArticle(int qteArticle) {
		this.qteArticle = qteArticle;
	}
	public float getPrixUniArticle() {
		return prixUniArticle;
	}
	public void setPrixUniArticle(float prixUniArticle) {
		this.prixUniArticle = prixUniArticle;
	}
	public float getPrixTotalArticle() {
		return prixTotalArticle;
	}
	public void setPrixTotalArticle(float prixTotalArticle) {
		this.prixTotalArticle = prixTotalArticle;
	}
	public float getPrixTotPan() {
		return prixTotPan;
	}
	public void setPrixTotPan(float prixTotPan) {
		this.prixTotPan = prixTotPan;
	}
	@Override
	public String toString() {
		return "Panier [id=" + id + ", nomArticle=" + nomArticle + ", qteArticle=" + qteArticle + ", prixUniArticle="
				+ prixUniArticle + ", prixTotalArticle=" + prixTotalArticle + ", prixTotPan=" + prixTotPan + "]";
	}
	
	

}
