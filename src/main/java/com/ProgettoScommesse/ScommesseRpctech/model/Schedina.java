package com.ProgettoScommesse.ScommesseRpctech.model;

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
	private Integer id;
	@Column (name = "codice_schedina")
	private long cs;
	@Column (name = "importo")
	private float imp;
	
	public Schedina()
	{
		 super();
	}
	  
	public Schedina(int id, long cs, float imp)
	{
		super();
		this.id = id;
		this.cs = cs;
		this.imp = imp;
	}

	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public Long getCs()
	{
		return cs;
	}

	public void setCs(long cs)
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