/**
 * 
 */
package com.ust.example2;

/**
 *Enumeration exampple switch
 *
 */
enum Directions1{
	east,west,north,south;
}
public class Enum_example2 {
 Directions1 dir;
 public Enum_example2(Directions1 dir) {
	 this.dir=dir;
 }
 public void getMyDirection() {
	 switch(dir) {
	 case east:
		 System.out.println("In East Direction");
		 break;
	 case west:
		 System.out.println("In west Direction");
		 break;
	 case north:
		 System.out.println("In north Direction");
		 break;
		 default:
			 System.out.println("In south Direction");
			 break;
	 }
 }
	
	public static void main(String[] args) {
		Enum_example2 obj1 = new Enum_example2(Directions1.east);
		obj1.getMyDirection();
		Enum_example2 obj2 = new Enum_example2(Directions1.south);
		obj2.getMyDirection();
	}

}
