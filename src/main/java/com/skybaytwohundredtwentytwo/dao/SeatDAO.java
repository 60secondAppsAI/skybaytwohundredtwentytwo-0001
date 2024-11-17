package com.skybaytwohundredtwentytwo.dao;

import java.util.List;

import com.skybaytwohundredtwentytwo.dao.GenericDAO;
import com.skybaytwohundredtwentytwo.domain.Seat;





public interface SeatDAO extends GenericDAO<Seat, Integer> {
  
	List<Seat> findAll();
	






}


