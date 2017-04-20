package com.example.gebruiker.androidproject20.ActivityClasses;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import com.example.gebruiker.androidproject20.Classes.Game;
import com.example.gebruiker.androidproject20.Classes.Subgame;
import com.example.gebruiker.androidproject20.Enums.Gamemodus;
import com.example.gebruiker.androidproject20.R;

import java.util.ArrayList;
//test123
public class ActivityGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //player names need to be loaded
        LoadContext();

        Spinner spinnerGame = (Spinner) findViewById(R.id.dd_gamemode);
        Spinner spinnerOver = (Spinner) findViewById(R.id.dd_overbod);
        Spinner spinnerSets = (Spinner) findViewById(R.id.dd_sets);

        ArrayList<String> GameStrings = new ArrayList<>();
        for (Gamemodus d : Gamemodus.values()) {
            GameStrings.add(d.toString());
        }

        // DROPDOWN1
        ArrayAdapter<String> spinnerGameAdapter = new ArrayAdapter<String>(ActivityGame.this,

                android.R.layout.simple_expandable_list_item_1, GameStrings);
        spinnerGameAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerGame.setAdapter(spinnerGameAdapter);

        // DROPDOWN2
        ArrayAdapter<String> spinnerOverAdapter = new ArrayAdapter<String>(ActivityGame.this,
                android.R.layout.simple_expandable_list_item_1, getResources().getStringArray(R.array.gamemodes_sets));
        spinnerOverAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerOver.setAdapter(spinnerOverAdapter);

        // DROPDOWN3
        ArrayAdapter<String> spinnerSetsAdapter = new ArrayAdapter<String>(ActivityGame.this,
                android.R.layout.simple_expandable_list_item_1, getResources().getStringArray(R.array.gamemodes_sets));
        spinnerSetsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSets.setAdapter(spinnerSetsAdapter);
    }

    public void PlayerButton1(View v)
    {
        //player changes color
        Button butt = (Button) (Button)findViewById(R.id.btnplayerGameOne); //findViewById(R.id.button1);
        GetColor(butt);
    }

    public void PlayerButton2(View v)
    {
        Button butt = (Button) findViewById(R.id.btnplayerGameTwo); //findViewById(R.id.button1);
        GetColor(butt);
    }

    public void PlayerButton3(View v)
    {
        Button butt = (Button) findViewById(R.id.btnplayerGameThree); //findViewById(R.id.button1);
        GetColor(butt);
    }

    public void PlayerButton4(View v)
    {
        Button butt = (Button) findViewById(R.id.btnplayerGameFour); //findViewById(R.id.button1);
        GetColor(butt);
    }


    public void EnterNewScore(View v)
    {
        ArrayList<Button> ButtonList = new ArrayList<>();
        //get button info
        Button button1 = (Button) findViewById(R.id.btnplayerGameOne); //findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.btnplayerGameTwo); //findViewById(R.id.button1);
        Button button3 = (Button) findViewById(R.id.btnplayerGameThree); //findViewById(R.id.button1);
        Button button4 = (Button) findViewById(R.id.btnplayerGameFour); //findViewById(R.id.button1);
        ButtonList.add(button1);
        ButtonList.add(button2);
        ButtonList.add(button3);
        ButtonList.add(button4);

        //get combobox info (voor ophalen van game modes en slagen)
        ArrayList<String> GameStrings = new ArrayList<>();

        String Gamemode1 = (String) findViewById(R.id.dd_gamemode).toString();
        String Hits= (String) findViewById(R.id.dd_sets).toString();

        //String Game1 = mySpinner1.getSelectedItem().toString();
        GameStrings.add(Gamemode1);
        //String Game2 = mySpinner2.getSelectedItem().toString();
        //GameStrings.add("Beter_rikken");

        //Spinner Hits =(Spinner) new Spinner(this); //findViewById(R.id.your_spinner);
        //String text = Hits.getSelectedItem().toString();
        int hits = Integer.parseInt(Hits); //Integer.parseInt(text);

        //voegd te benodigde gamemodes te aan een lijst om een nieuw subgame aan te maken
        ArrayList<Gamemodus> GameModes = new ArrayList<>();
        for (String T: GameStrings) {

                for (Gamemodus G : Gamemodus.values())
                {
                    if(T == G.toString())
                    {
                        GameModes.add(G);
                    }
                }
        }

        Subgame Sub = new Subgame(GameModes ,hits, ButtonList);
        Game.AddnewSubGame(Sub);

        try {
            //berekent nieuwe score
            Intent intent = new Intent(ActivityGame.this, ActivityScoreboard.class);
            startActivity(intent);
        }
        catch (Exception e)
        {
            e.toString();
        }
    }


    //no button input methods
    public void LoadContext()
    {
        //give the player names
        Button button1 = (Button) findViewById(R.id.btnplayerGameOne); //need to be gotten by id
        Button button2 = (Button) findViewById(R.id.btnplayerGameTwo);
        Button button3 = (Button) findViewById(R.id.btnplayerGameThree);
        Button button4 = (Button) findViewById(R.id.btnplayerGameFour);

        button1.setText(Game.PlayerList.get(0).GetName());
        button2.setText(Game.PlayerList.get(1).GetName());
        button3.setText(Game.PlayerList.get(2).GetName());
        button4.setText(Game.PlayerList.get(3).GetName());
    }

    public void GetColor(Button prbutt)
    {
        ColorStateList mList = prbutt.getTextColors();
        int color = mList.getDefaultColor();

        switch(color)
        {
            case Color.YELLOW:
                prbutt.setTextColor(Color.RED);
                break;
            case Color.RED:
                prbutt.setTextColor(Color.BLACK);
                break;
            default:
                prbutt.setTextColor(Color.YELLOW);

        }

    }
}
