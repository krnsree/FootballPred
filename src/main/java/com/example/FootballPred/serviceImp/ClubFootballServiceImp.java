package com.example.FootballPred.serviceImp;

import com.example.FootballPred.entity.ClubFootballTeamEntity;
import com.example.FootballPred.repository.ClubFootballRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FootballPred.service.ClubFootballService;

@Service
public class ClubFootballServiceImp implements ClubFootballService {

    @Autowired
    private ClubFootballRepository clubFootballRepository;

    @Override
    public ClubFootballTeamEntity addTeam(ClubFootballTeamEntity team) {
        clubFootballRepository.save(team);
        System.out.println(team.getTeamName());
        return team;
    }
}
