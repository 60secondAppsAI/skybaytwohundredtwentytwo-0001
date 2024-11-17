package com.skybaytwohundredtwentytwo.dao;

import java.util.List;

import com.skybaytwohundredtwentytwo.dao.GenericDAO;
import com.skybaytwohundredtwentytwo.domain.CrewMember;





public interface CrewMemberDAO extends GenericDAO<CrewMember, Integer> {
  
	List<CrewMember> findAll();
	






}


