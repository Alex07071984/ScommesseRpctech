package com.ProgettoScommesse.ScommesseRpctech.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public interface Basket_service extends JpaRepository <Basket, Integer>
{
	@Query("from Basket")
	abstract
	List findAll();
}