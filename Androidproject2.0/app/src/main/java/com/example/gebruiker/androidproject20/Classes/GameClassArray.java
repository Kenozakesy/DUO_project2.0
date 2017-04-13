package com.example.gebruiker.androidproject20.Classes;

/**
 * Created by Gebruiker on 13-4-2017.
 */

public class GameClassArray {

    private int Number;
    private String Player1Score;
    private String Player2Score;
    private String Player3Score;
    private String Player4Score;

    public int GetNumber() {return this.Number;}
    public String GetPlayer1Score() {return this.Player1Score;}
    public String GetPlayer2Score() {return this.Player2Score;}
    public String GetPlayer3Score() {return this.Player3Score;}
    public String GetPlayer4Score() {return this.Player4Score;}

    public GameClassArray(int Number, String player1Score, String player2Score, String player3Score,String player4Score)
    {
        this.Number = Number;
        this.Player1Score = player1Score;
        this.Player2Score = player2Score;
        this.Player3Score = player3Score;
        this.Player4Score = player4Score;
    }
}
