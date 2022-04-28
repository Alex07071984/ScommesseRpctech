package com.ProgettoScommesse.ScommesseRpctech.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Volley_service extends JpaRepository <Volley,Long>
{
	@Query("from Volley")
	abstract
	List findAll();
}