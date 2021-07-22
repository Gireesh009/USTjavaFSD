/**
 * 
 */
package com.ust.examples;

/**
 * Exception handling array
 *
 */
public class Demo_exception5 {

	
	public static void main(String[] args) {
		try {
			int a[]= {1,2,3,4,5};
			System.out.println(a[7]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("specified index doesnot exist");
		}

	}

}
