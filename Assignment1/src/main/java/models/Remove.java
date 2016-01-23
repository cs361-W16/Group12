package models;

/**
 * Created by Derek Wong on 1/21/2016.
 */
 
 public class Remove {
	 public static void remove(String[] column1,String[] column2,String[] column3,String[] column4){
		 
		 int valueOne, valueTwo, valueThree, valueFour;
		 int index1, index2, index3, index4;
		 char char1, char2, char3, char4;
		 
		 //Find the top card of each columns
		 for (int i=0; i > 13; i++){			 
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
		 }
		 
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
			 if (v1 < v2)
				 column1[index1] = null;
			 else
				 column2[index2] = null;
		 }
		 else if(s1 == s3){
			 if (v1 < v3)
				 column1[index1] = null;
			 else
				 column3[index3] = null;
		 }
		 else if(s1 == s4){
			 if (v1 < v4)
				 column1[index1] = null;
			 else
				 column4[index4] = null;
			 
		 }
		 else if(s2 == s3){
			 if (v2 < v3)
				 column2[index2] = null;
			 else
				 column3[index3] = null;
		 }
		 else if(s2 == s4){
			 if (v2 < v4)
				 column2[index2] = null;
			 else
				 column4[index4] = null;
		 }
		 else if(s3 == s4){
			 if (v3 < v4)
				 column3[index3] = null;
			 else
				 column4[index4] = null;
		 } 
		 
	 }
	 
	 
 }