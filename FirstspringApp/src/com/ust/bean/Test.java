package com.ust.bean;public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");

		Employee employee= (Employee)context.getBean("employeebean");
		System.out.println(employee.getEmployeeName());
	}

}
