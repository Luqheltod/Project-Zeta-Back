package com.projectz.back.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectz.back.mapper.GameMapper;
import com.projectz.back.model.Stage;
import com.projectz.back.service.GameService;

@Service
public class GameServiceImp implements GameService{

	@Autowired
	GameMapper gameMapper;
	
	@Override
	public Stage getStageInfoById(Long idStage) {

		return this.gameMapper.getStageInfoById(idStage);
	}

	
}
