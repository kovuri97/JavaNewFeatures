package com.practice.newFeatures.firstDay;
public class Inheritance1 {
	public void add(int a, int b) {
		System.out.println("super class sum is :"+(a+b));
	}
	public void subtract(int a, int b) {
		System.out.println("super class sum is :"+(a-b));
	}
	public void multiple(int a, int b) {
		System.out.println("super class sum is :"+(a*b));
	}
	public void division(int a, int b) {
		System.out.println("super class sum is :"+(a/b));
	}
}

class InheritanceDemo extends Inheritance1{
	public void add(int a, int b) {
		System.out.println("child class sum is :"+(a+b));
	}
	public void subtract(int a, int b) {
		System.out.println("child class sum is :"+(a-b));
	}
}