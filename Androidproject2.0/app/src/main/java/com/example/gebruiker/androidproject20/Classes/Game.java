package com.example.gebruiker.androidproject20.Classes;

import java.util.ArrayList;
import java.util.Arrays;

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

    public static ArrayList<Players> PlayerList = new ArrayList();

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

    public static void Addnewplayer(ArrayList<Players> players)
    {
        for (Players P: players)
        {
            PlayerList.add(P);
        }
    }

    public static void AddnewSubGame(Subgame prSubgame)
    {
        subgameList.add(prSubgame);
        for (Players P: PlayerList)
        {
            P.CalculateTotalScore();
        }
    }

    public static void Reset()
    {
        subgameList.clear();
        PlayerList.clear();
    }

}
