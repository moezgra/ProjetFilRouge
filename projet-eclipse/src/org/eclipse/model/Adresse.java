package org.eclipse.model;

public class Adresse {
	private int id;
	private String rue;
	private String ville;
	private String codePo;
	
	public Adresse() {
		super();
	}
	
	public Adresse(String rue, String ville, String codePo) {
		super();
		this.rue = rue;
		this.ville = ville;
		this.codePo = codePo;
	}

	public Adresse(int id, String rue, String ville, String codePo) {
		super();
		this.id = id;
		this.rue = rue;
		this.ville = ville;
		this.codePo = codePo;
	}

	public String getRue() {
		return rue;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCodePo() {
		return codePo;
	}

	public void setCodePo(String codePo) {
		this.codePo = codePo;
	}

	@Override
	public String toString() {
		return "Adresse [id=" + id + ", rue=" + rue + ", ville=" + ville + ", codePo=" + codePo + "]";
	}

	
	

	
}
