package com.mudah_technology_tabletennisOOP;

public class ScoreBoard {

    public void display(Team firstTeam, Team secondTeam) {
        int totalPoints=firstTeam.getPoints() + secondTeam.getPoints();

        System.out.println("=====================");
        System.out.println(firstTeam.getName() + ": " + firstTeam.getPoints() + " " + firstTeam.getService(totalPoints));
        System.out.println(secondTeam.getName() + ": " + secondTeam.getPoints() + " " + secondTeam.getService(totalPoints));
        System.out.println("---------------------");
    }

    public void displayWinner(Team firstTeam, Team secondTeam) {
        if (firstTeam.getIsTheWinner() == true)  {
            System.out.println( firstTeam.getName() + " Win!!!");
        } else {
            System.out.println(secondTeam.getName() + " Win!!!");
        }
    }
}
