/**
 * 
 */
package com.ust.example2;

import java.io.File;

/**
 * file name change
 *
 */
public class Examp_file4 {


	public static void main(String[] args) {
		File f =new File("D:oldname");
		try {
		
		f.createNewFile();
		}
		catch(Exception e) {
			e.getStackTrace();
			}
		File newf =new File("D:newname");
		boolean value = f.renameTo(newf);
		if(value) {
			System.out.println("file name changed");
			
		}else {
			System.out.println("file name not changed");
	
		}

	}

}
