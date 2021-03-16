package com.practice;

public class InnerClassDemo implements Sample2 {
	int age;
	String name;
	
	public InnerClassDemo(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	class InnerClass implements Sample1 {
		//overriding the method
		public void show() {
			System.out.println("show method implemented inside inner class");
		}

		public void displayDetails() {
			System.out.println("Inner class: Name is: "+name);
			System.out.println("Inner class: Age is: "+age);
		}
		//overriding the method
		public void add(int a, int b) {
			System.out.println("Add method implemented inside inner class, value is: "+(a+b));
		}
		
		public int addition() {
			return 5+6;
		}
		
		public void lambdaExpression() {
			Vehical v = (d)->{
				System.out.println("prize inside inner class: "+d);
				System.out.println("addition value is: "+this.addition());
			};
			v.prize(500);
		}
	}

	public void displayDetails() {
		System.out.println("Outer calss: Name is: "+name);
		System.out.println("Outer calss: Age is: "+age);
	}
	
	//overriding the method
	public void add(int a, int b) {
		System.out.println("Add method implemented inside Outer class, value is: "+(a+b));
	}
}
