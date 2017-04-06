package com.example.gebruiker.androidproject20.ActivityClasses;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.example.gebruiker.androidproject20.Classes.Game;
import com.example.gebruiker.androidproject20.R;

public class ActivityGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //player names need to be loaded
        LoadContext();
    }

    public void PlayerButton1(View v)
    {
        //player changes color
        Button butt = (Button) new Button(this); //findViewById(R.id.button1);
        GetColor(butt);
    }

    public void PlayerButton2(View v)
    {
        Button butt = (Button) new Button(this); //findViewById(R.id.button1);
        GetColor(butt);
    }

    public void PlayerButton3(View v)
    {
        Button butt = (Button) new Button(this); //findViewById(R.id.button1);
        GetColor(butt);
    }

    public void PlayerButton4(View v)
    {
        Button butt = (Button) new Button(this); //findViewById(R.id.button1);
        GetColor(butt);
    }

    public void EnterNewScore(View v)
    {
        Spinner mySpinner1=(Spinner) new Spinner(this); //findViewById(R.id.your_spinner);
        Spinner mySpinner2=(Spinner) new Spinner(this); //findViewById(R.id.your_spinner);
        Spinner Hits =(Spinner) new Spinner(this); //findViewById(R.id.your_spinner);

        String Game1 = mySpinner1.getSelectedItem().toString();
        String Game2 = mySpinner2.getSelectedItem().toString();

        String text = Hits.getSelectedItem().toString();
        int hits = Integer.parseInt(text);






        //player changes color
    }


    //no button input methods
    public void LoadContext()
    {
        //give the player names
        Button button1 = (Button) new Button(this); //need to be gotten by id
        Button button2 = (Button) new Button(this);
        Button button3 = (Button) new Button(this);
        Button button4 = (Button) new Button(this);

        button1.setText(Game.PlayerList.get(0).GetName());
        button2.setText(Game.PlayerList.get(1).GetName());
        button3.setText(Game.PlayerList.get(2).GetName());
        button4.setText(Game.PlayerList.get(3).GetName());
    }

    public void GetColor(Button prbutt)
    {
        if(prbutt.getSolidColor() == Color.YELLOW)
        {
            prbutt.setBackgroundColor(Color.GRAY);
        }
        else
        {
            prbutt.setBackgroundColor(Color.YELLOW);
        }
    }
}
