package com.projectz.back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.projectz.back.model.Stage;
import com.projectz.back.service.GameService;

@RestController
@RequestMapping("/projectz")
public class GameController {

	 @Autowired
	 GameService gameService;
	
	@GetMapping("/stage/{idStage}")
	public ResponseEntity<Stage> getStageInfo(@PathVariable Long idStage) {

		Stage jiji = this.gameService.getStageInfoById(idStage);
		try {
		return new ResponseEntity<Stage>(this.gameService.getStageInfoById(idStage), HttpStatus.OK);
		} catch (Exception e) {
			
			return new ResponseEntity<Stage>(HttpStatus.INTERNAL_SERVER_ERROR);
		} 
}
	
}
