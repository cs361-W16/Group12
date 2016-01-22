package models;
/**
 * Created by Michael on 1/22/2016.
 */

import models.Column;
import models.Deck;
import models.GameState;
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
    public void testColumnCustom(){//non default column constructor
        String[] fillColumn = {"AH", "2H", "3H", "4H"};
        Column column1 = new Column(fillColumn);
        assertEquals(14, column1.spaceAvail);
        assertEquals(4, column1.spaceTaken);
        for(int i = 0; i < column1.spaceAvail; i++){
            System.out.print(column1.order[i]);
        }
    }
    String[] fullDeck = {"AH", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "JH", "QH", "KH",
                "AD", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D", "JD", "QD", "KD",
                "AC", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "JC", "QC", "KC",
                "AS", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "JS", "QS", "KS",};
    @Test
    public void testGameState(){//default constructor for gamestate
        GameState game = new GameState();
        assertEquals(game.deck.numCards, 52);
        assertArrayEquals(fullDeck, game.deck.deckContains);

        assertEquals(game.column1.spaceAvail, 14);
        assertEquals(game.column2.spaceAvail, 14);
        assertEquals(game.column3.spaceAvail, 14);
        assertEquals(game.column4.spaceAvail, 14);

        assertEquals(game.column1.spaceTaken, 0);
        assertEquals(game.column1.spaceTaken, 0);
        assertEquals(game.column1.spaceTaken, 0);
        assertEquals(game.column1.spaceTaken, 0);
    }

    @Test
    public void testGameStateCustom(){
        String[] columnStrings = {"AC", "2C", "3C", "4C", "5C"};
        String[] customDeck = {"AS", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "JS", "QS", "KS"};
        GameState game = new GameState(customDeck,columnStrings,columnStrings,columnStrings,columnStrings);
        assertEquals(game.deck.numCards, 13);
        assertArrayEquals(customDeck, game.deck.deckContains);

        assertEquals(game.column1.spaceAvail, 14);
        assertEquals(game.column2.spaceAvail, 14);
        assertEquals(game.column3.spaceAvail, 14);
        assertEquals(game.column4.spaceAvail, 14);

        assertEquals(game.column1.spaceTaken, 5);
        assertEquals(game.column1.spaceTaken, 5);
        assertEquals(game.column1.spaceTaken, 5);
        assertEquals(game.column1.spaceTaken, 5);
    }
}
