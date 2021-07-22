
package com.ust.examples;

/**
 * constructor inside another constructor
 *
 */
public class Example26 {

	Example26(int x)
	{
		System.out.println(x);
		
	} //calling  first constructor
	
	Example26 (int a, int b){
		this(5);
		System.out.println(a*b);
		
	}
	
	public static void main(String[] args) {
		Example26 obj1 =new Example26(10,20);

	}

}
