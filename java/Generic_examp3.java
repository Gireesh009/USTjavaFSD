/**
 * 
 */
package com.ust.example2;

/**
 * bounded types
 *
 */
class GenericsClass1 <T extends Number> {

	  public void display() {
	    System.out.println("This is a bounded type generics class.");
	  }
	}

public class Generic_examp3 {

	
	public static void main(String[] args) {
		class GenericsClass1 <T extends Number> {

			  public void display() {
			    System.out.println("This is a bounded type generics class.");
			  }
			}
	}
}
