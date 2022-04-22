package com.ProgettoScommesse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="schedina")
public class Schedina {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer Id;
	@Column (name="codice_schedina")
	private String cs;
	@Column (name="importo")
	private float imp;
	
	  public Schedina() {
		   super();
	   }
	  
	public Schedina(Integer id, String cs, float imp) {
		super();
		Id = id;
		this.cs = cs;
		this.imp = imp;
	}


	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	public String getCs() {
		return cs;
	}


	public void setCs(String cs) {
		this.cs = cs;
	}


	public float getImp() {
		return imp;
	}


	public void setImp(float imp) {
		this.imp = imp;
	}
	
	
	
	

}
