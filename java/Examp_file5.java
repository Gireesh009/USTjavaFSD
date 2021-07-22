/**
 * 
 */
package com.ust.example2;

import java.io.File;

/**
 * retuns  am array of all files
 *
 */
public class Examp_file5 {

	
	public static void main(String[] args) {
		File file = new File("D:\\listmethod");
		boolean bool = file.mkdir();
		String []filelist = file.list();
		for(String str : filelist) {
			System.out.println(str);
		}
	}

}
