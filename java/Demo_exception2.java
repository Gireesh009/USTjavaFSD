/**
 * 
 */
package com.ust.examples;

/**
 * Example 2 exception try catch and finally
 *
 */
public class Demo_exception2 {

	public static void main(String[] args) {
		try {
			int a=5/0;
		}
		catch(ArithmeticException  e) {
			System.out.println("ArithmeticException =>" +e.getMessage());
		}
		finally {
			System.out.println("finally  block");
			}

	}

}
