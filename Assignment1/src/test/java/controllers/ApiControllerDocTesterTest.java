/**
 * Copyright (C) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;


import org.junit.Test;
import models.Deck;

import ninja.NinjaDocTester;
import org.doctester.testbrowser.Request;
import org.doctester.testbrowser.Response;
import org.hamcrest.CoreMatchers;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class ApiControllerDocTesterTest extends NinjaDocTester {

    String URL_INDEX = "/";
    String URL_ACES_UP = "/AcesUp";

    @Test
    public void testGetIndex() {

        Response response = makeRequest(
                Request.GET().url(
                        testServerUrl().path(URL_INDEX)));

        assertThat(response.payload, containsString("Hello World!"));
        assertThat(response.payload, containsString("BAM!"));
    }

    @Test
    public void testAcesUp() {
        Response response = makeRequest(
                Request.GET().url(
                        testServerUrl().path(URL_ACES_UP)));

        assertThat(response.payload, containsString("Aces Up"));
        assertThat(response.payload, containsString("columnOfCards"));
    }

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
