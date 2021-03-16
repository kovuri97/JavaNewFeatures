package com.practice;

public class ImplementationDemo implements FunctionalInterfaceDemo {
	public void show() {
		System.out.println("this is show method");
	}
	public void method1() {
		//static method
		FunctionalInterfaceDemo.displayValue();
	}
}
