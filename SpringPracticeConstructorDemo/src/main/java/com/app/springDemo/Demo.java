package com.app.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
public static void main(String []args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
	Employee11 employee = (Employee11) context.getBean("name1");
	System.out.println("Employee Details: "+employee);
	Employee11 employee2 = (Employee11) context.getBean("name2");
	System.out.println("Employee Details: "+employee2);
	Employee11 employee3 = (Employee11) context.getBean("name3");
	System.out.println("Employee Details: "+employee3);
	Department employee4 = (Department) context.getBean("name4");
	System.out.println("Employee Details: "+employee4);
	
}
}
