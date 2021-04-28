package com.mudah_technology_tabletennisOOP;

public class Game {
    private boolean isOn;
    private String name;
    private int gamePlay;
    private int[][] gameScore;

    public void ready (String name){
        if (name == "table tennis") {
            isOn = true;
            this.name = name;
        } else {
            isOn=false;
        }
    }

    public void end (){
        isOn=false;
    }

    public void start(int gamePlay) {
        this.gamePlay = gamePlay;
    }

    public int[][] gameBoard (){
        int[][] gameScore = new int[3][7];
        gameScore[0][0]= 1;
        gameScore[1][0]= 11;
        gameScore[2][0]= 2;

        gameScore[0][1]= 2;
        gameScore[1][0]= 11;
        gameScore[2][0]= 2;

        gameScore[0][2]= 3;
        gameScore[1][0]= 11;
        gameScore[2][0]= 2;

        gameScore[0][3]= 4;
        gameScore[1][0]= 11;
        gameScore[2][0]= 2;

        gameScore[0][4]= 5;
        gameScore[1][0]= 11;
        gameScore[2][0]= 2;

        gameScore[0][5]= 6;
        gameScore[1][0]= 11;
        gameScore[2][0]= 2;

        gameScore[0][6]= 7;
        gameScore[1][0]= 11;
        gameScore[2][0]= 2;

        return gameScore;
    }
}
