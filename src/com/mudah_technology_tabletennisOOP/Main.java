package com.mudah_technology_tabletennisOOP;

import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //score board ready
        ScoreBoard scoreBoard = new ScoreBoard();

        //game ready
        Game game = new Game();
        game.ready("table tennis");

        //player ready
        Team firstTeam = new Team();
        Team secondTeam = new Team();
        firstTeam.ready();
        firstTeam.setName("Xin Hua");
        firstTeam.setService("service");
        secondTeam.ready();
        secondTeam.setName("Bobrow");
        secondTeam.setService("");

          //ball ready
        Ball ball = new Ball();
        ball.ready();

        //game start
        game.start(1);

        //scenario player 11 win, player2 oly 2 points
        firstTeam.gotPoint();
        scoreBoard.display(firstTeam,secondTeam);

        secondTeam.gotPoint();
        scoreBoard.display(firstTeam,secondTeam);

        firstTeam.gotPoint();
        scoreBoard.display(firstTeam,secondTeam);

        firstTeam.gotPoint();
        scoreBoard.display(firstTeam,secondTeam);

        firstTeam.gotPoint();
        scoreBoard.display(firstTeam,secondTeam);

        firstTeam.gotPoint();
        scoreBoard.display(firstTeam,secondTeam);

        firstTeam.gotPoint();
        scoreBoard.display(firstTeam,secondTeam);

        secondTeam.gotPoint();
        scoreBoard.display(firstTeam,secondTeam);

        firstTeam.gotPoint();
        scoreBoard.display(firstTeam,secondTeam);

        firstTeam.gotPoint();
        scoreBoard.display(firstTeam,secondTeam);

        firstTeam.gotPoint();
        scoreBoard.display(firstTeam,secondTeam);

        firstTeam.gotPoint();
        scoreBoard.display(firstTeam,secondTeam);

        firstTeam.gotPoint();
        scoreBoard.display(firstTeam,secondTeam);

        game.end();
        scoreBoard.display(firstTeam,secondTeam);

        //keluarin matris
        System.out.println("ngasal dulu");

        for (int i=0; i<7; i++) {
            System.out.print(game.gameBoard()[0][i] + " |");

        }

        for (int i=0; i<7; i++) {
            System.out.print(game.gameBoard()[1][i] + " |");
            //System.out.print(game.gameBoard()[2][i] + " |");
        }

        for (int i=0; i<7; i++) {
            System.out.print(game.gameBoard()[2][i] + " |");
        }
    }
}
