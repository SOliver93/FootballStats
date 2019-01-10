package com.example.arcus.footballstats.models;

public class Leagues {
    public int caption;
    public int league;
    public int year;
    public int currentMatchday;
    public int numberOfMatchdays;
    public int numberOfTeams;
    public int numberOfGames;
    public int lastUpdated;

    public int getCaption() {
        return caption;
    }
    public int getLeague() {
        return league;
    }
    public int getYear() {
        return year;
    }
    public int getCurrentMatchday() {
        return currentMatchday;
    }
    public int getNumberOfMatchdays() {
        return numberOfMatchdays;
    }
    public int getNumberOfTeams() {
        return numberOfTeams;
    }
    public int getNumberOfGames() {
        return numberOfGames;
    }
    public int getLastUpdated() {
        return lastUpdated;
    }

    public void setCaption(short caption) {
        this.caption = caption;
    }
    public void setLeague(short league) { this.league = league; }
    public void setYear(int year) {this.year = year;}
    public void setCurrentMatchday(int currentMatchday) {this.currentMatchday = currentMatchday;}
    public void setnumberOfMatchdays(int numberOfMatchdays) {this.numberOfMatchdays = numberOfMatchdays;}
    public void setnumberOfTeams(int numberOfTeams) {this.numberOfTeams = numberOfTeams;}
    public void setnumberOfGames(int numberOfGames) {this.numberOfGames = numberOfGames;}
    public void setlastUpdated(int lastUpdated) {this.lastUpdated = lastUpdated;}
}
