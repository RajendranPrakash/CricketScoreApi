package com.score.live.model;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;

@Entity
public class Player {
	@Id
	private Integer id;
	private int playerId;
	private String playerName;
	private String playerScore;
	private String teamName;

	
	public Player() {
		
	}


	public Player(Integer id, int playerId, String playerName, String playerScore, String teamName) {
		super();
		this.id = id;
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerScore = playerScore;
		this.teamName = teamName;
	}
	
	
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerScore() {
		return playerScore;
	}
	public void setPlayerScore(String playerScore) {
		this.playerScore = playerScore;
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
