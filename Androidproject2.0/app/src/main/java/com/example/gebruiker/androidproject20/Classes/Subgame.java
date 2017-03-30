package com.example.gebruiker.androidproject20.Classes;

import com.example.gebruiker.androidproject20.Enums.Gamemodus;
import com.example.gebruiker.androidproject20.Enums.Overboden;

import java.util.ArrayList;

/**
 * Created by Gebruiker on 24-3-2017.
 */

public class Subgame {

    //fields
    private ArrayList<Gamemodus> gamemodusList;
    private int Number;
    private int Hits;

    private Score[] Scorelist = new Score[4];

    //propertys
    public ArrayList<Gamemodus> GetgamemodusList() {return this.gamemodusList;}

    public int Getnumber(){return this.Number;}
    public void Setnumber(int n){this.Number = n;}

    public int GetHits(){return this.Hits;}
    public void SetHits(int n){this.Hits = n;}


    //constructor
    public Subgame(int number)
    {
        this.Number = number;
    }

    public Subgame(int number, ArrayList<Gamemodus> gamemoduslist)
    {
        this.Number = number;
        this.gamemodusList = gamemoduslist;
    }


    //methods
    public void testmethod()
    {

    }




}
