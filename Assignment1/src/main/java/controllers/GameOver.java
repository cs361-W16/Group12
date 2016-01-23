package controllers;

import models.Column;
import models.GameState;

/**
 * Created by Michael on 1/22/2016.
 */
public class GameOver {//0 is loss 1 is win 2 is pending
    static int pending = 2;
    static int win = 1;
    static int loss = 0;
   public static int over(GameState game){
       if(game.deck.numCards == 0){
           if(game.column1.spaceTaken != 1 || game.column2.spaceTaken != 1 || game.column3.spaceTaken != 1 || game.column4.spaceTaken != 1){
               if(compareEndSuits(game.column1,game.column2) == 1 || compareEndSuits(game.column1,game.column3) == 1 || compareEndSuits(game.column1, game.column4) == 1){// compares column one to the rest of them
                    return pending;// if there are any same suits return a pending
               }
               if(compareEndSuits(game.column2,game.column3) == 1 || compareEndSuits(game.column2,game.column4) == 1){//compares col2 with the rest
                   return pending;
               }
               if(compareEndSuits(game.column3, game.column4) == 1){//compares col 3 to 4
                   return pending;
               }
               return loss;
           }
           return win;
       }
       return pending;
   }
    public static int compareEndSuits(Column col1, Column col2){
        char cCol1;
        char cCol2;
        cCol1 = col1.order[col1.spaceTaken-1].charAt(col1.order[col1.spaceTaken-1].length()-1);//finds char at end string at end of column
        cCol2 = col2.order[col2.spaceTaken-1].charAt(col2.order[col2.spaceTaken-1].length()-1);
        if (cCol1 == cCol2){//finds same suit
            return 1;
        }
        else{
            return 0;
        }
    }
}
