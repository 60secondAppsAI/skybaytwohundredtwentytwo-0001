package com.skybaytwohundredtwentytwo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.skybaytwohundredtwentytwo.domain.CrewMember;
import com.skybaytwohundredtwentytwo.dto.CrewMemberDTO;
import com.skybaytwohundredtwentytwo.dto.CrewMemberSearchDTO;
import com.skybaytwohundredtwentytwo.dto.CrewMemberPageDTO;
import com.skybaytwohundredtwentytwo.dto.CrewMemberConvertCriteriaDTO;
import com.skybaytwohundredtwentytwo.service.GenericService;
import com.skybaytwohundredtwentytwo.dto.common.RequestDTO;
import com.skybaytwohundredtwentytwo.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface CrewMemberService extends GenericService<CrewMember, Integer> {

	List<CrewMember> findAll();

	ResultDTO addCrewMember(CrewMemberDTO crewMemberDTO, RequestDTO requestDTO);

	ResultDTO updateCrewMember(CrewMemberDTO crewMemberDTO, RequestDTO requestDTO);

    Page<CrewMember> getAllCrewMembers(Pageable pageable);

    Page<CrewMember> getAllCrewMembers(Specification<CrewMember> spec, Pageable pageable);

	ResponseEntity<CrewMemberPageDTO> getCrewMembers(CrewMemberSearchDTO crewMemberSearchDTO);
	
	List<CrewMemberDTO> convertCrewMembersToCrewMemberDTOs(List<CrewMember> crewMembers, CrewMemberConvertCriteriaDTO convertCriteria);

	CrewMemberDTO getCrewMemberDTOById(Integer crewMemberId);







}





