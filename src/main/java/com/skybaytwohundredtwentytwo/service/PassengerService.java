package com.skybaytwohundredtwentytwo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.skybaytwohundredtwentytwo.domain.Passenger;
import com.skybaytwohundredtwentytwo.dto.PassengerDTO;
import com.skybaytwohundredtwentytwo.dto.PassengerSearchDTO;
import com.skybaytwohundredtwentytwo.dto.PassengerPageDTO;
import com.skybaytwohundredtwentytwo.dto.PassengerConvertCriteriaDTO;
import com.skybaytwohundredtwentytwo.service.GenericService;
import com.skybaytwohundredtwentytwo.dto.common.RequestDTO;
import com.skybaytwohundredtwentytwo.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface PassengerService extends GenericService<Passenger, Integer> {

	List<Passenger> findAll();

	ResultDTO addPassenger(PassengerDTO passengerDTO, RequestDTO requestDTO);

	ResultDTO updatePassenger(PassengerDTO passengerDTO, RequestDTO requestDTO);

    Page<Passenger> getAllPassengers(Pageable pageable);

    Page<Passenger> getAllPassengers(Specification<Passenger> spec, Pageable pageable);

	ResponseEntity<PassengerPageDTO> getPassengers(PassengerSearchDTO passengerSearchDTO);
	
	List<PassengerDTO> convertPassengersToPassengerDTOs(List<Passenger> passengers, PassengerConvertCriteriaDTO convertCriteria);

	PassengerDTO getPassengerDTOById(Integer passengerId);







}





