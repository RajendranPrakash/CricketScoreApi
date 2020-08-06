package com.score.live.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.score.live.dao.CricketScoreDAO;
import com.score.live.model.Player;

@Service
public class CricketScoreService {

	@Autowired
	CricketScoreDAO cricketScoreDAO;
	
	
	public CricketScoreService() {
		super();
	}

	public boolean savePlayerScore(Player player) {
		cricketScoreDAO.save(player);
		return false;
	}

	public List<Player> getScoreBoardList() {
		
		List<Player> players = new ArrayList<Player>();
		cricketScoreDAO.findAll().forEach(player -> players.add(player));
		return players;
	}
}
