package com.practice;

public interface MultipleInterfaces {
 default void m1() {
	 System.out.println("MultipleInterfaces method");
 }
}
interface MunltipleInterfaces2 {
	default void m1() {
		 System.out.println("MultipleInterfaces2 method");
	 }
	default void m3() {
		 System.out.println("This is method 3");	
	}
}
