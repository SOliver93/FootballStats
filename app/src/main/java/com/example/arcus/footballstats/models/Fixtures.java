package com.example.arcus.footballstats.models;

public class Fixtures {
    public int matchday;
    public short homeTeamName;
    public short awayTeamName;
    public int goalsHomeTeam;
    public int goalsAwayTeam;

    public int getMatchday() {
        return matchday;
    }
    public short getHomeTeamName() {
        return homeTeamName;
    }
    public short getAwayTeamName() {
        return awayTeamName;
    }
    public int getGoalsHomeTeam() {
        return goalsHomeTeam;
    }
    public int getGoalsAwayTeam() {
        return goalsAwayTeam;
    }

    public void setmatchday(int matchday) {
        this.matchday = matchday;
    }
    public void sethomeTeamName(short homeTeamName) {
        this.homeTeamName = homeTeamName;
    }
    public void setawayTeamName(short awayTeamName) {
        this.awayTeamName = awayTeamName;
    }
    public void setgoalsHomeTeam(int goalsHomeTeam) {
        this.goalsHomeTeam = goalsHomeTeam;
    }
    public void setgoalsAwayTeam(int goalsAwayTeam) {
        this.goalsAwayTeam = goalsAwayTeam;
    }
}
