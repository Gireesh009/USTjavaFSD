/**
 * 
 */
package com.ust.examples;

/**
 *Example datahinding
 *
 */
class Demo{
	String name;
	int age;
	float salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
public class Demo_datahiding {


	public static void main(String[] args) {
		Demo d= new Demo();
		d.setName("gkm");
		d.setAge(24);
		d.setSalary(20000);
		System.out.println(d.getName()+" " + d.getAge()+ " " + d.getSalary());

	}

}
