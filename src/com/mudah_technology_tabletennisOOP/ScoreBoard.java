package com.mudah_technology_tabletennisOOP;

public class ScoreBoard {

    public void display(Team firstTeam, Team secondTeam) {
        System.out.println("=====================");
        System.out.println(firstTeam.getName() + ": " + firstTeam.getPoints() + " (Service)");
        System.out.println(secondTeam.getName() + ": " + secondTeam.getPoints()+ " " + secondTeam.getService());
        System.out.println("---------------------");
    }
}
