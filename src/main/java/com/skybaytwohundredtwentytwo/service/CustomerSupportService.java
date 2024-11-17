package com.skybaytwohundredtwentytwo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.skybaytwohundredtwentytwo.domain.CustomerSupport;
import com.skybaytwohundredtwentytwo.dto.CustomerSupportDTO;
import com.skybaytwohundredtwentytwo.dto.CustomerSupportSearchDTO;
import com.skybaytwohundredtwentytwo.dto.CustomerSupportPageDTO;
import com.skybaytwohundredtwentytwo.dto.CustomerSupportConvertCriteriaDTO;
import com.skybaytwohundredtwentytwo.service.GenericService;
import com.skybaytwohundredtwentytwo.dto.common.RequestDTO;
import com.skybaytwohundredtwentytwo.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface CustomerSupportService extends GenericService<CustomerSupport, Integer> {

	List<CustomerSupport> findAll();

	ResultDTO addCustomerSupport(CustomerSupportDTO customerSupportDTO, RequestDTO requestDTO);

	ResultDTO updateCustomerSupport(CustomerSupportDTO customerSupportDTO, RequestDTO requestDTO);

    Page<CustomerSupport> getAllCustomerSupports(Pageable pageable);

    Page<CustomerSupport> getAllCustomerSupports(Specification<CustomerSupport> spec, Pageable pageable);

	ResponseEntity<CustomerSupportPageDTO> getCustomerSupports(CustomerSupportSearchDTO customerSupportSearchDTO);
	
	List<CustomerSupportDTO> convertCustomerSupportsToCustomerSupportDTOs(List<CustomerSupport> customerSupports, CustomerSupportConvertCriteriaDTO convertCriteria);

	CustomerSupportDTO getCustomerSupportDTOById(Integer customerSupportId);







}





