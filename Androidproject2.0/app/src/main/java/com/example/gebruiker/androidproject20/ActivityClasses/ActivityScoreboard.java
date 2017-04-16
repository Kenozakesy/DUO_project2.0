package com.example.gebruiker.androidproject20.ActivityClasses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.gebruiker.androidproject20.Classes.Game;
import com.example.gebruiker.androidproject20.Classes.GameClassArray;
import com.example.gebruiker.androidproject20.Classes.Score;
import com.example.gebruiker.androidproject20.Classes.Subgame;
import com.example.gebruiker.androidproject20.R;

public class ActivityScoreboard extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String[] ar_count = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    String[] ar_player_one = {"10","20","30","40","50","60","70","80","90","100","110"};
    String[] ar_player_two = {"10","20","30","40","50","60","70","80","90","100","110"};
    String[] ar_player_three = {"10","20","30","40","50","60","70","80","90","100","110"};
    String[] ar_player_four = {"10","20","30","40","50","60","70","80","90","100","110"};

    GameClassArray[] gamesplayed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoreboard);
            //correct uitlees iets maken
        for (Subgame S: Game.subgameList) {

            int[] score = new int[4];

            for (Score Sc: S.GetScoreList())
            {
                for (int i = 0; i < 3; i++)
                {
                    score[i] = Sc.GetScore();
                }
            }

            GameClassArray Arrayclass = new GameClassArray(S.Getnumber(), score[0] + " " + S.GetPlayedgamemodus().getAbbrevation(), score[1] + " " + S.GetPlayedgamemodus().getAbbrevation(), score[2] + " " + S.GetPlayedgamemodus().getAbbrevation(), score[3] + " " + S.GetPlayedgamemodus().getAbbrevation());
        }


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        adapter = new com.example.gebruiker.androidproject20.Adapter2(ar_count, ar_player_one, ar_player_two, ar_player_three, ar_player_four);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        //here comes code to fill in the scoreboard
    }

    public void FinishGame(View v)
    {
        //used to finish up the current game (or come back later)
    }

    public void CreatNewSubgameScore(View v)
    {
        //goes to ActivityGame form
        Intent intent = new Intent(ActivityScoreboard.this, ActivityGame.class);
        startActivity(intent);
    }


}
