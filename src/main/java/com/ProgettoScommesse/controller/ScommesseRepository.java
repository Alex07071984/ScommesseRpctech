package com.ProgettoScommesse.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProgettoScommesse.model.Utente;

public interface ScommesseRepository extends JpaRepository<Utente,Long>
{

}
