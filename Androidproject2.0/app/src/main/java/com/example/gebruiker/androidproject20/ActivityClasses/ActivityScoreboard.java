package com.example.gebruiker.androidproject20.ActivityClasses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.gebruiker.androidproject20.R;

public class ActivityScoreboard extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String[] country = {"Netherlands", "Japan", "Greece", "Colombia", "Canada", "Austria", "France", "Jamaica", "Kenya", "switserland", "Germany"};
    String[] capital = {"Amsterdam","Tokyo","Athens","Bogotá","Ottawa","Vienna","Paris","Kingston","Nairobi","Bern","Berlin"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoreboard);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        adapter = new com.example.gebruiker.androidproject20.Adapter2(country, capital);
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
