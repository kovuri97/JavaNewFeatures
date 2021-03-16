package com.practice.newFeatures.firstDay;

public interface MultipleInterfaces {
 default void m1() {
	 System.out.println("MultipleInterfaces method");
 }
}
interface MunltipleInterfaces2 {
	default void m1() {
		 System.out.println("MultipleInterfaces2 method");
	 }
}
