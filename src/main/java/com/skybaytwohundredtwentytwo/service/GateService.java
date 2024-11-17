package com.skybaytwohundredtwentytwo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.skybaytwohundredtwentytwo.domain.Gate;
import com.skybaytwohundredtwentytwo.dto.GateDTO;
import com.skybaytwohundredtwentytwo.dto.GateSearchDTO;
import com.skybaytwohundredtwentytwo.dto.GatePageDTO;
import com.skybaytwohundredtwentytwo.dto.GateConvertCriteriaDTO;
import com.skybaytwohundredtwentytwo.service.GenericService;
import com.skybaytwohundredtwentytwo.dto.common.RequestDTO;
import com.skybaytwohundredtwentytwo.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface GateService extends GenericService<Gate, Integer> {

	List<Gate> findAll();

	ResultDTO addGate(GateDTO gateDTO, RequestDTO requestDTO);

	ResultDTO updateGate(GateDTO gateDTO, RequestDTO requestDTO);

    Page<Gate> getAllGates(Pageable pageable);

    Page<Gate> getAllGates(Specification<Gate> spec, Pageable pageable);

	ResponseEntity<GatePageDTO> getGates(GateSearchDTO gateSearchDTO);
	
	List<GateDTO> convertGatesToGateDTOs(List<Gate> gates, GateConvertCriteriaDTO convertCriteria);

	GateDTO getGateDTOById(Integer gateId);







}





