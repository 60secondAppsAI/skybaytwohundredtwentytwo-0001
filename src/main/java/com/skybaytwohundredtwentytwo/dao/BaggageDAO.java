package com.skybaytwohundredtwentytwo.dao;

import java.util.List;

import com.skybaytwohundredtwentytwo.dao.GenericDAO;
import com.skybaytwohundredtwentytwo.domain.Baggage;





public interface BaggageDAO extends GenericDAO<Baggage, Integer> {
  
	List<Baggage> findAll();
	






}


