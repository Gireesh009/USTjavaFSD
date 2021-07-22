/**
 * 
 */
package com.ust.example2;

import java.io.FileOutputStream;

/**
 * file input stream
 *
 */
public class Examp_file2 {

	public static void main(String[] args) {
		try {
			//FileInputStream input =new FileInputStream("D:giri.txt");
			//System.out.println("data int the file");
			//read the first byte
//			int i = input.read();
//			while(i!=-1) {
//				System.out.print((char)i);
//				
				//reads nxt byte from the file
//			i=input.read();
//			}
//			input.close();
			FileOutputStream out =new FileOutputStream("D:file.txt");
			String str= "output stream";
			byte[] b= str.getBytes();//converting string to byte
			out.write(b);
			
			out.close();
			System.out.println("success.");
			
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
