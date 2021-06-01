package com.projectz.back.service.imp;

import org.springframework.beans.factory.annotation.Autowired;

import com.projectz.back.mapper.PapiroMapper;
import com.projectz.back.model.Papiro;
import com.projectz.back.service.PapiroService;

public class PapiroServiceImp implements PapiroService{

	@Autowired
	PapiroMapper papiroMapper;

	@Override
	public Papiro findPapiro(Integer id) {
		return papiroMapper.findPapiro(id);
	}
	
}
