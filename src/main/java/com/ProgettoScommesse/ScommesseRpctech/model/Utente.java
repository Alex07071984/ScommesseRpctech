package com.ProgettoScommesse.ScommesseRpctech.model;

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
	private double saldo;
	@Column(name ="maggiorenne")
	private Boolean mag;
	@Column(name ="documento")
	private String doc;  

	public Utente()
	{
		super();
	}
	public Utente(int id, String cognome, String nome, String user, String pwd, double saldo, Boolean cdc, Boolean mag, String doc)
	{
		super();
		this.id = id;
		this.cognome = cognome;
		this.nome = nome;
		this.user = user;
		this.pwd = pwd;
		this.saldo = saldo;	
		this.cdc=cdc;
		this.mag=mag;
		this.doc=doc;
	}

	public int getId()
	{
		return id;
	}
	public void setId(int id)
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

	public double getSaldo()
	{
		return saldo;
	}

	public void setSaldo(double d)
	{
		this.saldo = d;
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