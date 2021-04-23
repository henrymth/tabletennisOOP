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
        secondTeam.ready();
        secondTeam.setName("Bobrow");

        //ball ready
        Ball ball = new Ball();
        ball.ready();

        //game start
        game.start(1);

        //scenario player 11 win, player2 oly 2 points
        firstTeam.gotPoint();

        secondTeam.gotPoint();

        firstTeam.gotPoint();

        firstTeam.gotPoint();

        firstTeam.gotPoint();

        firstTeam.gotPoint();

        firstTeam.gotPoint();
        scoreBoard.display(firstTeam,secondTeam);

        secondTeam.gotPoint();

        firstTeam.gotPoint();

        firstTeam.gotPoint();

        firstTeam.gotPoint();

        firstTeam.gotPoint();

        firstTeam.gotPoint();

        game.end();
        scoreBoard.display(firstTeam,secondTeam);
    }
}
