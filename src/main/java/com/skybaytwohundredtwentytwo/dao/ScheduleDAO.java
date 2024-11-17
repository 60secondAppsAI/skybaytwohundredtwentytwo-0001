package com.skybaytwohundredtwentytwo.dao;

import java.util.List;

import com.skybaytwohundredtwentytwo.dao.GenericDAO;
import com.skybaytwohundredtwentytwo.domain.Schedule;





public interface ScheduleDAO extends GenericDAO<Schedule, Integer> {
  
	List<Schedule> findAll();
	






}


