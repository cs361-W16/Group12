package models;

/**
 * Created by Isaac Chan on 1/20/2016.
 * Modified by Michael Lee 1/22/2016.
 */
public class Deck {
    //deck variables
    public String[] deckContains;
    public int numCards;

    //default constructor makes a full deck of 52 cards
    public Deck(){
        numCards = 52;
        deckContains = new String[numCards];

        String[] fullDeck = {"AH", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "JH", "QH", "KH",
                "AD", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D", "JD", "QD", "KD",
                "AC", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "JC", "QC", "KC",
                "AS", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "JS", "QS", "KS",};

        for(int i = 0; i < numCards; i++){
            deckContains[i] = fullDeck[i]; // can input the shuffle before this though
        }
    }
    //constructor to set certain deck elements must specify what cards are in deck
    public Deck(String[] customDeck){
        numCards = customDeck.length;
        deckContains = new String[numCards];
        for(int i = 0; i<numCards; i++){
            deckContains[i] = customDeck[i];
        }
    }

}


/*
public class Deck {

    //Deck constructor
    public Deck( int numOfCardsInDeck) {
        currentCardCounter = 0;
        maxNumOfCards = numOfCardsInDeck;
        Shuffle();
    }

    //Hardcoded array of 52 cards
    String[] fullDeck = {"AH", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "JH", "QH", "KH",
            "AD", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D", "JD", "QD", "KD",
            "AC", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "JC", "QC", "KC",
            "AS", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "JS", "QS", "KS",};

    public int maxNumOfCards;
    public int currentCardCounter;

    //shuffles the full deck of cards
    void Shuffle() {
        for (int i = 0; i < maxNumOfCards; i++) {
            int j = i + (int) (Math.random() * (maxNumOfCards - i));
            String swap = fullDeck[i];
            fullDeck[i] = fullDeck[j];
            fullDeck[j] = swap;
        }
    }

    //method is called when deal button is pressed
    //only runs if 52 cards have not been dealt yet.
    public void drawFromDeck( String[] col) {
        for ( int i = 0; i < maxNumOfCards && currentCardCounter < maxNumOfCards; i++ ) {
            if (col[i] == null) {
                col[i] = fullDeck[currentCardCounter];
                currentCardCounter++;
                return;
            }
        }
    }
}*/