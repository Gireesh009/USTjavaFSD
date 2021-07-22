package com.ust.examples;

/*
 * method
 */
public class Example8 {
	int x;
	int y;
	int calc(int a, int b) // a,b parameters
	{
		return a+b;
	}
	
	String calc(String a, String b) {
		return a+b;
	}
	public static void main(String[] args) {
	
		Example8 obj = new Example8();
		int value= obj.calc(3,5);
       System.out.println(value);
       String  word=obj.calc("helllo ","giri");
       System.out.println(word);
       }
}

	


