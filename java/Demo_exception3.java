/**
 * 
 */
package com.ust.examples;

/**
 * Exception file creation
 *
 */
import java.io.*;
public class Demo_exception3 {
	
	public static void findFile() throws IOException
	{
		File newFile= new File("firstfile.txt");
		FileInputStream stream= new FileInputStream(newFile);
	}
	public static void main(String[] args) {
		try {
			
			findFile();
			
		}
		catch(IOException e) {
			System.out.println(e);
			}
	}

}
