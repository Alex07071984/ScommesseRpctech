package com.ProgettoScommesse.ScommesseRpctech.controller;

import java.util.ArrayList;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ProgettoScommesse.ScommesseRpctech.model.Volley_service;
import com.ProgettoScommesse.ScommesseRpctech.model.Calcio_service;
import com.ProgettoScommesse.ScommesseRpctech.model.Schedina;
import com.ProgettoScommesse.ScommesseRpctech.model.Basket_service;
import com.ProgettoScommesse.ScommesseRpctech.model.Calcio;
import com.ProgettoScommesse.ScommesseRpctech.model.Utente_service;
import com.ProgettoScommesse.ScommesseRpctech.model.Schedina_service;
import com.ProgettoScommesse.ScommesseRpctech.model.Scommessa;
import com.ProgettoScommesse.ScommesseRpctech.model.Scommessa_service;

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
    @GetMapping("/all")
    public ArrayList getAll()
    { 
    	ArrayList calcio = new ArrayList();
    	for (int c=0; c<cs.findAll().size(); c++)
    	{
    		Calcio app = (Calcio) cs.findAll().get(c);
    		calcio.add(app.getAvv());
    	}
        return calcio;
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
}