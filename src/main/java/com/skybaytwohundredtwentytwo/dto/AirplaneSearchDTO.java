package com.skybaytwohundredtwentytwo.dto;

import java.sql.Timestamp;
import java.time.Year;
import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AirplaneSearchDTO {

	private Integer page = 0;
	private Integer size;
	private String sortBy;
	private String sortOrder;
	private String searchQuery;

	private Integer airplaneId;
	
	private String manufacturer;
	
	private String model;
	
	private int capacity;
	
}
