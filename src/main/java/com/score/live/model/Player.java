package com.score.live.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;

@Entity
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private int number;
	@Column(unique = true, nullable = false)
	private String name;
	@Column(nullable = false)
	private String score;
	@Column(nullable = false)
	private String teamName;

	
	public Player() {
		
	}

	public Player(Long id, int number, String playerName, String playerScore, String teamName) {
		super();
		this.id = id;
		this.number = number;
		this.name = playerName;
		this.score = playerScore;
		this.teamName = teamName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	
}
