/**
 * 
 */
package com.ust.example2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * collections example 1
 *
 */
public class Collection_examp {

	
	public static void main(String[] args) {
		ArrayList arr= new ArrayList();
		arr.add(2);
		arr.add(4.2f);
		arr.add("hello");
		arr.add(1, "hello");
		arr.remove(2);
		//System.out.println(arr);
		ArrayList<Integer> x= new ArrayList<Integer>();
		x.add(1);
		x.add(3);
		x.add(2);
		Collections.sort(x);
		System.out.println("Before replace"+x);
		boolean data =x.contains(1);
		if(data) {
			System.out.println("index of searched item is:"+x.indexOf(1));
			x.set(x.indexOf(1), 8);
			System.out.println("After replace"+x);
		}
		
		}

}
