/**
 * if super interface is functional interface then child interface should not be function interface
 */
package com.practice.newFeatures.firstDay;
@FunctionalInterface
public interface Sample1 {
 void show();
} 
@FunctionalInterface
interface Sample3 {
 void show();
 default void disply() {
	 System.out.println("display");
 }
} 


//no need to declare explicitly
interface sample2 extends Sample1{
	void add();
}
@FunctionalInterface
interface sample4{
	void m1();
}

interface sample5 extends sample4{
	void m2();
}