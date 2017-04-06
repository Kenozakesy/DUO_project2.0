package com.example.gebruiker.androidproject20.Classes;

import com.example.gebruiker.androidproject20.Enums.Gamestatus;

/**
 * Created by Gebruiker on 24-3-2017.
 */

public class Score {

    //connections
    private Subgame subgame;
    private Players player;
    private Gamestatus status;

    //fields
    private int Score;

    //propertys
    public Subgame GetSubgame() {return  this.subgame;}
    public Players GetPlayer() {return  this.player;}

    public int GetScore() {return  this.Score;}
    public void SetScore(int n) {this.Score = n;}

    public Gamestatus GetStatus() {return  this.status;}
    public void GetStatus(Gamestatus n) {this.status = n;}

    //constructor
    public Score(int score, Gamestatus status, Players player)
    {
        this.player = player;
        this.Score = score;
        this.status = status;
    }

    public Score(Gamestatus status)
    {
        this.status = status;
    }


    //methods
}
