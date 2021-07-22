/**
 * 
 */
package com.ust.example2;

/**
 * Enumeration example1
 */
enum Directions{
	east,west,north,south;
}
public class Enum_examp1 {

	
	public static void main(String[] args) {
		Directions dir= Directions.west;
		if(dir== Directions.east) {
			System.out.println("Direction:East");
		}else if(dir== Directions.west) {
			System.out.println("Direction:West");
		}else if(dir== Directions.north) {
			System.out.println("Direction:North");
		}else  {
				System.out.println("Direction:South");
			}
		}
	}


