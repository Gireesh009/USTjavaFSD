/**
 * 
 */
package com.ust.examples;

/**
 * inner class example 4
 *
 */
public class Demo_innerclass4 {

	private int data =30;
	void disp() {
		int value=50;
		class Local1{
			void msg(){
		System.out.println(value);
		}
		}
		Local1 l= new Local1();
			l.msg();
	}
	
	public static void main(String[] args) {
		Demo_innerclass4 obj1 = new Demo_innerclass4();
		obj1.disp();
	}

}
