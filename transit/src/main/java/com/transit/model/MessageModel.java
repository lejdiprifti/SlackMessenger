package com.transit.model;

public class MessageModel {
	
	private Long id;
	private String emerKlienti;
	private Long idShitjeKoka;
	
	public MessageModel() {
		
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

	@Override
	public String toString() {
		return "MessageModel [id=" + id + ", emerKlienti=" + emerKlienti + ", idShitjeKoka=" + idShitjeKoka + "]";
	}
	
}
