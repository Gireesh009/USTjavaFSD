/**
 * 
 */
package com.ust.examples;

/**
 * example 8 exception 
 *
 */
public class Demo_exception8 {

	
	public static void main(String[] args) {
		try {
			Demo_exception8 met = new Demo_exception8();
			System.out.println("lenghth of JUNK is" +met.getStringSize("JUNK"));
			System.out.println("lenghth of WRONG is" +met.getStringSize("WRONG"));
			System.out.println("lenghth of null is" +met.getStringSize(null));
		}
		catch(Exception e) {
			System.out.println("Exception message:" +e.getMessage());
		}

	}
	public int getStringSize(String str) throws Exception{
		if(str == null) {
			throw new Exception("String input is null");
		}
		return str.length();
	}

}
