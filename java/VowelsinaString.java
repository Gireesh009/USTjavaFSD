/**
 * 
 */
package com.ust.examples;

/**
 * java pfm fil e6 
 *  first pgm
 *
 */
import java.util.Scanner;
public class VowelsinaString {

	
	public static void main(String[] args) {
		String s;
		char ch;
		int i=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String:");
		s=sc.nextLine();
		sc.close();
		//close sacnner object
		System.out.println("Vowels in strings are:");
		for(int j=0; j<s.length(); j++) {
			ch=s.charAt(j);
			switch(ch)
			{
			 case  'a' :
			 case 'e'  :
			 case 'i'   :
			 case 'o'  :
			 case 'u'  :
			 case  'A' :
			 case 'E'  :
			 case 'I'   :
			 case 'O'  :	
			 case 'U'  : i=1;
				System.out.println(ch); 			 
			}	
			}
			if(i==0)
				System.out.println("There are no vowels "); 
			
			}
		}