package com.ust.examples;

/**
 * parameterizedConstructor
 *
 */
//import java.io.*; 
class Students
{ 
 
String name; 
int id; 

Students(String name, int id) 
{ 
this.name = name; 
this.id = id; 
} 
} 

public class Example24 {

	public static void main(String args[]) 
	{

	Students student1 = new Students("Ashok", 101); 
	System.out.println("Student Name: " + student1.name + " and Student Id: " + student1.id); 
	}
	}

