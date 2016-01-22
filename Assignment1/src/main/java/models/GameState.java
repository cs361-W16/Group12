package models;
import models.Deck;
import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;

/**
 * Created by isaac on 1/21/2016.
 * Modified by michael 1/22/2016.
 */
public class GameState{
    public Deck deck;
    public Column column1;
    public Column column2;
    public Column column3;
    public Column column4;

    //default constructor starts an empty game
    public GameState(){
        deck = new Deck();
        column1 = new Column();
        column2 = new Column();
        column3 = new Column();
        column4 = new Column();
    }
    //non default constructor sets up a deck at a stage in the game
    public GameState(String[] sDeck, String[] sColumn1, String[] sColumn2, String[] sColumn3, String[] sColumn4){
        deck = new Deck(sDeck);
        column1 = new Column(sColumn1);
        column2 = new Column(sColumn2);
        column3 = new Column(sColumn3);
        column4 = new Column(sColumn4);
    }

}

/*
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
}*/