/**
 * 
 */
package com.ust.examples;

/**
 * Example upcasting and downcast
 *
 */
public class Demo_upcast {

	
	public static void main(String[] args) {
		double  n= 20.57;
		System.out.println(n);
		int num=(int)n; //downcasting in to int
		
		System.out.println(num);
		double d= (double)num;// upcasted into double
		System.out.println(d);
	}

}
