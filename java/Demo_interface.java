package com.ust.examples;



	interface Emp
	{
	int eid = 2101;
	void geteid();
	}
	// Implclass implement an Emp Interface and provide the defination for geteid() method
	class ImplClass implements Emp
	{
	@Override
	public void geteid()
	{
	// display the eid
	System.out.print("Employee id is "+eid);
	}
	}
	public class Demo_interface 
	{
	public static void main( String[] arg )
	{
	// create object of Implclass which implements Emp interface
	ImplClass ob=new ImplClass();
	// call geteid() method which implemented by Implclass
	ob.geteid();
	}
	}

