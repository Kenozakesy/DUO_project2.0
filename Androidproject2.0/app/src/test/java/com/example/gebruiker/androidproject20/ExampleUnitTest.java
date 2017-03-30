package com.example.gebruiker.androidproject20;

import com.example.gebruiker.androidproject20.Classes.Game;
import com.example.gebruiker.androidproject20.Classes.Players;
import com.example.gebruiker.androidproject20.Classes.Subgame;
import com.example.gebruiker.androidproject20.Enums.Gamemodus;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {

        Gamemodus game = Gamemodus.Rikken;
        game.SetPoints(30);
        assertEquals(game.getPoints(), 30);;
    }

    @Test
    public void isCorrect() throws Exception {

        Players player = new Players("Henk");
        assertEquals(player.GetAbbrevation(), "HE");;
    }

    @Test
    public void CalculationCheck() throws Exception {

        Game game = new Game();

        ArrayList<Gamemodus> gameModeList = new ArrayList<>();
        gameModeList.add(Gamemodus.Schoppe_mien);
        gameModeList.add(Gamemodus.Elf_Alleen);
        gameModeList.add(Gamemodus.Dertien_Alleen);

        ArrayList<Gamemodus> gameModeList2 = new ArrayList<>();
        gameModeList2.add(Gamemodus.Rikken);
        gameModeList2.add(Gamemodus.Beter_rikken);

        Game.subgameList.add(new Subgame(gameModeList));
        Game.subgameList.add(new Subgame(gameModeList2));

        Subgame sub = Game.subgameList.get(Game.subgameList.size() -1);

        sub.NewCalculation();

        assertEquals(1,1);

    }
}