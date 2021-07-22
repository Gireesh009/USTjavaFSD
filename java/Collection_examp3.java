/**
 * 
 */
package com.ust.example2;

/**
 * convert an array into a collection Arrays.asList(name) method of Java Util class.
 *
 */
import java.util.*;
import java.io.*;

public class Collection_examp3 {

	public static void main(String args[]) throws IOException {
	      BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
	      System.out.println("How many elements you want to add to the array: ");
	      int n = Integer.parseInt(in.readLine());
	      String[] name = new String[n];
	      System.out.println("Enter elements you want to add to the array: ");
	      for(int i = 0; i < n; i++) {
	         name[i] = in.readLine();
	      }
	      List<String> list = Arrays.asList(name); 
	      System.out.println();
	      
	      for(String li: list) {
	         String str = li;
	         System.out.print(str + " ");
	      }
	   }
	}

