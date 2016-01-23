package controllers;

import models.GameState;
import models.Column;
/**
 * Created by Derek Wong on 1/21/2016.
 */
 
 public class Remove {
	 public static void remove(GameState game){
	// public static void remove(String[] column1,String[] column2,String[] column3,String[] column4){
		 
		 String valueOne, valueTwo, valueThree, valueFour;
		 int index1, index2, index3, index4;
		 char s1, s2, s3, s4, v1, v2, v3, v4;
		 
		 //Find the top card of each columns
		 
		 valueOne = game.column1.order[game.column1.spaceTaken-1];
		 valueTwo = game.column2.order[game.column2.spaceTaken-1];
		 valueThree = game.column3.order[game.column3.spaceTaken-1];
		 valueFour = game.column4.order[game.column4.spaceTaken-1];

/* 		 for (int i=0; i > 13; i++){			 
			 if (column1[i] != null){
				 valueOne = column1[i];
				 index1 = i;
				 break;
			 }	 
		 }
		 for (int i=0; i > 13; i++){			 
			 if (column2[i] != null){
				 valueTwo = column2[i];
				 index2 = i;
				 break;
			 }	 
		 }
		 for (int i=0; i > 13; i++){			 
			 if (column3[i] != null){
				 valueThree = column3[i];
				 index3 = i;
				 break;
			 }	 
		 }
		 for (int i=0; i > 13; i++){			 
			 if (column4[i] != null){
				 valueFour = column4[i];
				 index4 = i;
				 break;
			 }	 
		 } */
		 
		 //get the suit of each card
		 s1 = valueOne.charAt(1);
		 s2 = valueTwo.charAt(1);
		 s3 = valueThree.charAt(1);
		 s4 = valueFour.charAt(1);
		 
		 //get the value of each card
		 v1 = valueOne.charAt(0);
		 v2 = valueTwo.charAt(0);
		 v3 = valueThree.charAt(0);
		 v4 = valueFour.charAt(0);
		 
		 //check if there is matching suit
		 //if there is matching suit, then remove the lowest value card
		 if (s1 == s2){
			 if (v1 < v2){
				 game.column1.order[game.column1.spaceTaken-1] = " ";
				 game.column1.spaceTaken--;
			 }
			 else{
				 game.column2.order[game.column2.spaceTaken-1] = " ";
				 game.column2.spaceTaken--;
			 }
		 }
		 else if(s1 == s3){
			 if (v1 < v3){
				 game.column1.order[game.column1.spaceTaken-1] = " ";
				 game.column1.spaceTaken--;
			 }
			 else{
				 game.column3.order[game.column3.spaceTaken-1] = " ";
				 game.column3.spaceTaken--;
			 }
		 }
		 else if(s1 == s4){
			 if (v1 < v4){
				 game.column1.order[game.column1.spaceTaken-1] = " ";
				 game.column1.spaceTaken--;
			 }
			 else{
				 game.column4.order[game.column4.spaceTaken-1] = " ";
				 game.column4.spaceTaken--;
			 }
		 }
		 else if(s2 == s3){
			 if (v2 < v3){
				 game.column2.order[game.column2.spaceTaken-1] = " ";
				 game.column2.spaceTaken--;
			 }
			 else{
				 game.column3.order[game.column3.spaceTaken-1] = " ";
				 game.column3.spaceTaken--;
			 }
		 }
		 else if(s2 == s4){
			 if (v2 < v4){
				 game.column2.order[game.column2.spaceTaken-1] = " ";
				 game.column2.spaceTaken--;
			 }
			 else{
				 game.column4.order[game.column4.spaceTaken-1] = " ";
				 game.column4.spaceTaken--;
			 }
		 }
		 else if(s3 == s4){
			 if (v3 < v4){
				 game.column3.order[game.column3.spaceTaken-1] = " ";
				 game.column3.spaceTaken--;
			 }
			 else{
				 game.column4.order[game.column4.spaceTaken-1] = " ";
				 game.column4.spaceTaken--;
			 }
		 } 
		 
	 }
	 
	 
 }