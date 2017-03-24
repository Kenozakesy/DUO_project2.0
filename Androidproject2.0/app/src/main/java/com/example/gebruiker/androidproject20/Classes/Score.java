package com.example.gebruiker.androidproject20.Classes;

/**
 * Created by Gebruiker on 24-3-2017.
 */

public class Score {

    //connections
    private Subgame subgame;
    private Players player;

    //fields
    private int Score;

    //propertys
    public Subgame GetSubgame() {return  this.subgame;}
    public Players GetPlayer() {return  this.player;}

    public int GetScore() {return  this.Score;}
    public void SetScore(int n) {this.Score = n;}

    //constructor
    public Score(int score)
    {
        this.Score = score;
    }

    //methods
}
