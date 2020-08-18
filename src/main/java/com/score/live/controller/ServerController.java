package com.score.live.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.score.live.model.Player;
import com.score.live.model.ResponseInfo;
import com.score.live.model.ScoreBoard;
import com.score.live.service.CricketScoreService;

@CrossOrigin
@RestController
public class ServerController {

	@Autowired
	CricketScoreService cricketScoreService;

	@PostMapping(value = "/playerscore")
	public ResponseInfo savePlayerScore(@RequestBody Player player) {

		System.out.println(player.getName() + "\t" + player.getId() + "\t" + player.getTeamName());
		String opertion = "save";
		
		ResponseInfo responseInfo = new ResponseInfo();
		if (cricketScoreService.countByTeamName(player.getTeamName()) < 5) {
			
			try {
				cricketScoreService.savePlayerScore(player);
				responseInfo.setMessage("Player and Score information was saved sucessfully");
				responseInfo.setSuccess(true);
			} catch(IllegalArgumentException  exp) {

				responseInfo.setMessage("provide Player information not correct, Try again");
				responseInfo.setSuccess(false);
			} catch(Exception  exp) {

				responseInfo.setMessage("Player may already played or Provide information not correct, Try again");
				responseInfo.setSuccess(false);
			}
		} else {

			responseInfo.setMessage("Player not added, Cricket team can only 12 player");
			responseInfo.setSuccess(false);
		}
		responseInfo.setOperation(opertion);
		responseInfo.setScoreBoard(null);

		return responseInfo;
	}

	@GetMapping(value = "/getscoreboard")
	public ResponseInfo getScoreBoard() {
		
		
		String opertion = "Fetching ScoreBoard";
		ResponseInfo responseInfo = new ResponseInfo();
		responseInfo.setOperation(opertion);

		try {
			List<Player> playersList = cricketScoreService.getScoreBoardList();
			
			ScoreBoard scoreBoard1 = new ScoreBoard();
			ArrayList<Player> team1PlayerList = new ArrayList<Player>();
			scoreBoard1.setTeamName("Team 1");
			scoreBoard1.setScoreBoardList(team1PlayerList);
	
			ScoreBoard scoreBoard2 = new ScoreBoard();
			ArrayList<Player> team2PlayerList = new ArrayList<Player>();
			scoreBoard2.setTeamName("Team 2");
			scoreBoard2.setScoreBoardList(team2PlayerList);
			
			playersList.stream().forEach(playerList -> {
				if(playerList.getTeamName().trim().equals("Team1")) {
					team1PlayerList.add(playerList);
				}
				else {
					team2PlayerList.add(playerList);
				}
			});
			responseInfo.setSuccess(true);
			responseInfo.setMessage("Success");
			List<ScoreBoard> scoreBoardList = Arrays.asList(scoreBoard1, scoreBoard2);
			responseInfo.setScoreBoard(scoreBoardList);
		} catch(Exception exp) {

			responseInfo.setSuccess(false);
			responseInfo.setMessage("Failure, Try again");
		}
				
		return responseInfo;

	}
	 

}
