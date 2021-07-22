/**
 * 
 */
package com.ust.examples;

/**
 * abstract example2
 *
 */
abstract class Bank{
	 abstract int getinterest();
}
 class HDFC extends Bank{
	int getinterest() {
		return 10;
	}
}
 class ICIC extends Bank{
	int getinterest() {
		return 8;
	}
}
public class Examp_abstract2 {

	
	public static void main(String[] args) {
		Bank obj1=new HDFC();
		System.out.println(obj1.getinterest());
		obj1=new ICIC();
		System.out.println(obj1.getinterest());

	}

}
