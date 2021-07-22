/**
 * 
 */
package com.ust.examples;

/**
 * example 4
 *
 */
public class Example15 {

	
	public static void main(String[] args) {
		int [] numb= {2,-9,0,5,12,-25,22,9,8,12};
		int sum=0;
		Double avg;
		for(int number : numb) {
			sum +=number;
		}
		int arrayLength= numb.length;
		avg=((double)sum/(double)arrayLength);
		System.out.println("Sum=" +sum);
		System.out.println("Avg=" +avg);
	}

}
