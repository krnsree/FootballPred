package com.example.FootballPred.repository;

import com.example.FootballPred.entity.ClubFootballTeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubFootballRepository extends JpaRepository<ClubFootballTeamEntity, Integer> {

}
