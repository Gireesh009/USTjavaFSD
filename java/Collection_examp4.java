/**
 * 
 */
package com.ust.example2;

import java.util.*;

/**
 * example uses indexOfSubList() & lastIndexOfSubList() to check whether 
 * the sublist is there in the list or not & to
 *  find the last occurance of the sublist in the list
 *
 */
public class Collection_examp4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
	      System.out.println("List :"+list);
	      
	      List sublist = Arrays.asList("three Four".split(" "));
	      System.out.println("SubList :"+sublist);
	      System.out.println(
	         "indexOfSubList: " + Collections.indexOfSubList(list, sublist));
	      
	      System.out.println(
	         "lastIndexOfSubList: " + Collections.lastIndexOfSubList(list, sublist));
	   }
	}
