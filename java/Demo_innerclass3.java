/**
 * 
 */
package com.ust.examples;

/**
 * example 3  method inner class
 *
 */
public class Demo_innerclass3 {

	void outerMethod() {
		System.out.println("Inside outerMethod");
	

	class inner_class{ //class in inside a method (local to method)
		void innerMethod() {
			System.out.println("InsideinnerMethod");
		}
	}
	inner_class y=new inner_class(); //created  an object of inner class
	y.innerMethod();
	}
	public static void main(String[] args) {
		Demo_innerclass3 outer = new Demo_innerclass3();
		outer.outerMethod();
	}

}
