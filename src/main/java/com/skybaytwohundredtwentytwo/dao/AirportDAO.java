package com.skybaytwohundredtwentytwo.dao;

import java.util.List;

import com.skybaytwohundredtwentytwo.dao.GenericDAO;
import com.skybaytwohundredtwentytwo.domain.Airport;





public interface AirportDAO extends GenericDAO<Airport, Integer> {
  
	List<Airport> findAll();
	






}


