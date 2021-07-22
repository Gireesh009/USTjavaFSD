/**
 * 
 */
package com.ust.examples;

/**
 *Bank  exception
 *
 */
public class Bankexception extends Exception { //extending the exception class and
	//creating userdefind exceptions

	 static String msg="error";
	public Bankexception(String message) {
		super(message);
	}
	public static void main(String[] args) throws Bankexception {
	if(msg.equals("error")) {
		System.out.println("erroer");
	}else
	{
		throw new Bankexception("Bankexception");
		
	}

}
}
