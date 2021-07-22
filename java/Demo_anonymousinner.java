/**
 * 
 */
package com.ust.examples;

/**
 * Anonymous inner class
 *
 */
abstract class Person{
	
	abstract void eat();
}

public class Demo_anonymousinner {

	
	public static void main(String[] args) {
		Person p = new Person() {
			void eat() {
				System.out.println("nice fruits");
				}
		};
		p.eat();

	}

}
