
package com.ust.examples;

/**
 * Example abstract
 *
 */
abstract class Car{
	int x;
	abstract void insuranceDtls();
	void disp() {
		
	}
	
}
public class Examp_abstract extends Car {

	void insuranceDtls() {
		System.out.println("insurance dtls");
	}
	public static void main(String[] args) {
		Examp_abstract obj1 = new Examp_abstract();
//		Examp_abstract obj2= new Car(); // this wil not work bcz car is super class an Examp_abstract is child class
		Car obj2 = new Examp_abstract();
		obj1.insuranceDtls();
		obj2.insuranceDtls();
	}

}
