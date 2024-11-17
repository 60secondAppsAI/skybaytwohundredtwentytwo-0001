package com.skybaytwohundredtwentytwo.dao;

import java.util.List;

import com.skybaytwohundredtwentytwo.dao.GenericDAO;
import com.skybaytwohundredtwentytwo.domain.Booking;





public interface BookingDAO extends GenericDAO<Booking, Integer> {
  
	List<Booking> findAll();
	






}


