package com.mudah_technology_tabletennisOOP;

public class Game {
    private boolean isOn;
    private String name;
    private int gamePlay;

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
}
