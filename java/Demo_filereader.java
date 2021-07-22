/**
 * 
 */
package com.ust.examples;

import java.io.FileReader;
import java.io.IOException;

/**
 * file reader using file readere
 *
 */
public class Demo_filereader {

	/**
	 * @param args
	 */

	public static void main(String args[])throws Exception{    
        FileReader fr=new FileReader("D:\\file.txt");    
        int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i);    
        fr.close();    
  }    
   
}
