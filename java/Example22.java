
package com.ust.examples;

/**
 * Constructor example
 *
 */
public class Example22 {

	String fName;
	String lName;
	String city;
	String address;
	String dob;
	float salary;
	Example22(String a, String b, String c,String d, String e, float f){
		 fName=a;
		 lName=b;
		 city=c;
		 address=d;
		 dob=e;
		 salary=f;
		 
	}	
	void display()
	{
		System.out.println(fName+"  "+lName+ "  "+city+"  "+address+"  "+dob+"  "+salary);
	}
	
	public static void main(String[] args) {
//		Example22 e1= new Example22("gk", "m", "Pala","mevada-10", "10-05-1996", 25000.00f);
//		Example22 e2= new Example22("amal", "jose", "Pala","mevada-11", "10-05-1997", 26000.00f);
//		Example22 e3= new Example22("joseph", "K", "kottayam","pala-10", "01-05-1999", 25000.00f);
//		Example22 e4= new Example22("giri", "M", "Pala","mevada-84", "10-05-1996", 23000.00f);
//		Example22 e5= new Example22("jose", "pj", "Pala","kottayam-10", "10-05-1996", 20000.00f);
//		e1.display();
//		e2.display();
//		e3.display();
//		e4.display();
//		e5.display();
		Example22 array[]= new Example22[5];
	    array[0]= new Example22("gk", "m", "Pala","mevada-10", "10-05-1996", 25000.00f);
	    array[1]= new Example22("amal", "jose", "Pala","mevada-11", "10-05-1997", 26000.00f);
	    array[2]=  new Example22("joseph", "K", "kottayam","pala-10", "01-05-1999", 25000.00f);
	    array[3]= new Example22("giri", "M", "Pala","mevada-84", "10-05-1996", 23000.00f);
	    array[4]= new Example22("jose", "pj", "Pala","kottayam-10", "10-05-1996", 20000.00f);
	    
	    for(Example22 e: array) {
	    	e.display();
	    }
		}

	}


