package com.score.live.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.score.live.model.Player;
import com.score.live.model.ScoreBoard;
import com.score.live.service.CricketScoreService;

@RestController
public class ServerController {
	
	@Autowired
	CricketScoreService cricketScoreService;

	@PostMapping(value = "/playerscore")
	public boolean savePlayerScore(@RequestBody Player player) {
		
		System.out.println(player.getPlayerName()+"\t"+player.getPlayerScore()+"\t"+player.getTeamName());
		
		return cricketScoreService.savePlayerScore(player);
	}
	
	@GetMapping(value="/getscoreboard")
	public ScoreBoard getScoreBoard() {
		ScoreBoard scoreBoard = new ScoreBoard();
		
		List<Player> playersScoreList = cricketScoreService.getScoreBoardList();
		
		scoreBoard.setScoreBoardList(playersScoreList);
		return scoreBoard;
		
	}
}
