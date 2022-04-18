package com.projectz.back.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class Options {
	
	private Long idOptions;
	
	private Long idStage;
	
	private String textOption;
	
	private Long lifedrain;
	
	private Long energydrain;
		
	private Boolean instadeath;
	
	private Long toStage;
	
	public Options() {
		
		
	}

	public Options(Long idOptions, Long idStage, String textOption, Long lifedrain, Long energydrain,
			Boolean instadeath) {
		super();
		this.idOptions = idOptions;
		this.idStage = idStage;
		this.textOption = textOption;
		this.lifedrain = lifedrain;
		this.energydrain = energydrain;
		this.instadeath = instadeath;
	}

	public Long getIdOptions() {
		return idOptions;
	}

	public void setIdOptions(Long idOptions) {
		this.idOptions = idOptions;
	}

	public Long getIdStage() {
		return idStage;
	}

	public void setIdStage(Long idStage) {
		this.idStage = idStage;
	}

	public String getTextOption() {
		return textOption;
	}

	public void setTextOption(String textOption) {
		this.textOption = textOption;
	}

	public Long getLifedrain() {
		return lifedrain;
	}

	public void setLifedrain(Long lifedrain) {
		this.lifedrain = lifedrain;
	}

	public Long getEnergydrain() {
		return energydrain;
	}

	public void setEnergydrain(Long energydrain) {
		this.energydrain = energydrain;
	}

	public Boolean getInstadeath() {
		return instadeath;
	}

	public void setInstadeath(Boolean instadeath) {
		this.instadeath = instadeath;
	}

	public Long getToStage() {
		return toStage;
	}

	public void setToStage(Long toStage) {
		this.toStage = toStage;
	}

	

	
	
}
