package orctech.nertzboard.Models;

/**
 * Created by justinjlee99 on 5/11/2018.
 */

public class Team {
    String name;
    int score;

    public Team() {
        this("default", 0);
    }
    public Team(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addScore(int toAdd) { this.score += toAdd; }
}
