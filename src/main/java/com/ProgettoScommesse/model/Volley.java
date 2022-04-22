package com.ProgettoScommesse.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="volley")
public class Volley {

	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY )
	   @Column(name = "id")
	   private Integer id;
	   @Column(name ="data")
	   private Date data;
	   @Column(name ="ora")
	   private float ora;
	   @Column(name ="manifestazione")
	   private String man;
	   @Column(name ="palinsesto")
	   private int pal;
	   @Column(name ="avvenimento")
	   private int avv;
	   @Column(name ="S1")
	   private String sq1;
	   @Column(name ="S2")
	   private String sq2;
	   @Column(name ="Q1")
	   private float sq1vincente;
	   @Column(name ="Q2")
	   private float sq2vincente;
	  
	   public Volley() {
		   super();
	   }
	   
	   public Volley(Date data, float ora, String man, int pal, int avv, String sq1, String sq2, float sq1vincente, float sq2vincente) {
		   super();
		   this.data=data;
		   this.ora=ora;
		   this.man=man;
		   this.pal=pal;
		   this.avv=avv;
		   this.sq1=sq1;
		   this.sq2=sq2;
		   this.sq1vincente=sq1vincente;
		   this.sq2vincente=sq2vincente;
		   
		   
	   }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public float getOra() {
		return ora;
	}

	public void setOra(float ora) {
		this.ora = ora;
	}

	public String getMan() {
		return man;
	}

	public void setMan(String man) {
		this.man = man;
	}

	public int getPal() {
		return pal;
	}

	public void setPal(int pal) {
		this.pal = pal;
	}

	public int getAvv() {
		return avv;
	}

	public void setAvv(int avv) {
		this.avv = avv;
	}

	public String getSq1() {
		return sq1;
	}

	public void setSq1(String sq1) {
		this.sq1 = sq1;
	}

	public String getSq2() {
		return sq2;
	}

	public void setSq2(String sq2) {
		this.sq2 = sq2;
	}

	public float getSq1vincente() {
		return sq1vincente;
	}

	public void setSq1vincente(float sq1vincente) {
		this.sq1vincente = sq1vincente;
	}

	public float getSq2vincente() {
		return sq2vincente;
	}

	public void setSq2vincente(float sq2vincente) {
		this.sq2vincente = sq2vincente;
	} 
	   
}
