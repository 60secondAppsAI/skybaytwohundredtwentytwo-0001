package com.skybaytwohundredtwentytwo.dao;

import java.util.List;

import com.skybaytwohundredtwentytwo.dao.GenericDAO;
import com.skybaytwohundredtwentytwo.domain.Passenger;





public interface PassengerDAO extends GenericDAO<Passenger, Integer> {
  
	List<Passenger> findAll();
	






}


