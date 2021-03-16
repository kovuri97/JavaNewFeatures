package com.practice.newFeatures.firstDay;

public class InterfaceDemo implements Sample1{
	
	public void show() {
		System.out.println("show method ");
	}
}
class Demo{
	public void m1() {
		Sample1 sample = new InterfaceDemo();
		sample.show();
	}
	public void m2() {
		Sample1 sample = ()->{System.out.println("method name is show");};
		sample.show();
	}
	}
