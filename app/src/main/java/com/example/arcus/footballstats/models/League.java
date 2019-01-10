package com.example.arcus.footballstats.models;

public class League {
    public int position;
    public short teamName;
    public int playedGames;
    public int points;
    public int goals;
    public int goalsAgainst;
    public int goalDifference;
    public int wins;
    public int draws;
    public int losses;

    public int getPosition() {
        return position;
    }
    public short getTeamName() { return teamName; }
    public int getPlayedGames() {
        return playedGames;
    }
    public int getPoints() {
        return points;
    }
    public int getGoals() {
        return goals;
    }
    public int getGoalsAgainst() {
        return goalsAgainst;
    }
    public int getGoalDifference() {
        return goalDifference;
    }
    public int getWins() {
        return wins;
    }
    public int getDraws() {
        return draws;
    }
    public int getLosses() {
        return losses;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    public void setTeamName(short teamName) {
        this.teamName = teamName;
    }
    public void setPlayedGames(int playedGames) {
        this.playedGames = playedGames;
    }
    public void setpoints(int points) {
        this.points = points;
    }
    public void setGoals(int goals) {
        this.goals = goals;
    }
    public void setgoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }
    public void setgoalDifference(int goalDifference) {
        this.goalDifference = goalDifference;
    }
    public void setwins(int wins) {
        this.wins = wins;
    }
    public void setdraws(int draws) {
        this.draws = draws;
    }
    public void setlosses(int losses) {
        this.losses = losses;
    }
}
