/**
 * 
 */
package com.ust.examples;

/**
 * Exception handling example 1
 *
 */
public class Demo_exception {


	public static void main(String[] args) {
		//String s=null;
		int a[]= new int[5];
		
		try {
			a[6]=6;
		//System.out.println(s.length());
		}catch (ArrayIndexOutOfBoundsException ex) {
		//catch (Exception ex){
			System.out.println("exception occured");
			ex.printStackTrace();
		}
		finally{
			System.out.println("always excecuted");
		}
	}

}
