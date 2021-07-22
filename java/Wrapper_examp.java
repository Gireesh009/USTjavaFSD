/**
 * 
 */
package com.ust.example2;

/**
 * Wrappr classes
 *
 */
public class Wrapper_examp {

	public static void main(String[] args) {
		int i=5;
		Integer obj = new Integer(i);//wrapping
		
		int j = obj.intValue();// unwrapping
		System.out.println(obj);
		double d=5.5;
	Double obj1= new Double(d);
	Double dd= obj1.doubleValue();//unwrap
	}

}
