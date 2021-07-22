/**
 * 
 */
package com.ust.examples;

/**
 * Exception example 7 url 
 *
 */
import java.net.MalformedURLException;
import java.net.URL;
public class Demo_exception7 {

	
	public static void main(String[] args) throws MalformedURLException {
		try {
			URL url = new URL("http://www.google.com");
		}finally {
			System.out.println("finally block");
		}

	}

}
