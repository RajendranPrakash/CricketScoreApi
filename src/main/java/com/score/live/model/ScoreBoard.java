package com.score.live.model;

import java.util.List;

public class ScoreBoard {

	String teamName;
	List<Player> scoreBoardList;
	int count;

	public List<Player> getScoreBoardList() {
		return scoreBoardList;
	}

	public void setScoreBoardList(List<Player> scoreBoardList) {
		this.scoreBoardList = scoreBoardList;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
