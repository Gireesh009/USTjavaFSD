/**
 * 
 */
package com.ust.examples;

/**
 * example of nested static class
 *
 */
public class Demo_staticnestedclass {
static class Demo_nested{
	void disp() {
		System.out.println("static nested class");
	}
}
	public static void main(String[] args) {
		Demo_staticnestedclass.Demo_nested obj1 = new Demo_staticnestedclass.Demo_nested();	
		obj1.disp();
		
	}

}
