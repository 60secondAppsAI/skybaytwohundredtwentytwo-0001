package com.skybaytwohundredtwentytwo.dao;

import java.util.List;

import com.skybaytwohundredtwentytwo.dao.GenericDAO;
import com.skybaytwohundredtwentytwo.domain.Ticket;





public interface TicketDAO extends GenericDAO<Ticket, Integer> {
  
	List<Ticket> findAll();
	






}


