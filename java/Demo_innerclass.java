/**
 * 
 */
package com.ust.examples;

/**
 * example of inner class
 *
 */
public class Demo_innerclass {
 
	class inner{
		void disp() {
			System.out.println("inner class");
		}
	}
		
	
	public static void main(String[] args) {
//		Demo_innerclass.inner obj1= new Demo_innerclass().new inner();
//		obj1.disp();
		Demo_innerclass obj2= new Demo_innerclass();
		Demo_innerclass.inner obj3 =obj2.new inner();
		obj3.disp();
		

	}

}
