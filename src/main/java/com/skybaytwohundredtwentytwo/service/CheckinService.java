package com.skybaytwohundredtwentytwo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.skybaytwohundredtwentytwo.domain.Checkin;
import com.skybaytwohundredtwentytwo.dto.CheckinDTO;
import com.skybaytwohundredtwentytwo.dto.CheckinSearchDTO;
import com.skybaytwohundredtwentytwo.dto.CheckinPageDTO;
import com.skybaytwohundredtwentytwo.dto.CheckinConvertCriteriaDTO;
import com.skybaytwohundredtwentytwo.service.GenericService;
import com.skybaytwohundredtwentytwo.dto.common.RequestDTO;
import com.skybaytwohundredtwentytwo.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface CheckinService extends GenericService<Checkin, Integer> {

	List<Checkin> findAll();

	ResultDTO addCheckin(CheckinDTO checkinDTO, RequestDTO requestDTO);

	ResultDTO updateCheckin(CheckinDTO checkinDTO, RequestDTO requestDTO);

    Page<Checkin> getAllCheckins(Pageable pageable);

    Page<Checkin> getAllCheckins(Specification<Checkin> spec, Pageable pageable);

	ResponseEntity<CheckinPageDTO> getCheckins(CheckinSearchDTO checkinSearchDTO);
	
	List<CheckinDTO> convertCheckinsToCheckinDTOs(List<Checkin> checkins, CheckinConvertCriteriaDTO convertCriteria);

	CheckinDTO getCheckinDTOById(Integer checkinId);







}





