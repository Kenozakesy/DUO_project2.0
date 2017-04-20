package com.example.gebruiker.androidproject20.ActivityClasses;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.Adapter;


import com.example.gebruiker.androidproject20.Classes.Game;
import com.example.gebruiker.androidproject20.R;

public class MainActivity extends Activity {



    public static final String EXTRA_MESSAGE = "Hello";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
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
//        Intent intent = new Intent(MainActivity.this, Show.class);
//        startActivity(intent);
    }



}
