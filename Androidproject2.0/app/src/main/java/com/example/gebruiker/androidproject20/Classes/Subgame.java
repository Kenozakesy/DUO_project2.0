package com.example.gebruiker.androidproject20.Classes;

import android.content.res.ColorStateList;
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
    private int LoserScore;

    private Gamemodus playedGamemodus;

    private ArrayList<Score> Scorelist = new ArrayList<Score>();

    //propertys
    public Gamemodus GetPlayedgamemodus() {return this.playedGamemodus;}
    public ArrayList<Score> GetScoreList() {return this.Scorelist;}
    public ArrayList<Gamemodus> GetgamemodusList() {return this.gamemodusList;}

    public int Getnumber(){return this.Number;}
    public void Setnumber(int n){this.Number = n;}

    public int GetHits(){return this.Hits;}
    public void SetHits(int n){this.Hits = n;}


    //constructor
    public Subgame(ArrayList<Gamemodus> gamemoduslist, int hits, ArrayList<Button> buttonlist)
    {
        Number++;
        this.NumberToView = Number;
        this.gamemodusList = gamemoduslist;
        this.Hits = hits;
        this.Buttonlist = buttonlist;

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
                Pieken();
                break;
            case Open_piek:
                Pieken();
                break;
            case Piek_M_praatje:
                Pieken();
                break;
            case Misere:
                Misere();
                break;
            case Open_misere:
                Misere();
                break;
            case Misere_M_praatje:
                Misere();
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
            this.OpponentScore = 20;
        }
        else
        {
            this.PlayerScore = 15;
            this.OpponentScore = 45;
        }
    }

    public void Rikken() //(beter_rikken & troela)
    {
        int hitsneed = this.playedGamemodus.getHitsneeded();

        //hier scores berekenen
        int hitPoints = 0;
        if(this.Hits >= hitsneed)
        {
            this.PlayerScore = this.TotalPoints + (5 * (Hits - hitsneed));
            this.OpponentScore = this.TotalPoints + (5 * (Hits - hitsneed));
        }
        else
        {
            this.PlayerScore = this.TotalPoints + (5 * (hitsneed - Hits));;
            this.OpponentScore = this.TotalPoints + (5 * (hitsneed - Hits));;
        }
    }

    public void Number_Alleen() //(voor alle alleen spellen met een cijfer ervoor)
    {
        int hitsneed = this.playedGamemodus.getHitsneeded();

        if(this.Hits >= hitsneed)
        {
            this.PlayerScore = this.TotalPoints + (playedGamemodus.getExtrapoints() * 3 * (Hits - hitsneed));
            this.OpponentScore = (this.TotalPoints / 3) + (playedGamemodus.getExtrapoints() * (Hits - hitsneed));
        }
        else
        {
            this.PlayerScore = this.TotalPoints + (playedGamemodus.getExtrapoints() * 3 * (hitsneed - Hits));
            this.OpponentScore = (this.TotalPoints / 3) + (playedGamemodus.getExtrapoints() * (hitsneed - Hits));
        }
    }

    public void Dertien_Alleen()
    {
        int hitsneed = this.playedGamemodus.getHitsneeded();

        this.PlayerScore = this.TotalPoints + (playedGamemodus.getExtrapoints() * 3 * (hitsneed - Hits));
        this.OpponentScore = ((this.TotalPoints) / 3) + (playedGamemodus.getExtrapoints() * (hitsneed - Hits));
    }


    //moet later komen eerst de bovenste goed erin zetten

    //en open piek en piekmpraatje
    public void Pieken()
    {
        int Opponent = 0;
        int Player = 0;
        int Loser = 0;

        //hier scores berekenen
        for (Button B: Buttonlist)
        {
            ColorStateList mList = B.getTextColors();
            int color = mList.getDefaultColor();

            //determine status
            switch(color)
            {
                case Color.YELLOW:
                    Player++;
                    break;
                case Color.RED:
                    Loser++;
                    break;
                default:
                   Opponent++;

            }
        }

        if(Opponent == Player)
        {
            this.PlayerScore = this.playedGamemodus.getPoints();
            this.OpponentScore = this.playedGamemodus.getPoints();
        }
        else if(Opponent == 3 && Player == 1)
        {
            this.PlayerScore = this.playedGamemodus.getPoints();
            this.OpponentScore = this.playedGamemodus.getPoints() / 3;
        }
        else if(Opponent == 1 && Player == 3)
        {
            this.PlayerScore = this.playedGamemodus.getPoints();
            this.OpponentScore = this.playedGamemodus.getPoints() * 3;
        }
        else if(Loser == 1 && Player == 2 && Opponent == 1)
        {
            this.PlayerScore = this.playedGamemodus.getPoints();
            this.OpponentScore = 0;
            this.LoserScore = -this.playedGamemodus.getPoints() * 2;
        }
        else if(Loser == 2 && Player == 1 && Opponent == 1)
        {
            this.PlayerScore = this.playedGamemodus.getPoints();
            this.OpponentScore = 0;
            this.LoserScore = -this.playedGamemodus.getPoints() / 2;
        }
        else if(Loser == 1 && Player == 1 && Opponent == 2)
        {
            this.PlayerScore = this.playedGamemodus.getPoints();
            this.OpponentScore = 0;
            this.LoserScore = -this.playedGamemodus.getPoints();
        }
        else
        {
            //do nothing
        }
    }

    //make
    public void Misere()
    {
        int Opponent = 0;
        int Player = 0;
        int Loser = 0;
        //hier scores berekenen
        for (Button B: Buttonlist)
        {
            ColorStateList mList = B.getTextColors();
            int color = mList.getDefaultColor();

            //determine status
            switch(color)
            {
                case Color.YELLOW:
                    Player++;
                    break;
                case Color.RED:
                    Loser++;
                    break;
                default:
                    Opponent++;

            }
        }

        if(Player == 1 && Opponent == 3)
        {
            this.PlayerScore = this.playedGamemodus.getPoints();
            this.OpponentScore = -this.playedGamemodus.getPoints() / 30;
        }
        else if(Player == 2 && Opponent == 2)
        {
            this.PlayerScore = this.playedGamemodus.getPoints();
            this.OpponentScore = -this.playedGamemodus.getPoints() / 3;
        }
        else if(Player == 1 && Opponent == 2 && Loser == 1)
        {
            this.PlayerScore = this.playedGamemodus.getPoints();
            this.OpponentScore = 0;
            this.LoserScore = -this.playedGamemodus.getPoints();
        }
    }


//needs work (bepalen of hits gehaald zijn moet nog worden toegevoegd)
    //create a new score
    public void CreateNewScore()
    {
        //get player information
        for (Button B : Buttonlist)
        {
            Players player = null;
            //get/create correct player
            for (Players P:Game.PlayerList)
            {
                if(B.getText().toString() == P.GetName())
                {
                    player = P;
                    break;
                }
            }

            if(player != null)
            {
                int PointToGet = 0;

                ColorStateList mList = B.getTextColors();
                int color = mList.getDefaultColor();

                //determine status
                Gamestatus prstat;
                switch(color)
                {
                    case Color.YELLOW:
                        prstat = Gamestatus.Player;
                        break;
                    case Color.RED:
                        prstat = Gamestatus.Loser;
                        break;
                    default:
                        prstat = Gamestatus.Opponent;

                }

                //here determine wether they lost or not (still have to be added)
                if(prstat == Gamestatus.Player)
                {
                    if(Hits >= playedGamemodus.getHitsneeded())
                    {PointToGet = PlayerScore;}
                    else
                    {PointToGet = -PlayerScore;}
                }
                else if(prstat == Gamestatus.Opponent)
                {
                    if(Hits >= playedGamemodus.getHitsneeded())
                    {PointToGet = -OpponentScore;}
                    else
                    {PointToGet = OpponentScore;}
                }
                else
                {//loserscore here always loses
                    PointToGet = LoserScore;}

                Score score = new Score(PointToGet, prstat, player);

                Scorelist.add(score);
            }

        }
    }


}
