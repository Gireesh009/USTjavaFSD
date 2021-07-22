/**
 * 
 */
package com.ust.examples;

/**
 * interface example 3
 *
 */

interface Anima{
	public void animalSound();
		public void sleep();
}
class Pig implements Anima{
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
	public void sleep() {
		System.out.println("zzz");
	}
}
public class Demo_interface3 {

	
	public static void main(String[] args) {
		Pig mypig = new Pig();
		mypig.sleep();
		mypig.animalSound();

	}

}
