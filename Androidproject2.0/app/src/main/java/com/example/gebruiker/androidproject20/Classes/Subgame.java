package com.example.gebruiker.androidproject20.Classes;

import com.example.gebruiker.androidproject20.Enums.Gamemodus;
import com.example.gebruiker.androidproject20.Enums.Overboden;

import java.util.ArrayList;

/**
 * Created by Gebruiker on 24-3-2017.
 */

public class Subgame {

    //fields
    private Gamemodus gamemodus;
    private int Points;
    private int ExtraPoints;
    private Overboden Overbod;
    private boolean Activated;
    private String abbrevation;
    private int Hitsneeded;
    private int Hits;

    private Score[] Scorelist = new Score[4];

    //propertys
    public Gamemodus GetGamemodus() {return this.gamemodus;}

    public int Getpoints(){return this.Points;}
    public void Setpoints(int n){this.Points = n;}

    public int GetExtrapoints() {
        return this.ExtraPoints;
    }
    public void SetExtrapoints(int n) {this.ExtraPoints = n;}

    public Overboden GetOverbod() {
        return this.Overbod;
    }
    public void SetOverbod(Overboden n) {this.Overbod = n;}

    public boolean GetActivated() {
        return this.Activated;
    }
    public void SetActivated(boolean n) {this.Activated = n;}

    public String GetAbbrevation() {
        return this.abbrevation;
    }
    public void SetAbbrevation(String n) {this.abbrevation = n;}

    public int getHitsneeded() {
        return this.Hitsneeded;
    }
    public void SetHitsneeded(int n) {this.Hitsneeded = n;}

    public int getHits() {
        return this.Hits;
    }
    public void SetHits(int n) {this.Hits = n;}

    //constructor
    public Subgame(Gamemodus game)
    {
        this.gamemodus = game;
        this.Points = gamemodus.getPoints();
        this.ExtraPoints = gamemodus.getExtrapoints();
        this.Overbod = gamemodus.getOverbod();
        this.abbrevation = gamemodus.getAbbrevation();
        this.Hitsneeded = gamemodus.getHitsneeded();
    }

    //methods
    public void testmethod()
    {

    }




}
