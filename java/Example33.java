
package com.ust.examples;

/**
 * Example inheritance
 *
 */
class Super_class{
	int n=20;
	 public void disp() {
		 System.out.println("method in super class");
	 }
}
public class Example33  extends Super_class{

	int n=10;
	public void disp() {
		System.out.println("subclass method");
	}
	public void my_method() {
		Example33 obj1= new Example33();
		obj1.disp();// sub class method
			
			super.disp();// invoking parent class method
	System.out.println("value of n in subclass:" +obj1.n);
	System.out.println("value of n in ssuperclass:" +super.n);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Example33 obj2= new Example33();
 obj2.my_method();
	}

}
