package com.skybaytwohundredtwentytwo.dao;

import java.util.List;

import com.skybaytwohundredtwentytwo.dao.GenericDAO;
import com.skybaytwohundredtwentytwo.domain.BoardingPass;





public interface BoardingPassDAO extends GenericDAO<BoardingPass, Integer> {
  
	List<BoardingPass> findAll();
	






}


