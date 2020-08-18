package com.score.live.model;

import java.util.List;

public class ResponseInfo {

	private String message;
	private String operation;
	private boolean success;
	private List<ScoreBoard> scoreBoard;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public List<ScoreBoard> getScoreBoard() {
		return scoreBoard;
	}
	public void setScoreBoard(List<ScoreBoard> scoreBoardList) {
		this.scoreBoard = scoreBoardList;
	}

	
}
