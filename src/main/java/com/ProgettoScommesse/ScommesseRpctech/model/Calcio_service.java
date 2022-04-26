package com.ProgettoScommesse.ScommesseRpctech.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Calcio_service extends JpaRepository <Calcio, Integer>
{
	@Query("from Calcio")
	abstract
	List findAll();
}