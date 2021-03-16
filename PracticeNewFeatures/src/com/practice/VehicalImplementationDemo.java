package com.practice;

public class VehicalImplementationDemo implements Vehical {
	public void prize(double d) {
		System.out.println("Prize of vehical is: "+d);
	}
	
	public void lambdaExpression() {
		Vehical vehical = (d)->System.out.println("Lambda expression: Prize of vechical is: "+d);
		vehical.prize(500);
	}
	
	public void AnonymousClass() {
		Vehical vehical = new Vehical() {
			public void prize(double d) {
				System.out.println("Anonymous class: Prize of vechical is: "+d);
			}
		};
		vehical.prize(700);
	}
}
