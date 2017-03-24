package com.example.gebruiker.androidproject20;

import com.example.gebruiker.androidproject20.Classes.Players;
import com.example.gebruiker.androidproject20.Enums.Gamemodus;

import org.junit.Test;

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
}