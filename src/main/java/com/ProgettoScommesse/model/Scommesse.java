package com.ProgettoScommesse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Scommesse")
public class Scommesse 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "id_schedina")
	private int id_schedina;
	@Column(name = "sport")
	private String sport;
	@Column(name = "username")
	private String username;
	@Column(name="partita")
	private String partita;
	@Column (name="id_partita")
	private int codice;
	@Column (name="segno")
	private String segno;
	@Column (name="quota")
	private float quota;
	
	public Scommesse()
	{
		super();
	}
	
	public Scommesse(Integer id, int id_schedina, String sport, String username, String partita, int codice, String segno, float quota)
	{
		super();
		this.id = id;
		this.id_schedina = id_schedina;
		this.sport = sport;
		this.username = username;
		this.partita = partita;
		this.codice = codice;
		this.segno = segno;
		this.quota = quota;
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public int getId_schedina()
	{
		return id_schedina;
	}

	public void setId_schedina(int id_schedina)
	{
		this.id_schedina = id_schedina;
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

	public int getCodice() 
	{
		return codice;
	}

	public void setCodice(int codice)
	{
		this.codice = codice;
	}

	public String getSegno()
	{
		return segno;
	}

	public void setSegno(String segno)
	{
		this.segno = segno;
	}

	public float getQuota()
	{
		return quota;
	}

	public void setQuota(float quota)
	{
		this.quota = quota;
	}
}