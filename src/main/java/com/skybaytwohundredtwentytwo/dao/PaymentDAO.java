package com.skybaytwohundredtwentytwo.dao;

import java.util.List;

import com.skybaytwohundredtwentytwo.dao.GenericDAO;
import com.skybaytwohundredtwentytwo.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}


