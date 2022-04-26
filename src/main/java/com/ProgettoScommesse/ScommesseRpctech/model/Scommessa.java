package com.ProgettoScommesse.ScommesseRpctech.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Scommessa")
public class Scommessa 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "codice")
	private long codice;
	@Column(name = "sport")
	private String sport;
	@Column(name = "username")
	private String username;
	@Column(name="partita")
	private String partita;
	@Column (name="id_partita")
	private long id_partita;
	@Column (name="segno")
	private String segno;
	@Column (name="quota")
	private double quota;
	
	public Scommessa()
	{
		super();
	}
	
	public Scommessa(long codice, String sport, String username, String partita, long id_partita, String segno, double quota)
	{
		super();
		this.codice = codice;
		this.sport = sport;
		this.username = username;
		this.partita = partita;
		this.id_partita = id_partita;
		this.segno = segno;
		this.quota = quota;
	}

	public long getCodice()
	{
		return codice;
	}

	public void setCodice(long codice)
	{
		this.codice = codice;
	}

	public String getSport()
	{
		return sport;
	}

	public void setSport(String sport)
	{
		this.sport = sport;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPartita()
	{
		return partita;
	}

	public void setPartita(String partita)
	{
		this.partita = partita;
	}

	public long getId_partita() 
	{
		return id_partita;
	}

	public void setId_partita(long id_partita)
	{
		this.id_partita = id_partita;
	}

	public String getSegno()
	{
		return segno;
	}

	public void setSegno(String segno)
	{
		this.segno = segno;
	}

	public double getQuota()
	{
		return quota;
	}

	public void setQuota(double quota)
	{
		this.quota = quota;
	}
}