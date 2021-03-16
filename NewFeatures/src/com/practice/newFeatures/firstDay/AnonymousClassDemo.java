/**
 * implementation of interface classes using lambda expressions
 * or using inner anonymous class
 * if we use implements key we should override the all abstract methods of interface class
 */
package com.practice.newFeatures.firstDay;
public class AnonymousClassDemo {
	public void anonymousclass() {
		int b =50;
		f1 f=new f1(){ //  this not same as creating the object because here we implement the functions inside flower brackets
			public int show(int a) {
				System.out.println("implementation of interface method using anonymous class");
				return b;
			}};
		f.show(10);
	}
	public void anonymousclass2() {
		int b =50;
		f2 f=new f2(){ //  this not same as creating the object because here we implement the functions inside flower brackets
			public void show() {
				System.out.println("implementation of interface method using anonymous class for show");
			}
			public void display() {
				System.out.println("implementation of interface method using anonymous class for display");
			}};
		f.show();
		f.display();
	}
}
