package com.projectz.back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectz.back.model.Papiro;
import com.projectz.back.service.PapiroService;

@RestController
@RequestMapping("/projectz")
public class PapiroRestController {

	@Autowired
	PapiroService papiroService;
	
	@GetMapping("/papiro/{id}")
	public Papiro findPapiro(@PathVariable Integer id) {
		return papiroService.findPapiro(id);
	}
}
