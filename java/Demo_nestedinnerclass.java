/**
 * 
 */
package com.ust.examples;

/**
 * nested inner class
 *
 */
public class Demo_nestedinnerclass {

	class method_Inner{
		void show() {
			System.out.println("nested class method");
		}
	}
	public static void main(String[] args) {
	 Demo_nestedinnerclass.method_Inner in = new Demo_nestedinnerclass().new method_Inner();
in.show();
	}

}
