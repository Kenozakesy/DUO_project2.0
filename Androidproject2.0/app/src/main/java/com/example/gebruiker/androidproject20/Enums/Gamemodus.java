package com.example.gebruiker.androidproject20.Enums;

/**
 * Created by Gebruiker on 24-3-2017.
 */

public enum Gamemodus {

    //enums
    Rikken(10, 5, "R", Overboden.Basis, true, 5),
    Pieken(10, 5, "P", Overboden.Basis, true, 5),
    Misere(10, 5, "M", Overboden.Basis, true, 5),
    Schoppe_mien(10, 5, "S", Overboden.Basis, true, 5),
    Troela(10, 5, "T", Overboden.Basis, true, 5),
    Beter_rikken(10, 5, "B", Overboden.Basis, true, 5),
    Open_plek(10, 5, "*P", Overboden.Basis, true, 5),
    Piek_M_praatje(10, 5, "~P", Overboden.Basis, true, 5),
    Open_misere(10, 5, "*M", Overboden.Basis, true, 5),
    Misere_M_praatje(10, 5, "~M", Overboden.Basis, true,5);

    //fields
    private int Points;
    private int Extrapoints;
    private String abbreviation;
    private Overboden Overbod;
    private boolean Activated;
    private int hitsneeded;

    //constructor
    private Gamemodus(int points, int extrapoints, String abbreviation, Overboden overbod, Boolean activated, int hitsneeded) {
        this.Points = points;
        this.Extrapoints = extrapoints;
        this.Overbod = overbod;
        this.Activated = activated;
        this.abbreviation = abbreviation;
        this.hitsneeded = hitsneeded;
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

    public String getAbbrevation() {
        return abbreviation;
    }
    public void SetAbbrevation(String n) {this.abbreviation = n;}

    public Overboden getOverbod() {
        return this.Overbod;
    }
    public void SetOverbod(Overboden n) {this.Overbod = n;}

    public boolean getActivated() {
        return this.Activated;
    }
    public void SetActivated(boolean n) {this.Activated = n;}

    public int getHitsneeded() {
        return hitsneeded;
    }
    public void SetHitsneeded(int n) {this.hitsneeded = n;}
}
