/**
 * 
 */
package com.ust.example2;

import java.io.FileReader;
import java.io.FileWriter;

/**
 *reader using file reader
 *
 */
public class Examp_file3 {

	
	public static void main(String[] args) {
		char arr[]= new char[100];
		try {
//			File f= new File("D:input.txt");
//			if(f.createNewFile()) {
//				System.out.println("file created");
//			}else {
//				System.out.println("already created");
//			}
//			FileWriter fw= new FileWriter("D:input.txt");
//			fw.write("input named file");
//			fw.close();
			FileReader input= new FileReader("D:input.txt");
			input.read(arr);
			System.out.println("data in the file");
			System.out.println(arr);
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}
