/**
 * 
 */
package com.ust.examples;

/**
 * example file handling
 *
 */
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Demo_fileexamp {
	
	public static void main(String[] args) throws Exception {
		try {
//			FileWriter  f= new FileWriter("D:file.txt");
//			f.write("first java  file pgm");
//			System.out.println("wrote to th efile");
//			f.close();
		File f= new File("D:file.txt");
//		if(f.createNewFile()) {
//			System.out.println(f.getName()+"is created");
//			
//		}else
//		{
//			System.out.println("already created");
//		}
Scanner read = new Scanner(f);
while(read.hasNextLine()) {
	String data = read.nextLine();
	System.out.println(data);
	}
read.close();
			
			
	}catch(IOException e) {
		System.out.println("Exception occured");
	}
	}

}
