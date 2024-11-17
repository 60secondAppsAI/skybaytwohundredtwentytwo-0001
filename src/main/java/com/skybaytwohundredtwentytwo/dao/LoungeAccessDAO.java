package com.skybaytwohundredtwentytwo.dao;

import java.util.List;

import com.skybaytwohundredtwentytwo.dao.GenericDAO;
import com.skybaytwohundredtwentytwo.domain.LoungeAccess;





public interface LoungeAccessDAO extends GenericDAO<LoungeAccess, Integer> {
  
	List<LoungeAccess> findAll();
	






}


