package com.app.springDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo{
	public static void main(String []args) {
		BeanFactory o =new ClassPathXmlApplicationContext("beans1.xml");
		Vehical v = o.getBean("vehical", Vehical.class);
		System.out.println("data: "+v);
	}
}
