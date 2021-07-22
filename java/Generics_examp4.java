/**
 * 
 */
package com.ust.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * generics wild cards
 *
 */
public class Generics_examp4 {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3); 
		ints.add(5); 
		ints.add(10); 
		double sum = sum(ints); 
		System.out.println("Sum of ints="+sum); 
		} 
	public static double sum(List<? extends Number> list){
		double sum = 0;
		for(Number n : list){ 
			sum += n.doubleValue();
			} 
		return sum; 
		}
	}
