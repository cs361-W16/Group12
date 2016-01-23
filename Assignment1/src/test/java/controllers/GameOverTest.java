package controllers;


import models.Column;
import models.GameState;
import org.junit.Test;

import ninja.NinjaDocTester;
import org.hamcrest.CoreMatchers;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by Michael on 1/22/2016.
 */

public class GameOverTest extends NinjaDocTester{
    @Test
    public void newGame(){
        GameState game = new GameState(); //create a blank game
        assertEquals(2, GameOver.over(game));//test blank game returns pending result (2) no win or loss yet
    }

    @Test
    public void winGame(){
        String[] deck = {};
        String[] column1 = {"AC"};
        String[] column2 = {"AD"};
        String[] column3 = {"AS"};
        String[] column4 = {"AH"};
        GameState game = new GameState(deck, column1, column2, column3, column4);
        assertEquals(1, GameOver.over(game));
    }

    @Test
    public void lossGame(){// top cards are not cards of the same suit
        String[] deck = {};
        String[] column1 = {"AC", "2H", "3H"};
        String[] column2 = {"AD", "2D", "3D"};
        String[] column3 = {"AS", "2C", "3C"};
        String[] column4 = {"AH", "2S", "3S"};
        GameState game = new GameState(deck, column1, column2, column3, column4);
        assertEquals(0, GameOver.over(game));
    }

    @Test
    public void lossGame2(){// top cards are not cards of the same suit and one suit has A
        String[] deck = {};
        String[] column1 = {"AC"};
        String[] column2 = {"AD", "2D", "3D"};
        String[] column3 = {"AS", "2C", "3H"};
        String[] column4 = {"AH", "2S", "3S"};
        GameState game = new GameState(deck, column1, column2, column3, column4);
        assertEquals(0, GameOver.over(game));
    }

    @Test
    public void gameInProg(){
        String[] deck = {"AH", "2H", "3H", "4H", "5H", "6H", "7H", "8H"};
        String[] column = {"2D", "3D"};
        GameState game = new GameState(deck, column, column, column, column);
        assertEquals(2, GameOver.over(game));
    }

    @Test
    public void gameInProgEmptyDeck(){
        String[] deck = {};
        String[] column1 = {"2D", "AD"};
        String[] column2 = {"2D", "4H"};
        String[] column3 = {"2D", "3C"};
        String[] column4 = {"2D", "10C"};
        GameState game = new GameState(deck, column1, column2, column3, column4);
        assertEquals(2, GameOver.over(game));
    }

    @Test
    public void compareSuitsTest(){
        String[] column1 = {"2D", "AD"};
        String[] column2 = {"2D", "4H"};
        Column col1 = new Column(column1);
        Column col2 = new Column(column2);
        assertEquals(0,GameOver.compareEndSuits(col1,col2));
    }

    @Test
    public void compareSuitsTestSame(){
        String[] column1 = {"2D", "AD"};
        String[] column2 = {"2D", "4D"};
        Column col1 = new Column(column1);
        Column col2 = new Column(column2);
        assertEquals(1,GameOver.compareEndSuits(col1,col2));
    }
}
