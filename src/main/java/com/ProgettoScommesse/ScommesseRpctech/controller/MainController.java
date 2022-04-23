package com.ProgettoScommesse.ScommesseRpctech.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ProgettoScommesse.ScommesseRpctech.model.Calcio_service;

@RestController
public class MainController
{
    @Autowired
    Calcio_service cs;

    @ResponseBody
    @GetMapping("/calcio")
    public ArrayList getAll()
    {
        ArrayList ris = new ArrayList();
        ris = (ArrayList) cs.findAll();
        return ris;
    }
}