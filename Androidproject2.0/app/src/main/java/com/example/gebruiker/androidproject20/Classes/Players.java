package com.example.gebruiker.androidproject20.Classes;

import com.example.gebruiker.androidproject20.Enums.Gamestatus;

import java.util.ArrayList;

/**
 * Created by Gebruiker on 24-3-2017.
 */

public class Players {

    //fields
    private int ID;
    private String name;
    private String abbrevation;
    private Gamestatus status;
    private int TotalScore;

    private ArrayList<Score> Scorelist = new ArrayList<>();

    //propertys
    public int GetTotalScore() {return this.TotalScore;}

    public int GetID() {return this.ID;}
    //public void SetID(int n) {this.ID = n}

    public String GetName() {return this.name;}
    public void SetName(String n) {this.name = n;}

    public String GetAbbrevation() {return this.abbrevation;}
    //public void SetAbbrevation(String n) {this.abbrevation = n;}

    //constructor
    public Players(String name)
    {
        this.name = name;
        abbrevation = name.substring(0,2).toUpperCase();
        this.status = Gamestatus.Opponent;
        this.TotalScore = 0;
    }

    //methods
    public void CalculateTotalScore()
    {
        int Score = 0;
        //naar elke invoer van een nieuwe game bereken de nieuwe score
        for (Subgame S :Game.subgameList)
        {
            for (Score SC:S.GetScoreList())
            {
                if(SC.GetPlayer().GetName() == this.name)
                {
                    Score = Score + SC.GetScore();
                }
            }
        }
        this.TotalScore = Score;
    }


}
