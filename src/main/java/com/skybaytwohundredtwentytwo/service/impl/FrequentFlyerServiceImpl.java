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
import com.skybaytwohundredtwentytwo.dao.FrequentFlyerDAO;
import com.skybaytwohundredtwentytwo.domain.FrequentFlyer;
import com.skybaytwohundredtwentytwo.dto.FrequentFlyerDTO;
import com.skybaytwohundredtwentytwo.dto.FrequentFlyerSearchDTO;
import com.skybaytwohundredtwentytwo.dto.FrequentFlyerPageDTO;
import com.skybaytwohundredtwentytwo.dto.FrequentFlyerConvertCriteriaDTO;
import com.skybaytwohundredtwentytwo.dto.common.RequestDTO;
import com.skybaytwohundredtwentytwo.dto.common.ResultDTO;
import com.skybaytwohundredtwentytwo.service.FrequentFlyerService;
import com.skybaytwohundredtwentytwo.util.ControllerUtils;





@Service
public class FrequentFlyerServiceImpl extends GenericServiceImpl<FrequentFlyer, Integer> implements FrequentFlyerService {

    private final static Logger logger = LoggerFactory.getLogger(FrequentFlyerServiceImpl.class);

	@Autowired
	FrequentFlyerDAO frequentFlyerDao;

	


	@Override
	public GenericDAO<FrequentFlyer, Integer> getDAO() {
		return (GenericDAO<FrequentFlyer, Integer>) frequentFlyerDao;
	}
	
	public List<FrequentFlyer> findAll () {
		List<FrequentFlyer> frequentFlyers = frequentFlyerDao.findAll();
		
		return frequentFlyers;	
		
	}

	public ResultDTO addFrequentFlyer(FrequentFlyerDTO frequentFlyerDTO, RequestDTO requestDTO) {

		FrequentFlyer frequentFlyer = new FrequentFlyer();

		frequentFlyer.setFrequentFlyerId(frequentFlyerDTO.getFrequentFlyerId());


		frequentFlyer.setMembershipNumber(frequentFlyerDTO.getMembershipNumber());


		frequentFlyer.setTier(frequentFlyerDTO.getTier());


		LocalDate localDate = LocalDate.now();
		ZoneId defaultZoneId = ZoneId.systemDefault();
		Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());

		frequentFlyer = frequentFlyerDao.save(frequentFlyer);
		
		ResultDTO result = new ResultDTO();
		return result;
	}
	
	public Page<FrequentFlyer> getAllFrequentFlyers(Pageable pageable) {
		return frequentFlyerDao.findAll(pageable);
	}

	public Page<FrequentFlyer> getAllFrequentFlyers(Specification<FrequentFlyer> spec, Pageable pageable) {
		return frequentFlyerDao.findAll(spec, pageable);
	}

	public ResponseEntity<FrequentFlyerPageDTO> getFrequentFlyers(FrequentFlyerSearchDTO frequentFlyerSearchDTO) {
	
			Integer frequentFlyerId = frequentFlyerSearchDTO.getFrequentFlyerId(); 
 			String membershipNumber = frequentFlyerSearchDTO.getMembershipNumber(); 
 			String tier = frequentFlyerSearchDTO.getTier(); 
 			String sortBy = frequentFlyerSearchDTO.getSortBy();
			String sortOrder = frequentFlyerSearchDTO.getSortOrder();
			String searchQuery = frequentFlyerSearchDTO.getSearchQuery();
			Integer page = frequentFlyerSearchDTO.getPage();
			Integer size = frequentFlyerSearchDTO.getSize();

	        Specification<FrequentFlyer> spec = Specification.where(null);

			spec = ControllerUtils.andIfNecessary(spec, frequentFlyerId, "frequentFlyerId"); 
			
			spec = ControllerUtils.andIfNecessary(spec, membershipNumber, "membershipNumber"); 
			
			spec = ControllerUtils.andIfNecessary(spec, tier, "tier"); 
			

		if (searchQuery != null && !searchQuery.isEmpty()) {
			spec = spec.and((root, query, cb) -> cb.or(

             cb.like(cb.lower(root.get("membershipNumber")), "%" + searchQuery.toLowerCase() + "%") 
             , cb.like(cb.lower(root.get("tier")), "%" + searchQuery.toLowerCase() + "%") 
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

		Page<FrequentFlyer> frequentFlyers = this.getAllFrequentFlyers(spec, pageable);
		
		//System.out.println(String.valueOf(frequentFlyers.getTotalElements()) + " total ${classNamelPlural}, viewing page X of " + String.valueOf(frequentFlyers.getTotalPages()));
		
		List<FrequentFlyer> frequentFlyersList = frequentFlyers.getContent();
		
		FrequentFlyerConvertCriteriaDTO convertCriteria = new FrequentFlyerConvertCriteriaDTO();
		List<FrequentFlyerDTO> frequentFlyerDTOs = this.convertFrequentFlyersToFrequentFlyerDTOs(frequentFlyersList,convertCriteria);
		
		FrequentFlyerPageDTO frequentFlyerPageDTO = new FrequentFlyerPageDTO();
		frequentFlyerPageDTO.setFrequentFlyers(frequentFlyerDTOs);
		frequentFlyerPageDTO.setTotalElements(frequentFlyers.getTotalElements());
		return ResponseEntity.ok(frequentFlyerPageDTO);
	}

	public List<FrequentFlyerDTO> convertFrequentFlyersToFrequentFlyerDTOs(List<FrequentFlyer> frequentFlyers, FrequentFlyerConvertCriteriaDTO convertCriteria) {
		
		List<FrequentFlyerDTO> frequentFlyerDTOs = new ArrayList<FrequentFlyerDTO>();
		
		for (FrequentFlyer frequentFlyer : frequentFlyers) {
			frequentFlyerDTOs.add(convertFrequentFlyerToFrequentFlyerDTO(frequentFlyer,convertCriteria));
		}
		
		return frequentFlyerDTOs;

	}
	
	public FrequentFlyerDTO convertFrequentFlyerToFrequentFlyerDTO(FrequentFlyer frequentFlyer, FrequentFlyerConvertCriteriaDTO convertCriteria) {
		
		FrequentFlyerDTO frequentFlyerDTO = new FrequentFlyerDTO();
		
		frequentFlyerDTO.setFrequentFlyerId(frequentFlyer.getFrequentFlyerId());

	
		frequentFlyerDTO.setMembershipNumber(frequentFlyer.getMembershipNumber());

	
		frequentFlyerDTO.setTier(frequentFlyer.getTier());

	

		
		return frequentFlyerDTO;
	}

	public ResultDTO updateFrequentFlyer(FrequentFlyerDTO frequentFlyerDTO, RequestDTO requestDTO) {
		
		FrequentFlyer frequentFlyer = frequentFlyerDao.getById(frequentFlyerDTO.getFrequentFlyerId());

		frequentFlyer.setFrequentFlyerId(ControllerUtils.setValue(frequentFlyer.getFrequentFlyerId(), frequentFlyerDTO.getFrequentFlyerId()));

		frequentFlyer.setMembershipNumber(ControllerUtils.setValue(frequentFlyer.getMembershipNumber(), frequentFlyerDTO.getMembershipNumber()));

		frequentFlyer.setTier(ControllerUtils.setValue(frequentFlyer.getTier(), frequentFlyerDTO.getTier()));



        frequentFlyer = frequentFlyerDao.save(frequentFlyer);
		
		ResultDTO result = new ResultDTO();
		return result;
	}

	public FrequentFlyerDTO getFrequentFlyerDTOById(Integer frequentFlyerId) {
	
		FrequentFlyer frequentFlyer = frequentFlyerDao.getById(frequentFlyerId);
			
		
		FrequentFlyerConvertCriteriaDTO convertCriteria = new FrequentFlyerConvertCriteriaDTO();
		return(this.convertFrequentFlyerToFrequentFlyerDTO(frequentFlyer,convertCriteria));
	}







}
