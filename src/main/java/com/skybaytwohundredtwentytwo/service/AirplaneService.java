package com.skybaytwohundredtwentytwo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.skybaytwohundredtwentytwo.domain.Airplane;
import com.skybaytwohundredtwentytwo.dto.AirplaneDTO;
import com.skybaytwohundredtwentytwo.dto.AirplaneSearchDTO;
import com.skybaytwohundredtwentytwo.dto.AirplanePageDTO;
import com.skybaytwohundredtwentytwo.dto.AirplaneConvertCriteriaDTO;
import com.skybaytwohundredtwentytwo.service.GenericService;
import com.skybaytwohundredtwentytwo.dto.common.RequestDTO;
import com.skybaytwohundredtwentytwo.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface AirplaneService extends GenericService<Airplane, Integer> {

	List<Airplane> findAll();

	ResultDTO addAirplane(AirplaneDTO airplaneDTO, RequestDTO requestDTO);

	ResultDTO updateAirplane(AirplaneDTO airplaneDTO, RequestDTO requestDTO);

    Page<Airplane> getAllAirplanes(Pageable pageable);

    Page<Airplane> getAllAirplanes(Specification<Airplane> spec, Pageable pageable);

	ResponseEntity<AirplanePageDTO> getAirplanes(AirplaneSearchDTO airplaneSearchDTO);
	
	List<AirplaneDTO> convertAirplanesToAirplaneDTOs(List<Airplane> airplanes, AirplaneConvertCriteriaDTO convertCriteria);

	AirplaneDTO getAirplaneDTOById(Integer airplaneId);







}





