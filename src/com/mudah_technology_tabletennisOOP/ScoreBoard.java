package com.mudah_technology_tabletennisOOP;

public class ScoreBoard {

    public void display(Team firstTeam, Team secondTeam) {
        int totalPoints=firstTeam.getPoints() + secondTeam.getPoints();

        System.out.println("============================ Game      |   1  |   2  |   3  |   4  |   5  |   6  |   7  |");
        System.out.println("============================_____________________________________________________________");
        System.out.println("============================ Player 1  |  11  |  11  |  11  |   0  |   0  |   0  |   0  |");
        System.out.println("============================ Player 2  |   1  |  11  |  11  |   0  |   0  |   0  |   0  |");
        System.out.println("=========================================================================================");
        System.out.println(firstTeam.getName() + ": " + firstTeam.getPoints() + " " + firstTeam.getService(totalPoints) );
        System.out.println(secondTeam.getName() + ": " + secondTeam.getPoints() + " " + secondTeam.getService(totalPoints));
        System.out.println("---------------------");

        if (firstTeam.getIsTheWinner() == true)  {
            System.out.println( firstTeam.getName() + " Win!!!");
        } else if (secondTeam.getIsTheWinner() == true) {
            System.out.println(secondTeam.getName() + " Win!!!");
        } else {
            System.out.println("game continue ...");
        }

    }
}
