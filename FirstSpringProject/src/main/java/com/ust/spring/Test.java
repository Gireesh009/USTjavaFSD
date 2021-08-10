package com.ust.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
 
	public static void main (String []args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Restaurant obj= (Restaurant) context.getBean("restaurantbean");
		obj.disp();
	}
}
