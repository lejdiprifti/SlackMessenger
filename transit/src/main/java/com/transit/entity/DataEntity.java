package com.transit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="messages", schema="goalpha")
public class DataEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="id")
	private Long id;
	
	@Column(name="emer_klienti")
	private String emerKlienti;
	
	@Column(name="id_shitje_koka")
	private Long idShitjeKoka;
	
	@Column(name="date_krijimi")
	@Temporal(TemporalType.DATE)
	private Date dateKrijimi;
	
	public DataEntity() {
		
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
	
	
	
}
