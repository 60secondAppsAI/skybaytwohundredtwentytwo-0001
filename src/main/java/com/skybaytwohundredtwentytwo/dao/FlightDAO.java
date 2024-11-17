package com.skybaytwohundredtwentytwo.dao;

import java.util.List;

import com.skybaytwohundredtwentytwo.dao.GenericDAO;
import com.skybaytwohundredtwentytwo.domain.Flight;





public interface FlightDAO extends GenericDAO<Flight, Integer> {
  
	List<Flight> findAll();
	






}


