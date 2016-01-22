package controllers;
/**
 * Created by Michael on 1/22/2016.
 */

import models.Column;
import models.Deck;
import ninja.NinjaDocTester;

import org.junit.Test;

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
    public void testDeckCustom(){ //test the deck with a custom set
        String[] customDeck = {"AH", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "JH", "QH", "KH"};
        Deck test = new Deck(customDeck);
        assertEquals(13, test.numCards);
        for(int i = 0; i < test.numCards; i++){
            System.out.print(test.deckContains[i]);
        }
    }

    @Test
    public void testColumn(){//default column constructor
        Column column1 = new Column();
        assertEquals(14, column1.spaceAvail);
        assertEquals(0, column1.spaceTaken);
    }

    @Test
    public void testColumnCustom(){//non default column cosntructor
        String[] fillColumn = {"AH", "2H", "3H", "4H"};
        Column column1 = new Column(fillColumn);
        assertEquals(14, column1.spaceAvail);
        assertEquals(4, column1.spaceTaken);
        for(int i = 0; i < column1.spaceAvail; i++){
            System.out.print(column1.order[i]);
        }
    }

}
