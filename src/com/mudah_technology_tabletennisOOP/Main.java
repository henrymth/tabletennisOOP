package com.mudah_technology_tabletennisOOP;

public class Main {

    public static void main(String[] args) {
	// write your code here
        game.ready("table tennis");

        //player ready
        players.ready();
        players.start();

        //ball ready
        ball.ready();
        ball.start();

        //game start
        game.start(1);

        //scenario player 11 win, player2 oly 2 points
        players.player(1).gotPoint();

        players.player(1).gotPoint();

        players.player(1).gotPoint();

        players.player(1).gotPoint();

        players.player(1).gotPoint();

        players.player(1).gotPoint();

        players.player(1).gotPoint();

        players.player(2).gotPoint();

        players.player(1).gotPoint();

        players.player(2).gotPoint();

        players.player(1).gotPoint();

        players.player(1).gotPoint();

        players.player(1).gotPoint();

        ball.end();
        players.end();
        game.end(1);

    }
}
