package com.skybaytwohundredtwentytwo.service;

import com.skybaytwohundredtwentytwo.dao.GenericDAO;

public interface GenericService<T, ID> {

    abstract GenericDAO<T, ID> getDAO();

    T getById(Integer id) ;

}