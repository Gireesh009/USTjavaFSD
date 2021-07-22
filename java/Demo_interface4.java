/**
 * 
 */
package com.ust.examples;

/**
 * interface 4th example
 *
 */
interface Firstinterface{
	public void myMethod();
}
interface secinterface{
	public void myotherMethod();
}
class Democlass implements Firstinterface, secinterface{
	public void myMethod() {
		System.out.println("hello  my method");
	}
	public void myotherMethod() {
		System.out.println("hello  my  other method");
	}
}
public class Demo_interface4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Democlass obj = new Democlass();
			obj.myMethod();
		obj.myotherMethod();

	}

}
