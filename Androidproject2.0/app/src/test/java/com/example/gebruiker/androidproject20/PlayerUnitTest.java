package com.example.gebruiker.androidproject20;

import android.widget.Button;

import com.example.gebruiker.androidproject20.ActivityClasses.MainActivity;
import com.example.gebruiker.androidproject20.Classes.Game;
import com.example.gebruiker.androidproject20.Classes.Players;
import com.example.gebruiker.androidproject20.Classes.Subgame;
import com.example.gebruiker.androidproject20.Enums.Gamemodus;

import org.junit.Test;

import java.util.ArrayList;


import static org.junit.Assert.assertEquals;

/**
 * Created by Gebruiker on 6-4-2017.
 */

public class PlayerUnitTest {

    @Test
    public void isCorrect() throws Exception {

        Game.PlayerList.clear();
        Game.subgameList.clear();

        ArrayList<Gamemodus> gamelist = new ArrayList<>();
        gamelist.add(Gamemodus.Rikken);
        gamelist.add(Gamemodus.Beter_rikken);

        ArrayList<Button> buttonlist = new ArrayList<>();

        //Players Test = new Players("Henk");
        Game.PlayerList.add(new Players("Henk1"));
        Game.PlayerList.add(new Players("Henk2"));
        Game.PlayerList.add(new Players("Henk3"));
        Game.PlayerList.add(new Players("Henk4"));


        Game.subgameList.add(new Subgame(gamelist, 10, buttonlist));
        for (Subgame S:
             Game.subgameList) {

            S.NewCalculation();

        }



    }
}
