/**
 * 
 */
package com.ust.examples;

/**
 * exception handling example 4
 *
 */
public class Demo_exception4 {

	public static void main(String[] args) {
		try {
			  try {
				 System.out.println("inside child try block1");
				 int b=45/0;
				 System.out.println(b);

			     }
			       catch(ArithmeticException e1) {
				   System.out.println("Exception: e1");

			       }
			   try {
				 System.out.println("inside child try block2");
				 int b=45/0;
				 System.out.println(b);

			   }
			      catch(ArrayIndexOutOfBoundsException e2) {
			
				    System.out.println("Exception: e2");

			      }
			 System.out.println("just other statement");

		} 
		 catch(ArithmeticException e3) {
			System.out.println("Arithmetic Exception");
			System.out.println("Inside Parent try catch block");
		 }
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("Inside Parent try catch block");
		}
		catch(Exception e5) {
			System.out.println("Exception");
			System.out.println("Inside Parent try catch block");
		
		}
		System.out.println("Next statement");
	}

}
