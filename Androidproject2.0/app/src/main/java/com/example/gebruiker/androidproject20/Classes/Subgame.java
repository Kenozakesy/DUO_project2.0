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

    //id van de subgame
    private static int Number = 0;
    private int NumberToView;

    private int Hits;
    private int TotalPoints;
    private Gamemodus playedGamemodus;

    private Score[] Scorelist = new Score[4];

    //propertys
    public ArrayList<Gamemodus> GetgamemodusList() {return this.gamemodusList;}

    public int Getnumber(){return this.Number;}
    public void Setnumber(int n){this.Number = n;}

    public int GetHits(){return this.Hits;}
    public void SetHits(int n){this.Hits = n;}


    //constructor

    public Subgame(ArrayList<Gamemodus> gamemoduslist)
    {
        Number++;
        this.NumberToView = Number;
        this.gamemodusList = gamemoduslist;
    }

    //methods

    public void NewCalculation()
    {
        //calculates total points of the subgame
        int total = 0;
        for (Gamemodus G: gamemodusList)
        {
            total = total + G.getPoints();
        }
        this.TotalPoints = total;

        Gamemodus game = gamemodusList.get(gamemodusList.size() -1);
        this.playedGamemodus = game;

        switch(game)
        {
            case Schoppe_mien:
                //call method
                break;
            case Rikken:
                //call method
                break;
            case Beter_rikken:
                //call method
                break;
            case Pieken:
                //call method
                break;
            case Misere:
                //call method
                break;
            case Open_piek:
                //call method
                break;
            case Piek_M_praatje:
                //call method
                break;
            case Open_misere:
                //call method
                break;
            case Misere_M_praatje:
                //call method
                break;
            case Acht_Alleen:
                //call method
                break;
            case Negen_Alleen:
                //call method
                break;
            case Tien_Alleen:
                //call method
                break;
            case Elf_Alleen:
                //call method
                break;
            case Twaalf_Alleen:
                //call method
                break;
            case Dertien_Alleen:
                //call method
                break;
            case Troela:
                //call method
                break;
            default:
                //do nothing
        }

    }

    public void Rikken()
    {

    }





}
