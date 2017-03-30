package com.example.gebruiker.androidproject20.Classes;

import java.util.ArrayList;

/**
 * Created by Gebruiker on 24-3-2017.
 */

//singleton of the appication
public class Game {

    //fields
    private static boolean finished;

    //propertys
    public static boolean Getfinished() {return finished; }
    public static void Setfinished(boolean n) { finished = n; }

    //Lists in which we have to keep track of the games and players
    public static ArrayList<Subgame> subgameList = new ArrayList<>();
    public static Players[] Players = new Players[4];

    //constructor
    public Game()
    {
        finished = false;
    }

    //Methods
    public void WriteCurrentScore()
    {
        //writes the score after a new one has just been calculated
    }



}
