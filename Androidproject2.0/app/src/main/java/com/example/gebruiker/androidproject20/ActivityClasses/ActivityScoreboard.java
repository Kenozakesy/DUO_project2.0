package com.example.gebruiker.androidproject20.ActivityClasses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.gebruiker.androidproject20.R;

public class ActivityScoreboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoreboar);

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
