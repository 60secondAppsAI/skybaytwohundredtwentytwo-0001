package com.skybaytwohundredtwentytwo.dao;

import java.util.List;

import com.skybaytwohundredtwentytwo.dao.GenericDAO;
import com.skybaytwohundredtwentytwo.domain.CustomerSupport;





public interface CustomerSupportDAO extends GenericDAO<CustomerSupport, Integer> {
  
	List<CustomerSupport> findAll();
	






}


