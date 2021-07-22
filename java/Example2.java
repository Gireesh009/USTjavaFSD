package com.ust.examples;
/*
 * depicting the use of if condition
 */
public class Example2 {

	float price;
	String item;
	public static void main(String[] args) {
	Example2 e1= new Example2();
	Example2 e2= new Example2();
	e1.price=1.2f;
	e2.price=25f;
	e1.item="pen";
	e2.item="pencile";
	
	if(e1.price>e2.price) {
	e1.item="book";
	}
	if(e1.price < e2.price) {
	e1.item="eraser";
	}else {
		e1.item="nothing";
	}
	System.out.println(e1.item);

	}

}
