package controllers;

/**
 * Created by Michael on 1/22/2016.
 */

import models.Deck;
import ninja.NinjaDocTester;

//package controllers;

import org.junit.Test;

import ninja.NinjaDocTester;
import org.doctester.testbrowser.Request;
import org.doctester.testbrowser.Response;
import org.hamcrest.CoreMatchers;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ModelTest extends NinjaDocTester {
    @Test
    public void testDeck(){ //test the default deck constructor
        Deck test = new Deck();
        assertEquals(test.numCards, 52);
        for(int i = 0; i < test.numCards; i++){
            System.out.print(test.deckContains[i]);
        }
    }

    @Test
    public void testDeckCustom(){
        String[] customDeck = {"AH", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "JH", "QH", "KH"};
        Deck test = new Deck(customDeck);
        assertEquals(13, test.numCards);
        for(int i = 0; i < test.numCards; i++){
            System.out.print(test.deckContains[i]);
        }
    }
}
