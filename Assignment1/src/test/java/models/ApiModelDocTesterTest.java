package models;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import ninja.NinjaDocTester;
import org.doctester.testbrowser.Request;
import org.doctester.testbrowser.Response;
import org.hamcrest.CoreMatchers;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Isaac Chan on 1/21/2016.
 */
public class ApiModelDocTesterTest extends NinjaDocTester {
    @Test
    public void testDeck() {
        String[] deck = {"AH", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "JH", "QH", "KH",
                "AD", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D", "JD", "QD", "KD",
                "AC", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "JC", "QC", "KC",
                "AS", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "JS", "QS", "KS"};
        assertThat(deck[0], containsString("AH"));
    }

    @Test
    public void testExch() {
        String[] testArr = {"this","really","sucks"};
        int i = 1;
        int j = 2;
        String swap = testArr[i];
        testArr[i] = testArr[j];
        testArr[j] = swap;
        assertThat(testArr[2], containsString("really"));
        assertThat(testArr[1], containsString("sucks"));
    }

    @Test
    //I don't know how to write this test to pass every time due to the random results...
    public void testShuffle(){
        String[] testArr = {"this","really","sucks"};

        int N = testArr.length;
        for(int i = 0; i < N; i++){
            int j = i + (int) (Math.random() * (N-i));
            int k = i + (int) (Math.random() * (N-i));
            String swap = testArr[j];
            testArr[j] = testArr[k];
            testArr[k] = swap;
        }
        assertThat(testArr[0], containsString("this"));
        assertThat(testArr[1], containsString("sucks"));
        assertThat(testArr[2], containsString("really"));
    }
}
