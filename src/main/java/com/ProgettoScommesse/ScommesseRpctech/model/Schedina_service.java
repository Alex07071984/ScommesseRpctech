package com.ProgettoScommesse.ScommesseRpctech.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Schedina_service extends JpaRepository <Schedina, Integer>
{
	@Query("select max(id) from Schedina")
	abstract
	List findId();
}