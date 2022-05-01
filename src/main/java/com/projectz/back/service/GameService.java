package com.projectz.back.service;

import com.projectz.back.model.InstadeathDto;
import com.projectz.back.model.Stage;

public interface GameService {

	Stage getStageInfoById(Long idStage);
	
	InstadeathDto getInstadeathInfo(Long idOption);

	
}
