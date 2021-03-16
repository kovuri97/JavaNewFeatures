package com.app.main;

public class SingletonClass {
	private SingletonClass() {	
	}
	
	public void method() {
		System.out.println("sample");
	}
	
	public static SingletonClass getInstance() {
		return new SingletonClass();
	}
	
}
