/**
 * 
 */
package com.ust.examples;

/**
 * @author ustjava18
 *
 */


abstract class Animals {
	  abstract void makeSound();

	}

	class Dog1 extends Animals {

	 
	  public void makeSound() { // implementation of abstract method
	    System.out.println("Bark bark.");
	  }
	}

	class Cat extends Animals {

	
	  public void makeSound() {  // implementation of abstract method
	    System.out.println("Meows ");
	  }
	}

	class Examp_abstract3 {
	  public static void main(String[] args) {
	    Dog1 d1 = new Dog1();
	    d1.makeSound();

	    Cat c1 = new Cat();
	    c1.makeSound();
	  }
	}
