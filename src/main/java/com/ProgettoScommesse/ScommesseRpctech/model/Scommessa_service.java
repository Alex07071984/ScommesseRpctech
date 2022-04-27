package com.ProgettoScommesse.ScommesseRpctech.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Scommessa_service extends JpaRepository <Scommessa,Integer>
{
	@Query("from Calcio where id = 10")
	abstract
	List findAllC();
	@Query("from Basket")
	abstract
	List findAllB();
	@Query("from Volley")
	abstract
	List findAllV();
	@Query("select max(id) from Scommessa")
	abstract
	List findId();
}