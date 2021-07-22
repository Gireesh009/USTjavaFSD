/**
 * 
 */
package com.ust.example2;

import java.io.IOException;
import java.io.StringReader;

/**
 * @author ustjava18
 *
 */
public class StringReaderDemo {

	
	public static void main(String[] args) {
		String str="hello world";
		StringReader sr = new StringReader(str);
		int i=0;
		try {
			while((i=sr.read())!=-1) {
				System.out.print((char)i);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
