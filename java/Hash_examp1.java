/**
 * 
 */
package com.ust.example2;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @ example uses hasMoreElements & nestElement Methods 
 * of Enumeration Class to display the contents of the HashTable.
 *
 */
public class Hash_examp1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
	      ht.put("1", "One");
	      ht.put("2", "Two");
	      ht.put("3", "Three");
	      Enumeration e = ht.keys();
	      
	      while (e.hasMoreElements()) {
	         System.out.println(e.nextElement());
	      }
	   }
	}
