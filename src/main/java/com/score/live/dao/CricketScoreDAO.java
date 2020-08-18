package com.score.live.dao;

import org.springframework.data.repository.CrudRepository;

import com.score.live.model.Player;

public interface CricketScoreDAO extends CrudRepository<Player, Integer> {

	int countByTeamName(String teamName);

}
