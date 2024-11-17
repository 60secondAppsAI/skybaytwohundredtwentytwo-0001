package com.skybaytwohundredtwentytwo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.skybaytwohundredtwentytwo.domain.LoungeAccess;
import com.skybaytwohundredtwentytwo.dto.LoungeAccessDTO;
import com.skybaytwohundredtwentytwo.dto.LoungeAccessSearchDTO;
import com.skybaytwohundredtwentytwo.dto.LoungeAccessPageDTO;
import com.skybaytwohundredtwentytwo.dto.LoungeAccessConvertCriteriaDTO;
import com.skybaytwohundredtwentytwo.service.GenericService;
import com.skybaytwohundredtwentytwo.dto.common.RequestDTO;
import com.skybaytwohundredtwentytwo.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface LoungeAccessService extends GenericService<LoungeAccess, Integer> {

	List<LoungeAccess> findAll();

	ResultDTO addLoungeAccess(LoungeAccessDTO loungeAccessDTO, RequestDTO requestDTO);

	ResultDTO updateLoungeAccess(LoungeAccessDTO loungeAccessDTO, RequestDTO requestDTO);

    Page<LoungeAccess> getAllLoungeAccesss(Pageable pageable);

    Page<LoungeAccess> getAllLoungeAccesss(Specification<LoungeAccess> spec, Pageable pageable);

	ResponseEntity<LoungeAccessPageDTO> getLoungeAccesss(LoungeAccessSearchDTO loungeAccessSearchDTO);
	
	List<LoungeAccessDTO> convertLoungeAccesssToLoungeAccessDTOs(List<LoungeAccess> loungeAccesss, LoungeAccessConvertCriteriaDTO convertCriteria);

	LoungeAccessDTO getLoungeAccessDTOById(Integer loungeAccessId);







}





