package com.projectz.back.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class RestDto {

	
	private Long idRest;
	
	private String message;
	
	private Long energyDifference;
	
	private Long lifeDifference;
	
	public RestDto() {
		
	}

	public RestDto(Long idRest, String message, Long energyDifference, Long lifeDifference) {
		super();
		this.idRest = idRest;
		this.message = message;
		this.energyDifference = energyDifference;
		this.lifeDifference = lifeDifference;
	}

	public Long getIdRest() {
		return idRest;
	}

	public void setIdRest(Long idRest) {
		this.idRest = idRest;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getEnergyDifference() {
		return energyDifference;
	}

	public void setEnergyDifference(Long energyDifference) {
		this.energyDifference = energyDifference;
	}

	public Long getLifeDifference() {
		return lifeDifference;
	}

	public void setLifeDifference(Long lifeDifference) {
		this.lifeDifference = lifeDifference;
	}
	
	
}
