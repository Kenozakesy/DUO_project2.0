package com.example.gebruiker.androidproject20.Classes;

import android.graphics.Color;
import android.widget.Button;

import com.example.gebruiker.androidproject20.Enums.Gamemodus;
import com.example.gebruiker.androidproject20.Enums.Gamestatus;
import com.example.gebruiker.androidproject20.Enums.Overboden;

import java.util.ArrayList;

/**
 * Created by Gebruiker on 24-3-2017.
 */

public class Subgame {

    //fields
    private ArrayList<Gamemodus> gamemodusList;
    private ArrayList<Players> PlayerList;
    private ArrayList<Button> Buttonlist;

    //id van de subgame
    private static int Number = 0;
    private int NumberToView;

    private int Hits;
    private int TotalPoints;
    private int PlayerScore;
    private int OpponentScore;

    private Gamemodus playedGamemodus;

    private ArrayList<Score> Scorelist = new ArrayList<Score>();

    //propertys
    public ArrayList<Score> GetScoreList() {return this.Scorelist;}
    public ArrayList<Gamemodus> GetgamemodusList() {return this.gamemodusList;}

    public int Getnumber(){return this.Number;}
    public void Setnumber(int n){this.Number = n;}

    public int GetHits(){return this.Hits;}
    public void SetHits(int n){this.Hits = n;}


    //constructor

    public Subgame(ArrayList<Gamemodus> gamemoduslist, int hits)
    {
        Number++;
        this.NumberToView = Number;
        this.gamemodusList = gamemoduslist;
        this.Hits = hits;

        //this.Buttonlist = Buttonlist;
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

        Score score = new Score(Gamestatus.Opponent);

        switch(game)
        {
            case Schoppe_mien:
                SchoppeMien();
                break;
            case Rikken:
                Rikken();
                break;
            case Beter_rikken:
                Rikken();
                break;
            case Pieken:
                //call method
                break;
            case Open_piek:
                //call method
                break;
            case Piek_M_praatje:
                //call method
                break;
            case Misere:
                //call method
                break;
            case Open_misere:
                //call method
                break;
            case Misere_M_praatje:
                //call method
                break;
            case Acht_Alleen:
                Number_Alleen();
                break;
            case Negen_Alleen:
                Number_Alleen();
                break;
            case Tien_Alleen:
                Number_Alleen();
                break;
            case Elf_Alleen:
                Number_Alleen();
                break;
            case Twaalf_Alleen:
                Number_Alleen();
                break;
            case Dertien_Alleen:
                Dertien_Alleen();
                break;
            case Troela:
                Rikken();
                break;
            default:
                //do nothing
        }
        //zorgt ervoor dat een nieuwe score kan worden aangemaakt
        CreateNewScore();
    }

    //Card methods
    public void SchoppeMien()
    {
        int Opponent = 0;
        int Player = 0;
        //hier scores berekenen
        for (Button B: Buttonlist)
        {
            if(B.getSolidColor() == Color.YELLOW)
            {
                Player++;
            }
            else
            {
                Opponent++;
            }
        }

        if(Opponent == Player)
        {
            this.PlayerScore = 20;
            this.OpponentScore = -20;
        }
        else
        {
            this.PlayerScore = 15;
            this.OpponentScore = -45;
        }
    }

    public void Rikken() //(beter_rikken & troela)
    {
        int hitsneed = this.playedGamemodus.getHitsneeded();

        //hier scores berekenen
        int hitPoints = 0;
        if(this.Hits >= hitsneed)
        {
            this.PlayerScore = 10 + (5 * (Hits - hitsneed));
            this.OpponentScore = -10 + (-5 * (Hits - hitsneed));
        }
        else
        {
            this.PlayerScore = -10 + (-5 * (hitsneed - Hits));;
            this.OpponentScore = 10 + (5 * (hitsneed - Hits));;
        }


    }

    public void Number_Alleen() //(voor alle alleen spellen met een cijfer ervoor)
    {
        int hitsneed = this.playedGamemodus.getHitsneeded();

        if(this.Hits >= hitsneed)
        {
            this.PlayerScore = playedGamemodus.getPoints() + (playedGamemodus.getExtrapoints() * 3 * (Hits - hitsneed));
            this.OpponentScore = (-playedGamemodus.getPoints() / 3) + (-playedGamemodus.getExtrapoints() * (Hits - hitsneed));
        }
        else
        {
            this.PlayerScore = -playedGamemodus.getPoints() + (-playedGamemodus.getExtrapoints() * 3 * (hitsneed - Hits));
            this.OpponentScore = (playedGamemodus.getPoints() / 3) + (playedGamemodus.getExtrapoints() * (hitsneed - Hits));
        }
    }

    public void Dertien_Alleen()
    {
        int hitsneed = this.playedGamemodus.getHitsneeded();

        if(this.Hits >= hitsneed)
        {
            this.PlayerScore = playedGamemodus.getPoints();
            this.OpponentScore = (-playedGamemodus.getPoints() / 3);
        }
        else
        {
            this.PlayerScore = -playedGamemodus.getPoints() + (-playedGamemodus.getExtrapoints() * 3 * (hitsneed - Hits));
            this.OpponentScore = (playedGamemodus.getPoints() / 3) + (playedGamemodus.getExtrapoints() * (hitsneed - Hits));
        }
    }





    //create a new score
    public void CreateNewScore()
    {
        for (Button B : Buttonlist)
        {
            Players player = null;
            //get/create correct player
            for (Players P:Game.PlayerList)
            {
                if(B.getText().toString() == P.GetName())
                {
                    player = P;
                }
            }

            if(player != null)
            {
                //determine status
                Gamestatus prstat;
                if (B.getSolidColor() == Color.YELLOW) {
                    prstat = Gamestatus.Player;
                } else {
                    prstat = Gamestatus.Opponent;
                }

                if (prstat == Gamestatus.Player) {
                    Score score = new Score(PlayerScore, prstat, player);
                } else {
                    Score score = new Score(OpponentScore, prstat, player);
                }
            }

        }
    }




}
