package com.skybaytwohundredtwentytwo.dao;

import java.util.List;

import com.skybaytwohundredtwentytwo.dao.GenericDAO;
import com.skybaytwohundredtwentytwo.domain.Gate;





public interface GateDAO extends GenericDAO<Gate, Integer> {
  
	List<Gate> findAll();
	






}


