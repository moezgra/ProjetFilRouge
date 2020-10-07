package org.eclipse.model;

import java.util.Date;

public class Commande {
	private String id;
	private Date date;
	public Commande() {
		super();
	}
	public Commande(String id, Date date) {
		super();
		this.id = id;
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		return "Commande [id=" + id + ", date=" + date + "]";
	}

	
}
