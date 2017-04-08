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

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<ListProvider> arrayList = new ArrayList<ListProvider>();
    String[] Count, Player_one, Player_two, Player_three, Player_four;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        Count = getRecources().getStringArray(R.array.count_games);
        Player_one = getRecources().getStringArray(R.array.count_player_one);
        Player_two = getRecources().getStringArray(R.array.count_player_two);
        Player_three = getRecources().getStringArray(R.array.count_player_three);
        Player_four = getRecources().getStringArray(R.array.count_player_four);
        int count = 0;
        for(String COUNT : Count){
            ListProvider listProvider = new ListProvider(COUNT,Player_one[count],Player_two[count],Player_three[count],Player_four[count]);
            arrayList.add(listProvider);
            count++;
        }

        adapter = new RecyclerAdapter(arrayList);
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
