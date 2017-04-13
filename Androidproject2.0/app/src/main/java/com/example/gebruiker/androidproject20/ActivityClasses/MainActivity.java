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

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String[] country = {"Netherlands", "Japan", "Greece", "Colombia", "Canada", "Austria", "France", "Jamaica", "Kenya", "switserland", "Germany"};
    String[] capital = {"Amsterdam","Tokyo","Athens","Bogotá","Ottawa","Vienna","Paris","Kingston","Nairobi","Bern","Berlin"};

    public static final String EXTRA_MESSAGE = "Hello";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        adapter = new com.example.gebruiker.androidproject20.Adapter2(country, capital);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
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
