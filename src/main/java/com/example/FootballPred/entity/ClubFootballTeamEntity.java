package com.example.FootballPred.entity;

import javax.persistence.*;

@Entity
@Table(name = "FottballTeamClub")
public class ClubFootballTeamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "footballTeamId")
    private int id;

    @Column(name = "footballTeamName")
    private String teamName;

    @Column(name = "footballTeamNat")
    private String teamNameNat;

    @Column(name = "footballTeamNameAbv")
    private String teamNameAbv;

    public ClubFootballTeamEntity() {
    }

    public ClubFootballTeamEntity(String teamName, String teamNameNat, String teamNameAbv) {
        this.teamName = teamName;
        this.teamNameNat = teamNameNat;
        this.teamNameAbv = teamNameAbv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamNameNat() {
        return teamNameNat;
    }

    public void setTeamNameNat(String teamNameNat) {
        this.teamNameNat = teamNameNat;
    }

    public String getTeamNameAbv() {
        return teamNameAbv;
    }

    public void setTeamNameAbv(String teamNameAbv) {
        this.teamNameAbv = teamNameAbv;
    }
}
