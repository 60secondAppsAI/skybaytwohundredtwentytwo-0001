package com.skybaytwohundredtwentytwo.dao;

import java.util.List;

import com.skybaytwohundredtwentytwo.dao.GenericDAO;
import com.skybaytwohundredtwentytwo.domain.CrewAssignment;





public interface CrewAssignmentDAO extends GenericDAO<CrewAssignment, Integer> {
  
	List<CrewAssignment> findAll();
	






}


