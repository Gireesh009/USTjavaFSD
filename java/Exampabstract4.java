/**
 * 
 */
package com.ust.examples;

/**
 * @author ustjava18
 *
 */


	 abstract class Employees {
		 
	    private String name;
	    private int paymentPerHour;
	 
	    public Employees(String name, int paymentPerHour) {
	         this.name = name;
	         this.paymentPerHour = paymentPerHour;
	    }
	 
	    public abstract int calculateSalary();
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getPaymentPerHour() {
	       return paymentPerHour;
	    }
	    public void setPaymentPerHour(int paymentPerHour) {
	        this.paymentPerHour = paymentPerHour;
	    }
	}

	  class Contractor extends Employees {
		 
		    private int workingHours;
		    public Contractor(String name, int paymentPerHour, int workingHours) {
		        super(name, paymentPerHour);
		        this.workingHours = workingHours;
		    }
		   
		    public int calculateSalary() {
		        return getPaymentPerHour() * workingHours;
		    }
		}
	 class FullTimeEmployee extends Employees {
		    public FullTimeEmployee(String name, int paymentPerHour) {
		        super(name, paymentPerHour);
		    }
		    @Override
		    public int calculateSalary() {
		        return getPaymentPerHour() * 8;
		    }
		}
	class Exampabstract4 {

	  

		 public static void main(String[] args) {

		        Employees contractor = new Contractor("contractor", 10, 10);
		        Employees fullTimeEmployee = new FullTimeEmployee("full time employee", 8);
		        System.out.println(contractor.calculateSalary());
		        System.out.println(fullTimeEmployee.calculateSalary());
		    }
		}