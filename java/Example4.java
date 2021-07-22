package com.ust.examples;
/*
 * example of switch case
 */
public class Example4 {

	public static void main(String[] args) {
		String color="red";
		switch(color) {
		case "red" :
			System.out.println("Stop");
			break;
		case "green" :
			System.out.println("You can go");
			break;
			default:
			
				System.out.println("Wait for sec");
		}

	}

}
