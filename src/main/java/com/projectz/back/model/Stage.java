package com.projectz.back.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class Stage {

	
	private Long idStage;
	
	private String text;
	
	private String mapName;
	
	private String flat;
	
	
	public Stage() {
		
	}


	public Stage(Long idStage, String text, String mapName, String flat) {
		super();
		this.idStage = idStage;
		this.text = text;
		this.mapName = mapName;
		this.flat = flat;
	}


	public Long getIdStage() {
		return idStage;
	}


	public void setIdStage(Long idStage) {
		this.idStage = idStage;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public String getMapName() {
		return mapName;
	}


	public void setMapName(String mapName) {
		this.mapName = mapName;
	}


	public String getFlat() {
		return flat;
	}


	public void setFlat(String flat) {
		this.flat = flat;
	}
	
	
}
