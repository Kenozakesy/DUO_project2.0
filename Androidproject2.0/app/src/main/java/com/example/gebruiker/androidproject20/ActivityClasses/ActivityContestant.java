package com.example.gebruiker.androidproject20.ActivityClasses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.gebruiker.androidproject20.Classes.Game;
import com.example.gebruiker.androidproject20.Classes.Players;
import com.example.gebruiker.androidproject20.R;

import java.util.ArrayList;

public class ActivityContestant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contestant);
    }

    public void CreateNewgame(View v)
    {
        //first get all contestants
        String NamePlayer1 = "Henk";   //(TextView)findViewById(R.id.edittext);
        String NamePlayer2 = "Kees";   //(TextView)findViewById(R.id.edittext);
        String NamePlayer3 = "Rikkert";//(TextView)findViewById(R.id.edittext);
        String NamePlayer4 = "Wickert";//(TextView)findViewById(R.id.edittext);

        //make them into classes & add them
        ArrayList<Players> playerslist = new ArrayList<>();
        playerslist.add(new Players(NamePlayer1));
        playerslist.add(new Players(NamePlayer2));
        playerslist.add(new Players(NamePlayer3));
        playerslist.add(new Players(NamePlayer4));

        Game.Addnewplayer(playerslist);

        //start a new game
        Intent intent = new Intent(ActivityContestant.this, ActivityScoreboard.class);
        startActivity(intent);
    }
}
