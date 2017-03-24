package com.example.gebruiker.androidproject20.Classes;

import java.util.ArrayList;

/**
 * Created by Gebruiker on 24-3-2017.
 */

public class Players {

    //fields
    private int ID;
    private String name;
    private String abbrevation;

    private ArrayList<Score> Scorelist = new ArrayList<>();

    //propertys
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
    }


    //methods



}
