package com.skybaytwohundredtwentytwo.dao;

import java.util.List;

import com.skybaytwohundredtwentytwo.dao.GenericDAO;
import com.skybaytwohundredtwentytwo.domain.Lounge;





public interface LoungeDAO extends GenericDAO<Lounge, Integer> {
  
	List<Lounge> findAll();
	






}


