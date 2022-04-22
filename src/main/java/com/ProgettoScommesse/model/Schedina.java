package com.ProgettoScommesse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "schedina")
public class Schedina
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column (name = "codice_schedina")
	private String cs;
	@Column (name = "importo")
	private float imp;
	
	public Schedina()
	{
		 super();
	}
	  
	public Schedina(String cs, float imp)
	{
		super();
		this.cs = cs;
		this.imp = imp;
	}

	public String getCs()
	{
		return cs;
	}

	public void setCs(String cs)
	{
		this.cs = cs;
	}

	public float getImp()
	{
		return imp;
	}

	public void setImp(float imp)
	{
		this.imp = imp;
	}
}