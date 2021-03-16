package com.app.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String []args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
		Flipkart o =(Flipkart) context.getBean("name1");
		System.out.println(o);
	}
}
