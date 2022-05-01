package com.projectz.back.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class InstadeathDto {
	
	private Long idInstadeath;
	
	private String message;
	
	private Long idOptions;
	
	public InstadeathDto() {
		
	}

	public InstadeathDto(Long idInstadeath, String message, Long idOptions) {
		super();
		this.idInstadeath = idInstadeath;
		this.message = message;
		this.idOptions = idOptions;
	}

	public Long getIdInstadeath() {
		return idInstadeath;
	}

	public void setIdInstadeath(Long idInstadeath) {
		this.idInstadeath = idInstadeath;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getIdOptions() {
		return idOptions;
	}

	public void setIdOptions(Long idOptions) {
		this.idOptions = idOptions;
	}

	
	
	
}
