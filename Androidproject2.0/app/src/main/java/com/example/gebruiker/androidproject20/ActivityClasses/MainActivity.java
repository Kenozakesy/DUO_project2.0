package com.example.gebruiker.androidproject20.ActivityClasses;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;

import com.example.gebruiker.androidproject20.Classes.Game;
import com.example.gebruiker.androidproject20.R;

import java.util.ArrayList;
import java.util.ResourceBundle;

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
