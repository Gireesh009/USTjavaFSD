/**
 * 
 */
package com.ust.example2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * File example 1
 *
 */
public class Examp_file1 {
	public static void main(String args[]) {
		try{
//			FileWriter f= new FileWriter("D:giri.txt");
//			f.write("gireeesh file");
//			f.close();
			File f= new File("D:giri.txt");
			if(f.createNewFile()) {
				System.out.println("file created");
			}else {
				System.out.println("already created");
			}
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.err.println("error message");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(str);
		
		f.setWritable(false);
		f.setReadable(false);
		f.setWritable(false, false);
		
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
