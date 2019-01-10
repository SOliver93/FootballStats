package com.example.arcus.footballstats.models;

public class Players {
    public short Pname;
    public short position;
    public int jerseyNumber;
    public short dateOfBirth;
    public short nationality;
    public short contractUntil;

    public short getPname() {
        return Pname;
    }
    public short getPosition() {
        return position;
    }
    public int getJerseyNumber() {
        return jerseyNumber;
    }
    public short getDateOfBirth() {
        return dateOfBirth;
    }
    public short getNationality() {
        return nationality;
    }
    public short getContractUntil() {
        return contractUntil;
    }

    public void setPname(short Pname) {
        this.Pname = Pname;
    }
    public void setposition(short position) {
        this.position = position;
    }
    public void setjerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }
    public void setdateOfBirth(short dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setnationality(short nationality) {
        this.nationality = nationality;
    }
    public void setcontractUntil(short contractUntil) {
        this.contractUntil = contractUntil;
    }
}
