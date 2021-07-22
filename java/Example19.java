/**
 * 
 */
package com.ust.examples;

/**
 * largest number in an array
 *
 */
public class Example19 {

	public static int largest(int[] array) {

		  int max = 0;

		  max = array[0];

		  for (int i = 1; i < array.length; i++) {
		
		    if (max < array[i]) max = array[i];
		  }

		  return max;
		}
	
	public static void main(String[] args) {
		
		int a[]= {2,4,6,8,9,10};
		System.out.println(largest(a));
	}

}
