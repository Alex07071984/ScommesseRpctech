package com.ProgettoScommesse.ScommesseRpctech.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pallavolo")
public class Volley
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "id")
	private Integer id;
	@Column(name ="data")
	private String data;
	@Column(name ="ora")
	private String ora;
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
	  
	public Volley()
	{
		super();
	}
	   
	public Volley(String data, String ora, String man, int pal, int avv, String sq1, String sq2, float sq1vincente, float sq2vincente)
	{
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

	public String getData()
	{
		return data;
	}

	public void setData(String data)
	{
		this.data = data;
	}

	public String getOra()
	{
		return ora;
	}

	public void setOra(String ora)
	{
		this.ora = ora;
	}

	public String getMan()
	{
		return man;
	}

	public void setMan(String man)
	{
		this.man = man;
	}

	public int getPal()
	{
		return pal;
	}

	public void setPal(int pal)
	{
		this.pal = pal;
	}

	public int getAvv()
	{
		return avv;
	}

	public void setAvv(int avv)
	{
		this.avv = avv;
	}

	public String getSq1()
	{
		return sq1;
	}

	public void setSq1(String sq1)
	{
		this.sq1 = sq1;
	}

	public String getSq2()
	{
		return sq2;
	}

	public void setSq2(String sq2)
	{
		this.sq2 = sq2;
	}

	public float getSq1vincente()
	{
		return sq1vincente;
	}

	public void setSq1vincente(float sq1vincente)
	{
		this.sq1vincente = sq1vincente;
	}

	public float getSq2vincente()
	{
		return sq2vincente;
	}

	public void setSq2vincente(float sq2vincente)
	{
		this.sq2vincente = sq2vincente;
	} 
}