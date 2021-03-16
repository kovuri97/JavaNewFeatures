package com.practice;
@FunctionalInterface
public interface FunctionalInterfaceDemo {
 void show();
 default void displayName() {
	 System.out.println("Name is: Neelima");
 }
 static void displayValue() {
	 System.out.println("Value is: 10");
 }
}

interface sample extends FunctionalInterfaceDemo{
	int add(int a, int b);
}
