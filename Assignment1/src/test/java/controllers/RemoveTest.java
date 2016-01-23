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

import ninja.NinjaDocTester;
import org.doctester.testbrowser.Request;
import org.doctester.testbrowser.Response;
import org.hamcrest.CoreMatchers;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by Derek Wong on 1/22/2016.
 */


 public class RemoveTest extends NinjaDocTester {
	 
	 @Test
	 public void top_card_test(){
		 
		 String[] column1 = {null,null,null,null,null,"6H", "7H", "8H", "9H", "10H", "JH", "QH", "KH"};
		 //String valueOne;
		 int index1;
		 
		 for (int i=0; i > 13; i++){			 
			 if (column1[i] != null){
				 String valueOne = column1[i];
				 index1 = i;
				 break;
			 }	 
		 }
		 
		 assertThat(valueOne, containsString("6H"));
	 }
	 
	 @Test
	 public void card_test(){
		 
		 String valueOne = "2H";
		 char s1, v1;
		 
		 s1 = valueOne.charAt(1);
		 v1 = valueOne.charAt(0);
		 
		 assertThat(s1, containsString("H"));
		 assertThat(v1, containsString("2"));
	 }
	 
	 @Test
	 public void column_remove_test(){
		 char s1 = 'D';
		 char v1 = '4';
		 
		 char s2 = 'D';
		 char v2 = '6';
		 
		 column1[0] = "4D";
		 column2[0] = "6D";
		 
		 if (s1 == s2){
			 if (v1 < v2)
				 column1[index1] = null;
			 else
				 column2[index2] = null;
		 }
		 
		 assertThat(column1[0], !containsString("4D"));
		 
	 }

	 
	 
 }
