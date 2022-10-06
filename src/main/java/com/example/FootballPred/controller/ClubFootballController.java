package com.example.FootballPred.controller;

import com.example.FootballPred.entity.ClubFootballTeamEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.FootballPred.service.ClubFootballService;

@RestController
@RequestMapping("/api/clubfootball/v1")
public class ClubFootballController {

    @Autowired
    private ClubFootballService clubFootballService;

    @PostMapping("/addteam")
    public ResponseEntity<ClubFootballTeamEntity> addTeam(@RequestBody ClubFootballTeamEntity team){
        return ResponseEntity.ok(clubFootballService.addTeam(team));
    }

}
