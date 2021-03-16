package com.practice;

public class LambdaEmpressionDemo {
	public void lamdaExpression() {
		 Sample1 sample=()->{
			 System.out.println("implementation of show method using lambda expression");
		 };
		 sample.show();
		 Sample2 sample2=(a,b)->{
			 System.out.println("implementation of add method using lambda expression\nAddition value of "+a+", "+b+" is: "+(a+b));
		 };
		 sample2.add(5,9);
	}

}
