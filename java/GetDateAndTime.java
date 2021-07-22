/**
 * 
 */
package com.ust.examples;

/**
 * pgm6 file
 * pgm 2
 *
 */
import java.util.*;
public class GetDateAndTime {

	
	public static void main(String[] args) {
		int day, month, year;
		int sec, min, hr;
		
		GregorianCalendar date = new GregorianCalendar(); 
		day = date.get(Calendar.DAY_OF_MONTH);
		month = date.get(Calendar.MONTH);
		year = date.get(Calendar.YEAR); 
		sec = date.get(Calendar.SECOND); 
		min = date.get(Calendar.MINUTE);
		hr = date.get(Calendar.HOUR);
		System.out.println("Current date is  "+day+"/"+(month+1)+"/"+year);
		System.out.println("Current time is  "+hr+" : "+min+" : "+sec);
		}
		}
