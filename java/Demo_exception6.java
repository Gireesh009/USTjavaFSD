/**
 * 
 */
package com.ust.examples;

/**
 * exception handling example 6
 *
 */
import java.io.*;

class Throwexamp{
	
	void myMethod(int n) throws IOException, ClassNotFoundException{
		if(n==1) {
			throw new IOException("IOException occured");
		}else {
			throw new ClassNotFoundException("ClassNotFoundException occured");

		}
	}
}
public class Demo_exception6 {

	
	public static void main(String[] args) {
		
		try {
			Throwexamp obj1 = new Throwexamp();
			obj1.myMethod(1);
		}
		catch(Exception e) {
			System.out.println(e);
	
		}
	}

}
