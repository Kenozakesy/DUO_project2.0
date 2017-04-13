package com.example.gebruiker.androidproject20.ActivityClasses;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.gebruiker.androidproject20.Classes.Game;
import com.example.gebruiker.androidproject20.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void StartNewGame(View v)
    {
        Game.Reset();

        Intent intent = new Intent(MainActivity.this, ActivityContestant.class);
        startActivity(intent);
    }

    public void ContinueWithGame(View v)
    {
        //not implemented and probarly not going to
    }

    public void SeeScoreBoard(View v)
    {
        //Opens a view to a scoreboard
    }



}
