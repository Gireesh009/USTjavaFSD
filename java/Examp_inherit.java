package com.ust.examples;

/**
 *MEthod overloading final method
 *
 */
	 class Base1 { 
			final void foo(int i) { //overloading is allowed 
				System.out.println(i);
			}
		}
		class Child extends Base1{
	      void foo(int i, String s) {
	    	  System.out.println(i+""+s);
	      }  
		}
public class Examp_inherit {
	public static void main(String[] args) {
		Child obj1 =new Child();
		obj1.foo(2);
		obj1.foo(10,"Gkm");

	}

}
