package com.skybaytwohundredtwentytwo.dao;

import java.util.List;

import com.skybaytwohundredtwentytwo.dao.GenericDAO;
import com.skybaytwohundredtwentytwo.domain.Checkin;





public interface CheckinDAO extends GenericDAO<Checkin, Integer> {
  
	List<Checkin> findAll();
	






}


