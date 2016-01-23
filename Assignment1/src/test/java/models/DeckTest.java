package models;

import models.Column;
import models.Deck;
import models.GameState;
import ninja.NinjaDocTester;
import org.junit.Test;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

/**
 * Created by Isaac Chan on 1/22/2016.
 */
public class DeckTest extends NinjaDocTester {
    @Test
    public void testShuffle(){
        String[] testDeck1 = {"1","2","3"};
        String[] testDeck2 = {"1","2","3"};
        assert(Arrays.equals(testDeck1,testDeck2));

        int N = 3;
        for (int i = 0; i < N; i++) {
            int j = i + (int) (Math.random() * (N - i));
            String swap = testDeck2[i];
            testDeck2[i] = testDeck2[j];
            testDeck2[j] = swap;
        }
        assertFalse(Arrays.equals(testDeck1,testDeck2));
    }
}
