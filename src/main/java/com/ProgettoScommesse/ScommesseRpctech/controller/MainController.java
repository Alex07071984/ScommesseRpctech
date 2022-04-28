package com.ProgettoScommesse.ScommesseRpctech.controller;

import java.util.ArrayList;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ProgettoScommesse.ScommesseRpctech.model.Volley_service;
import com.ProgettoScommesse.ScommesseRpctech.model.Calcio_service;
import com.ProgettoScommesse.ScommesseRpctech.model.Schedina;
import com.ProgettoScommesse.ScommesseRpctech.model.Basket;
import com.ProgettoScommesse.ScommesseRpctech.model.Basket_service;
import com.ProgettoScommesse.ScommesseRpctech.model.Calcio;
import com.ProgettoScommesse.ScommesseRpctech.model.Utente_service;
import com.ProgettoScommesse.ScommesseRpctech.model.Volley;
import com.ProgettoScommesse.ScommesseRpctech.model.Schedina_service;
import com.ProgettoScommesse.ScommesseRpctech.model.Scommessa;
import com.ProgettoScommesse.ScommesseRpctech.model.Scommessa_service;
import com.ProgettoScommesse.ScommesseRpctech.model.Utente;

@RestController
public class MainController
{
    @Autowired
    Volley_service vs;
    @Autowired
    Calcio_service cs;
    @Autowired
    Basket_service bs;
    @Autowired
    Utente_service us;
    @Autowired
    Schedina_service ss;
    @Autowired
    Scommessa_service sss;
    
    @ResponseBody
    @GetMapping("/getCalcio")
    public ArrayList getCalcio()
    { 
    	ArrayList calcio = new ArrayList();
    	for (int c=0; c<cs.findAll().size(); c++)
    	{
    		Calcio app = (Calcio) cs.findAll().get(c);
    		calcio.add(app);
    	}
        return calcio;
    }
    
    @ResponseBody
    @GetMapping("/getVolley")
    public ArrayList getVolley()
    { 
    	ArrayList volley = new ArrayList();
    	for (int c=0; c<vs.findAll().size(); c++)
    	{
    		Volley app = (Volley) vs.findAll().get(c);
    		volley.add(app);
    	}
        return volley;
    }
    
    @ResponseBody
    @GetMapping("/getBasket")
    public ArrayList getBasket()
    { 
    	ArrayList basket = new ArrayList();
    	for (int c=0; c<bs.findAll().size(); c++)
    	{
    		Basket app = (Basket) bs.findAll().get(c);
    		basket.add(app);
    	}
        return basket;
    }
    
    @ResponseBody
    @GetMapping("/getSchedina")
    public ArrayList getSchedina()
    { 
    	ArrayList schedina = new ArrayList();
    	for (int c=0; c<ss.findAll().size(); c++)
    	{
    		Schedina app = (Schedina) ss.findAll().get(c);
    		schedina.add(app);
    	}
        return schedina;
    }
    
    @ResponseBody
    @GetMapping("/getScommessa")
    public ArrayList getScommessa()
    { 
    	ArrayList scommessa = new ArrayList();
    	for (int c=0; c<sss.findAll().size(); c++)
    	{
    		Scommessa app = (Scommessa) sss.findAll().get(c);
    		scommessa.add(app);
    	}
        return scommessa;
    }
    
    @GetMapping("/scommessa")
    @Transactional
    public String scommessa()
    {
    	Schedina schedina = new Schedina();
    	Scommessa scommessa = new Scommessa();
    	
    	Calcio app = (Calcio) sss.findAllC().get(0);
    	String partita = app.getSq1() + "/" + app.getSq2();
    	
    	long random = 1 + (int)(Math.random() * 99999999); //codice schedina
    	
    	if ((Integer)ss.findId().get(0) == null)
    		schedina.setId(1);
    	else
    		schedina.setId((Integer)ss.findId().get(0)+1);
    	schedina.setCs(random);
    	schedina.setImp(10);
    	ss.save(schedina);
    	
    	if ((Integer)sss.findId().get(0) == null)
    		scommessa.setId(1);
    	else
    		scommessa.setId((Integer)sss.findId().get(0)+1);
    	scommessa.setCodice(random);
    	scommessa.setSport("Basket");
    	scommessa.setUsername("Paolo");
    	scommessa.setPartita(partita);
    	scommessa.setId_partita(app.getAvv());
    	scommessa.setSegno("X");
    	scommessa.setQuota(1.5);
    	sss.save(scommessa);
    	return "bella";
    }
    
    @GetMapping("/utente")
    @Transactional
    public String utente()
    {
    	Utente utente = new Utente();
    	
    	if ((Integer)us.findId().get(0) == null)
    		utente.setId(1);
    	else
    		utente.setId((Integer)us.findId().get(0)+1);
    	utente.setNome("Paolo");
    	utente.setCognome("Marini");
    	utente.setUser("paolino");
    	utente.setPwd("bella");
    	utente.setSaldo(20.30);
    	utente.setCdc(true);
    	utente.setMag(true);
    	utente.setDoc("64sbgg");
    	us.save(utente);
    	return "Bella";
    }
}