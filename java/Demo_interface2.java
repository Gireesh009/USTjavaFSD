package com.ust.examples;



	interface Emp1
	{
	int eid = 2101;
	void geteid();
	}
	class Demo_interface2 
	{
	public static void main( String[] arg )
	{
	// Implclass is hidden inner class implement an Emp Interface
	// Implclass class name is not created but an object is creating below
	Emp1 ob = new Emp1() {

	public void geteid() {
	// display the eid
	System.out.print("Employee id is "+eid);
	}
	};
	// call geteid() method which implemented by Implclass
	ob.geteid();
	}
	}



