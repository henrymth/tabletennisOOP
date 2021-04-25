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

        //System.out.println("jika total points = 1, maka "  + firstTeam.getService(1));
        //System.out.println("test mod operator " + 1%2 + "; " + 2%2 + "; " + 3%2);

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
        scoreBoard.displayWinner(firstTeam,secondTeam);
    }
}
