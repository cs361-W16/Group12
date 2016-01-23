package models;

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
 * Created by Mike on 1/22/2016.
 */
public class Move {


    @Test
    //Hardcoded, preset a state of game
    public void move()

    {
        String[] deck = {};
        String[] column1 = {"2H","3S","4H","5C"};
        String[] column2 = {}; // Test that this column has nothing in it, but will after more code
        String[] column3 = {"4S","5D","1S","3S"};
        String[] column4 = {"6C","3C","9D","1H"};
        GameState game = new GameState(deck, column1, column2, column3, column4);
        if (game.column2.order == null)
        {
            System.out.println("Column is empty"); // At this point top card of columns are 5C, 3S, 1H

        }


    }
    @Test
    public static void move(String[] args)
    {

        String[] column1 = {"2H","3S","4H","5C"};
        String[] column2 = new int[game.column1.length]; // Test that this column has nothing in it, but will after more code
        String[] column3 = {"4S","5D","1S","3S"};
        String[] column4 = {"6C","3C","9D","1H"};

        if (game.column2.order == null) {
            System.out.println("Column is empty"); // At this point top card of columns are 5C, 3S, 1H
            // attempt to move last element of array Column_1 to Column_2
            for (int i = 0; i > game.column1.length; i++)
            {
                game.column1[i] = game.column2[i];
            }
            if (game.column1.order[game.controlumn1.spaceTaken-1 == "4H"])
            {
                System.out.println("Test successful");

            }
            else
            {
                System.out.print("Fail");
            }




        }



    }








}
