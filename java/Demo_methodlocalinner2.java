/**
 * 
 */
package com.ust.examples;

/**
 * method to local inner class example 2
 *
 */
public class Demo_methodlocalinner2 {
private int data=30;
void disp() {
	class Local{
		void msg() {
		System.out.println(data);
		}
	}
	Local i= new Local();
	i.msg();
}
	public static void main(String[] args) {
		Demo_methodlocalinner2 obj = new Demo_methodlocalinner2();
		obj.disp();

	}

}
