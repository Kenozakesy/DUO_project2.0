package com.example.gebruiker.androidproject20.Enums;

/**
 * Created by Gebruiker on 24-3-2017.
 */

public enum Gamemodus {

    //enums
    Rikken(10, 5, "R", Overboden.Basis, true),
    Pieken(10, 5, "P", Overboden.Basis, true),
    Misere(10, 5, "M", Overboden.Basis, true),
    Schoppe_mien(10, 5, "S", Overboden.Basis, true),
    Troela(10, 5, "T", Overboden.Basis, true),
    Beter_rikken(10, 5, "B", Overboden.Basis, true),
    Open_plek(10, 5, "*P", Overboden.Basis, true),
    Piek_M_praatje(10, 5, "~P", Overboden.Basis, true),
    Open_misere(10, 5, "*M", Overboden.Basis, true),
    Misere_M_praatje(10, 5, "~M", Overboden.Basis, true);

    //fields
    private int Points;
    private int Extrapoints;
    private String abbreviation;
    private Overboden Overbod;
    private boolean Activated;

    //constructor
    private Gamemodus(int points, int extrapoints, String abbreviation, Overboden overbod, Boolean activated) {
        this.Points = points;
        this.Extrapoints = extrapoints;
        this.Overbod = overbod;
        this.Activated = activated;
        this.abbreviation = abbreviation;
    }

    //propertys
    public int getPoints() {
        return Points;
    }
    public void SetPoints(int n) {this.Points = n;}

    public int getExtrapoints() {
        return Extrapoints;
    }
    public void SetExtrapoints(int n) {this.Extrapoints = n;}

    public String GetAbbrevation() {
        return abbreviation;
    }
    public void SetAbbrevation(String n) {this.abbreviation = n;}

    public Overboden GetOverbod() {
        return this.Overbod;
    }
    public void SetOverbod(Overboden n) {this.Overbod = n;}

    public boolean GetActivated() {
        return this.Activated;
    }
    public void SetActivated(boolean n) {this.Activated = n;}
}
