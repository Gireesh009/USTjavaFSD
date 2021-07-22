

package com.ust.examples;

/**
 * Acces methods
 *
 */
public class Example27 {

	private int accountNo;
	private String accountName;
	private float accountBal;
	
	//void printdata() {
	protected void printdata() {
		System.out.println(accountNo+"\n"+accountName+"\n"+ accountBal);
	}
	protected void inserdetails(int x, String y, float z) {
		accountNo=x;
		 accountName=y;
	      accountBal=z;
	}
	
	public static void main(String[] args) {
		Example27 obj1= new Example27();
		obj1.inserdetails(2920303,"gkm", 1000);
        obj1.printdata();
		

	}

}
