package com.projectz.back.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class Games {

	private Long idGames;
	
	private Long idStage;
	
	private Long life;
	
	private Long energy;
	
	private String gameCode;
	
	public Games() {
		
	}

	public Games(Long idGames, Long idStage, Long life, Long energy, String gameCode) {
		super();
		this.idGames = idGames;
		this.idStage = idStage;
		this.life = life;
		this.energy = energy;
		this.gameCode = gameCode;
	}

	public Long getIdGames() {
		return idGames;
	}

	public void setIdGames(Long idGames) {
		this.idGames = idGames;
	}

	public Long getIdStage() {
		return idStage;
	}

	public void setIdStage(Long idStage) {
		this.idStage = idStage;
	}

	public Long getLife() {
		return life;
	}

	public void setLife(Long life) {
		this.life = life;
	}

	public Long getEnergy() {
		return energy;
	}

	public void setEnergy(Long energy) {
		this.energy = energy;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}
	
	
	
	
}
