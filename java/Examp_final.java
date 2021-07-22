package com.ust.examples;

/**
 * @author ustjava18
 *
 */


	class base 
	 { 
	      final void display() 
	      { 
	        System.out.println("Base method called"); 
	       } 
	 } 
//	    class Derived extends base 
//	   {  
//	        void display() //cannot override 
//	      { 
//	        System.out.println("Base method called"); 
//	      } 
//	   } 
	    class Examp_final 
	  { 
	         public static void main(String[] args) 
	      { 
	        	 base d =new base(); 
	          d.display(); 
	      } 
	  } 


