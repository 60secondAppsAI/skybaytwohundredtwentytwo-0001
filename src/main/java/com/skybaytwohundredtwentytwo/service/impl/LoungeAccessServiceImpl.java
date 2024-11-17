package com.skybaytwohundredtwentytwo.service.impl;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;



import com.skybaytwohundredtwentytwo.dao.GenericDAO;
import com.skybaytwohundredtwentytwo.service.GenericService;
import com.skybaytwohundredtwentytwo.service.impl.GenericServiceImpl;
import com.skybaytwohundredtwentytwo.dao.LoungeAccessDAO;
import com.skybaytwohundredtwentytwo.domain.LoungeAccess;
import com.skybaytwohundredtwentytwo.dto.LoungeAccessDTO;
import com.skybaytwohundredtwentytwo.dto.LoungeAccessSearchDTO;
import com.skybaytwohundredtwentytwo.dto.LoungeAccessPageDTO;
import com.skybaytwohundredtwentytwo.dto.LoungeAccessConvertCriteriaDTO;
import com.skybaytwohundredtwentytwo.dto.common.RequestDTO;
import com.skybaytwohundredtwentytwo.dto.common.ResultDTO;
import com.skybaytwohundredtwentytwo.service.LoungeAccessService;
import com.skybaytwohundredtwentytwo.util.ControllerUtils;





@Service
public class LoungeAccessServiceImpl extends GenericServiceImpl<LoungeAccess, Integer> implements LoungeAccessService {

    private final static Logger logger = LoggerFactory.getLogger(LoungeAccessServiceImpl.class);

	@Autowired
	LoungeAccessDAO loungeAccessDao;

	


	@Override
	public GenericDAO<LoungeAccess, Integer> getDAO() {
		return (GenericDAO<LoungeAccess, Integer>) loungeAccessDao;
	}
	
	public List<LoungeAccess> findAll () {
		List<LoungeAccess> loungeAccesss = loungeAccessDao.findAll();
		
		return loungeAccesss;	
		
	}

	public ResultDTO addLoungeAccess(LoungeAccessDTO loungeAccessDTO, RequestDTO requestDTO) {

		LoungeAccess loungeAccess = new LoungeAccess();

		loungeAccess.setLoungeAccessId(loungeAccessDTO.getLoungeAccessId());


		LocalDate localDate = LocalDate.now();
		ZoneId defaultZoneId = ZoneId.systemDefault();
		Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());

		loungeAccess = loungeAccessDao.save(loungeAccess);
		
		ResultDTO result = new ResultDTO();
		return result;
	}
	
	public Page<LoungeAccess> getAllLoungeAccesss(Pageable pageable) {
		return loungeAccessDao.findAll(pageable);
	}

	public Page<LoungeAccess> getAllLoungeAccesss(Specification<LoungeAccess> spec, Pageable pageable) {
		return loungeAccessDao.findAll(spec, pageable);
	}

	public ResponseEntity<LoungeAccessPageDTO> getLoungeAccesss(LoungeAccessSearchDTO loungeAccessSearchDTO) {
	
			Integer loungeAccessId = loungeAccessSearchDTO.getLoungeAccessId(); 
 			String sortBy = loungeAccessSearchDTO.getSortBy();
			String sortOrder = loungeAccessSearchDTO.getSortOrder();
			String searchQuery = loungeAccessSearchDTO.getSearchQuery();
			Integer page = loungeAccessSearchDTO.getPage();
			Integer size = loungeAccessSearchDTO.getSize();

	        Specification<LoungeAccess> spec = Specification.where(null);

			spec = ControllerUtils.andIfNecessary(spec, loungeAccessId, "loungeAccessId"); 
			

		if (searchQuery != null && !searchQuery.isEmpty()) {
			spec = spec.and((root, query, cb) -> cb.or(

		));}
		
		Sort sort = Sort.unsorted();
		if (sortBy != null && !sortBy.isEmpty() && sortOrder != null && !sortOrder.isEmpty()) {
			if (sortOrder.equalsIgnoreCase("asc")) {
				sort = Sort.by(sortBy).ascending();
			} else if (sortOrder.equalsIgnoreCase("desc")) {
				sort = Sort.by(sortBy).descending();
			}
		}
		Pageable pageable = PageRequest.of(page, size, sort);

		Page<LoungeAccess> loungeAccesss = this.getAllLoungeAccesss(spec, pageable);
		
		//System.out.println(String.valueOf(loungeAccesss.getTotalElements()) + " total ${classNamelPlural}, viewing page X of " + String.valueOf(loungeAccesss.getTotalPages()));
		
		List<LoungeAccess> loungeAccesssList = loungeAccesss.getContent();
		
		LoungeAccessConvertCriteriaDTO convertCriteria = new LoungeAccessConvertCriteriaDTO();
		List<LoungeAccessDTO> loungeAccessDTOs = this.convertLoungeAccesssToLoungeAccessDTOs(loungeAccesssList,convertCriteria);
		
		LoungeAccessPageDTO loungeAccessPageDTO = new LoungeAccessPageDTO();
		loungeAccessPageDTO.setLoungeAccesss(loungeAccessDTOs);
		loungeAccessPageDTO.setTotalElements(loungeAccesss.getTotalElements());
		return ResponseEntity.ok(loungeAccessPageDTO);
	}

	public List<LoungeAccessDTO> convertLoungeAccesssToLoungeAccessDTOs(List<LoungeAccess> loungeAccesss, LoungeAccessConvertCriteriaDTO convertCriteria) {
		
		List<LoungeAccessDTO> loungeAccessDTOs = new ArrayList<LoungeAccessDTO>();
		
		for (LoungeAccess loungeAccess : loungeAccesss) {
			loungeAccessDTOs.add(convertLoungeAccessToLoungeAccessDTO(loungeAccess,convertCriteria));
		}
		
		return loungeAccessDTOs;

	}
	
	public LoungeAccessDTO convertLoungeAccessToLoungeAccessDTO(LoungeAccess loungeAccess, LoungeAccessConvertCriteriaDTO convertCriteria) {
		
		LoungeAccessDTO loungeAccessDTO = new LoungeAccessDTO();
		
		loungeAccessDTO.setLoungeAccessId(loungeAccess.getLoungeAccessId());

	

		
		return loungeAccessDTO;
	}

	public ResultDTO updateLoungeAccess(LoungeAccessDTO loungeAccessDTO, RequestDTO requestDTO) {
		
		LoungeAccess loungeAccess = loungeAccessDao.getById(loungeAccessDTO.getLoungeAccessId());

		loungeAccess.setLoungeAccessId(ControllerUtils.setValue(loungeAccess.getLoungeAccessId(), loungeAccessDTO.getLoungeAccessId()));



        loungeAccess = loungeAccessDao.save(loungeAccess);
		
		ResultDTO result = new ResultDTO();
		return result;
	}

	public LoungeAccessDTO getLoungeAccessDTOById(Integer loungeAccessId) {
	
		LoungeAccess loungeAccess = loungeAccessDao.getById(loungeAccessId);
			
		
		LoungeAccessConvertCriteriaDTO convertCriteria = new LoungeAccessConvertCriteriaDTO();
		return(this.convertLoungeAccessToLoungeAccessDTO(loungeAccess,convertCriteria));
	}







}
