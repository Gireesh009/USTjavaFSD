package com.ust.examples;


/**
 *  patient data hinding example
 */

class Demo2{
	String name;
	int age;
	boolean vaccinated;
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
	public boolean isVaccinated() {
		if(!vaccinated ) {
			System.out.println("Not Vaccinated");
		
		}else {
			System.out.println("Vaccinated");
			
		}
	 return vaccinated;   
		 
	}
	public void setVaccinated(boolean vaccinated) {
		this.vaccinated = vaccinated;
		if(!vaccinated ) {
			System.out.println("Not  Vaccinated");
		
		}else {
			System.out.println("Vaccinated");
			
		}
	}
	
	
	
}
public class Demo2_datahiding {


	public static void main(String[] args) {
		Demo2 d= new Demo2();
		d.setName("gkm");
		d.setAge(24);
		d.setVaccinated(false);
		System.out.println(d.getName()+" " + d.getAge()+ " " + d.isVaccinated());

	}

}
