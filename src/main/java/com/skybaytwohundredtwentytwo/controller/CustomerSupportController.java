package com.skybaytwohundredtwentytwo.controller;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;
import java.util.ArrayList;


import com.skybaytwohundredtwentytwo.util.Util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.sql.Timestamp;
import java.util.Date;

import com.skybaytwohundredtwentytwo.domain.CustomerSupport;
import com.skybaytwohundredtwentytwo.dto.CustomerSupportDTO;
import com.skybaytwohundredtwentytwo.dto.CustomerSupportSearchDTO;
import com.skybaytwohundredtwentytwo.dto.CustomerSupportPageDTO;
import com.skybaytwohundredtwentytwo.service.CustomerSupportService;
import com.skybaytwohundredtwentytwo.dto.common.RequestDTO;
import com.skybaytwohundredtwentytwo.dto.common.ResultDTO;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;




@CrossOrigin(origins = "*")
@RequestMapping("/customerSupport")
@RestController
public class CustomerSupportController {

	private final static Logger logger = LoggerFactory.getLogger(CustomerSupportController.class);

	@Autowired
	CustomerSupportService customerSupportService;



	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<CustomerSupport> getAll() {

		List<CustomerSupport> customerSupports = customerSupportService.findAll();
		
		return customerSupports;	
	}

	@GetMapping(value = "/{customerSupportId}")
	@ResponseBody
	public CustomerSupportDTO getCustomerSupport(@PathVariable Integer customerSupportId) {
		
		return (customerSupportService.getCustomerSupportDTOById(customerSupportId));
	}

 	@RequestMapping(value = "/addCustomerSupport", method = RequestMethod.POST)
	public ResponseEntity<?> addCustomerSupport(@RequestBody CustomerSupportDTO customerSupportDTO, HttpServletRequest request) {

		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = customerSupportService.addCustomerSupport(customerSupportDTO, requestDTO);
		
		return result.asResponseEntity();
	}

	@GetMapping("/customerSupports")
	public ResponseEntity<CustomerSupportPageDTO> getCustomerSupports(CustomerSupportSearchDTO customerSupportSearchDTO) {
 
		return customerSupportService.getCustomerSupports(customerSupportSearchDTO);
	}	

	@RequestMapping(value = "/updateCustomerSupport", method = RequestMethod.POST)
	public ResponseEntity<?> updateCustomerSupport(@RequestBody CustomerSupportDTO customerSupportDTO, HttpServletRequest request) {
		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = customerSupportService.updateCustomerSupport(customerSupportDTO, requestDTO);
		
//		if (result.isSuccessful()) {
//		}

		return result.asResponseEntity();
	}



}
