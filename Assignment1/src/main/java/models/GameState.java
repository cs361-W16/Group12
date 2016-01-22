package models;
import models.Deck;
import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;

/**
 * Created by isaac on 1/21/2016.
 */
public class GameState {
    public static void main(String[] args) {

        int numOfCardsInDeck = 52;

        //initialize 4 columns of 13 spots each
        String col1[] = new String[numOfCardsInDeck / 4];
        String col2[] = new String[numOfCardsInDeck / 4];
        String col3[] = new String[numOfCardsInDeck / 4];
        String col4[] = new String[numOfCardsInDeck / 4];

        //initializes the deck of shuffled cards
        Deck aDeck = new Deck(numOfCardsInDeck);

        //run these 4 lines on button press
        //while (pressedButton != 'close program') {
            aDeck.drawFromDeck(col1);
            aDeck.drawFromDeck(col2);
            aDeck.drawFromDeck(col3);
            aDeck.drawFromDeck(col4);
        //}
    }
}