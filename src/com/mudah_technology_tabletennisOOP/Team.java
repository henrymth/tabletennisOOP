package com.mudah_technology_tabletennisOOP;

public class Team {
    private String name;
    private boolean isReady;
    private int points=0;
    private String service;
    private boolean isTheWinner = false;

    public void ready() {
        isReady=true;
    }

    public void gotPoint() {
        //++1 point in score board
        pointAdd();
    }

    private void pointAdd() {
        points = points + 1;
        if (points == 11) {
            isTheWinner = true;
        }
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

    public String getService(int totalPoints) {
        // untuk tahu service position,
        // poin firstteam dijumlah denagn secondteam lalu di mod 2
        // lalu getservice menegasikan nilai true false masing2.

        if (totalPoints % 2 == 0) {
            //change service position
            if (service == "") {
                service = "service";
                return service;
            } else {
                service = "";
                return service;
            }
        } else {
            return service;
        }
    }

    public void setService(String service) {
        this.service = service;
    }

    public boolean getIsTheWinner () {
        return isTheWinner;
    }
}
