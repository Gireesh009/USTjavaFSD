/**
 * 
 */
package com.ust.examples;

/**
 *Examples inheritance
 *
 */
class Calc{
	int z;
	public void addition(int x, int y) {
		z=x+y;
		System.out.println("The sum: "+z);
	}
	public void sub(int x, int y) {
		z=x-y;
		System.out.println("The difference: "+z);
	}
}
public class Example32 extends Calc{
	public void mul(int x, int y) {
		z=x*y;
		System.out.println("The product: "+z);
	
	}

	public static void main(String[] args) {
		int a=20,b=10;
 Example32 obj1= new Example32();
 obj1.addition(a, b);
 obj1.sub(a, b);
 obj1.mul(a, b);
 
	}

}
