package com.tawdi7atnet.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tawdi7atnet.dao.SchoolRepository;
import com.tawdi7atnet.entity.School;


@Service
public class SchoolServiceImpl implements ISchoolService {
	
	@Autowired
	private SchoolRepository schoolRepository;
	
	@Override
	public School addSchool(School school) {
		// TODO Auto-generated method stub
		return schoolRepository.save(school);
	}

}
