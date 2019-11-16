package com.transit.model;

import java.util.Date;

public class DataModel {
	
	private Long id;
	private String emerKlienti;
	private Long idShitjeKoka;
	private Date dateKrijimi;
	
	public DataModel() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getEmerKlienti() {
		return emerKlienti;
	}

	public void setEmerKlienti(String emerKlienti) {
		this.emerKlienti = emerKlienti;
	}

	public Long getIdShitjeKoka() {
		return idShitjeKoka;
	}

	public void setIdShitjeKoka(Long idShitjeKoka) {
		this.idShitjeKoka = idShitjeKoka;
	}
	

	public Date getDateKrijimi() {
		return dateKrijimi;
	}

	public void setDateKrijimi(Date dateKrijimi) {
		this.dateKrijimi = dateKrijimi;
	}

	@Override
	public String toString() {
		return "MessageModel [id=" + id + ", emerKlienti=" + emerKlienti + ", idShitjeKoka=" + idShitjeKoka + "]";
	}
	
}
