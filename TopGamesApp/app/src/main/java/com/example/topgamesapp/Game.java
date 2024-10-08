package com.example.topgamesapp;

public class Game {
    String gameName;
    int gameIMG;

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getGameIMG() {
        return gameIMG;
    }

    public void setGameIMG(int gameIMG) {
        this.gameIMG = gameIMG;
    }

    public Game(String gameName, int gameIMG) {
        this.gameName = gameName;
        this.gameIMG = gameIMG;
    }
}
