package com.mudah_technology_tabletennisOOP;

public class Team {
    private String name;
    private boolean isReady;
    private int points=0;

    public void ready() {
        isReady=true;
    }

    public void gotPoint() {
        //++1 point in score board
        pointAdd();
    }

    private void pointAdd() {
        points = points + 1;
    }

    public int getPoints() {
        return points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getService() {
        return null;
    }
}