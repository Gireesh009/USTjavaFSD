/**
 * 
 */
package com.ust.examples;

/**
 * method  local inner class
 *
 */
public class Demo_methodlocalinner {

	void outerMethod() {
		System.out.println("inside outer method");
        class inner_class{
        	void innerMethod() {
        		System.out.println("inside inner method");
        	}
        }
        inner_class y = new inner_class();
        y.innerMethod();
	}
	public static void main(String[] args) {
		Demo_methodlocalinner outer = new Demo_methodlocalinner();
		outer.outerMethod();
	}

}
