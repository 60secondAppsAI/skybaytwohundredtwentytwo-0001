package com.skybaytwohundredtwentytwo.dao;

import java.util.List;

import com.skybaytwohundredtwentytwo.dao.GenericDAO;
import com.skybaytwohundredtwentytwo.domain.Airplane;





public interface AirplaneDAO extends GenericDAO<Airplane, Integer> {
  
	List<Airplane> findAll();
	






}


