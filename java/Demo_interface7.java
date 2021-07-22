/**
 * 
 */
package com.ust.examples;

/**
 *interface 7 example
 *
 */
interface Polygon{
	void getArea(int l, int b);
}   
class Rectangle implements Polygon{
	public void getArea(int l, int b) {
		System.out.println("The area of the rectangle is "+(l*b));
	}
}
public class Demo_interface7 {


	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.getArea(5, 6);
		
	}

}
