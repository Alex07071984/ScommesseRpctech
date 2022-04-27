package com.ProgettoScommesse.ScommesseRpctech.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Utente_service extends JpaRepository <Utente,Integer>
{
	@Query("select max(id) from Utente")
	abstract
	List findId();
}