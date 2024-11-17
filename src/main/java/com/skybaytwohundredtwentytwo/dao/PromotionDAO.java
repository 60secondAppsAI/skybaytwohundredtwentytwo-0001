package com.skybaytwohundredtwentytwo.dao;

import java.util.List;

import com.skybaytwohundredtwentytwo.dao.GenericDAO;
import com.skybaytwohundredtwentytwo.domain.Promotion;





public interface PromotionDAO extends GenericDAO<Promotion, Integer> {
  
	List<Promotion> findAll();
	






}


