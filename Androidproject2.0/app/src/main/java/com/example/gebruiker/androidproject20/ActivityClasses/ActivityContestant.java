package com.example.gebruiker.androidproject20.ActivityClasses;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.example.gebruiker.androidproject20.Classes.Game;
import com.example.gebruiker.androidproject20.Classes.Players;
import com.example.gebruiker.androidproject20.R;

import java.util.ArrayList;

public class ActivityContestant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_contestant);
    }

    public void CreateNewgame(View v)
    {
        //first get all contestants
        String NamePlayer1 = ((TextView)findViewById(R.id.ptPlayerOne)).getText().toString();
        String NamePlayer2 = ((TextView)findViewById(R.id.ptPlayerTwo)).getText().toString();
        String NamePlayer3 = ((TextView)findViewById(R.id.ptPlayerThree)).getText().toString();
        String NamePlayer4 = ((TextView)findViewById(R.id.ptPlayerFour)).getText().toString();

        if(NamePlayer1.equals("") || NamePlayer1.length() < 3 || NamePlayer2.equals("") || NamePlayer2.length() < 3|| NamePlayer3.equals("") || NamePlayer3.length() < 3 || NamePlayer4.equals("") || NamePlayer4.length() < 3)
        {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(ActivityContestant.this);
            builder1.setMessage("Not all names have been filled in correctly");
            builder1.setCancelable(true);

            builder1.setPositiveButton(
                    "Got it",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });

            AlertDialog alert11 = builder1.create();
            alert11.show();
        }
        else
        {
            if(NamePlayer1.equals(NamePlayer2) || NamePlayer3.equals(NamePlayer4) || NamePlayer1.equals(NamePlayer3) || NamePlayer2.equals(NamePlayer4)
                    || NamePlayer1.equals(NamePlayer4) || NamePlayer2.equals(NamePlayer3))
            {
                AlertDialog.Builder builder1 = new AlertDialog.Builder(ActivityContestant.this);
                builder1.setMessage("Some names are the same please change this");
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "Got it",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
            else {

                try {
                    //make them into classes & add them
                    ArrayList<Players> playerslist = new ArrayList<>();
                    playerslist.add(new Players(NamePlayer1));
                    playerslist.add(new Players(NamePlayer2));
                    playerslist.add(new Players(NamePlayer3));
                    playerslist.add(new Players(NamePlayer4));

                    Game.Addnewplayer(playerslist);
                } catch (Exception e) {
                    e.toString();
                }

                //start a new game
                Intent intent = new Intent(ActivityContestant.this, ActivityScoreboard.class);
                startActivity(intent);
            }

        }
    }

    public void Goback(TextView v)
    {
        Intent intent = new Intent(ActivityContestant.this, MainActivity.class);
        startActivity(intent);
    }
}
