
package com.ust.examples;

/**
 *inheritance
 *
 */
//import java.util.Date;
 class creditcards{
 String cardName;
 String expiaryDate;
	 float creditBal;
	
}
class Visacards extends creditcards{
	public void insert(String n, String e, float c) {
		cardName=n;
		expiaryDate=e;
		creditBal=c;
	}
	void disp() {
		System.out.println("Card Name:"+cardName +"\n Expiary Date:"+expiaryDate+"\n Credit Balance:"+creditBal);
		}
}
public class  Example28 {

	
	public static void main(String[] args) {
		
Visacards obj1= new Visacards();
obj1.insert("visa", "10/05/1997", 1000);
obj1.disp();
	}

}
