package com.ust.examples;
/*
 * this program will depict the use of instance 
 *  local and static variable
 * 
 */
public class Example1 {
 String name;
 float price;
 static int count;
	public static void main(String[] args) {
		
		int age=10;
		System.out.println(age);
		Example1 e=new Example1();
		e.name="gkm";
		count=3;
		System.out.println(e.name);
		System.out.println(e.count);
	}

}
