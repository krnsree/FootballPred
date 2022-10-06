package com.example.FootballPred.service;

import com.example.FootballPred.entity.ClubFootballTeamEntity;
import org.springframework.stereotype.Service;

@Service
public interface ClubFootballService {

    ClubFootballTeamEntity addTeam(ClubFootballTeamEntity team);
}
