/**
 * 
 */
package com.ust.examples;

/**
 * @author ustjava18
 *
 */


	 class Examp_final2 {
		 final static String NAME = "CONFIG"; 
		 long initTime;
	 Examp_final2() 
		 {
			 this.initTime = System.currentTimeMillis();
		 }
		 public static void main(String[] args) { 
			 Examp_final2 cfg1 = new Examp_final2();
			 System.out.println(cfg1.initTime);
			 Examp_final2 cfg2 = new Examp_final2(); 
		 System.out.println(cfg2.initTime); 
		 } 
		 }

