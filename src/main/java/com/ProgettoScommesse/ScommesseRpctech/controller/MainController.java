package com.ProgettoScommesse.ScommesseRpctech.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ProgettoScommesse.ScommesseRpctech.model.Volley_service;
import com.ProgettoScommesse.ScommesseRpctech.model.Calcio_service;
import com.ProgettoScommesse.ScommesseRpctech.model.Basket_service;
import com.ProgettoScommesse.ScommesseRpctech.model.Calcio;
import com.ProgettoScommesse.ScommesseRpctech.model.Utente_service;
import com.ProgettoScommesse.ScommesseRpctech.model.Schedina_service;
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
    @GetMapping("/")
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
}