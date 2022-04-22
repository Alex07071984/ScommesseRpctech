package com.ProgettoScommesse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="utente")
public class Utente
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name ="nome")
	private String nome;
	@Column(name ="cognome")
	private String cognome;
	@Column(name ="username")
	private String user;
	@Column(name ="password")
	private String pwd;
	@Column(name ="carta_credito")
	private Boolean cdc;
	@Column(name ="saldo")
	private float saldo;
	@Column(name ="maggiorenne")
	private Boolean mag;
	@Column(name ="documento")
	private String doc;  

	public Utente(Integer id, String c1, String n1, String u1, String p1, float s1, Boolean cdc, Boolean mag, String doc)
	{
		this.id=id;
		this.cognome = c1;
		this.nome = n1;
		this.user = u1;
		this.pwd = p1;
		this.saldo = s1;	
		this.cdc=cdc;
		this.mag=mag;
		this.doc=doc;
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getCognome()
	{
		return cognome;
	}

	public void setCognome(String cognome)
	{
		this.cognome = cognome;
	}

	public String getUser()
	{
		return user;
	}

	public void setUser(String user)
	{
		this.user = user;
	}

	public String getPwd()
	{
		return pwd;
	}

	public void setPwd(String pwd)
	{
		this.pwd = pwd;
	}

	public Boolean getCdc()
	{
		return cdc;
	}

	public void setCdc(Boolean cdc)
	{
		this.cdc = cdc;
	}

	public float getSaldo()
	{
		return saldo;
	}

	public void setSaldo(float saldo)
	{
		this.saldo = saldo;
	}

	public Boolean getMag()
	{
		return mag;
	}

	public void setMag(Boolean mag)
	{
		this.mag = mag;
	}

	public String getDoc()
	{
		return doc;
	}

	public void setDoc(String doc)
	{
		this.doc = doc;
	}
}