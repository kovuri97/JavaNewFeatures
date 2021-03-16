package com.practice.newFeatures.secondDay;

import java.util.function.Predicate;

public class PredicateInterface {
	public void method() {
		Predicate<Integer> p = i->i%2==0;
		System.out.println(p.test(50));
		System.out.println(p.test(3));
	}
	
	public void method1() {
		Predicate<Integer> p = i->i%2==0;
		Predicate<Integer> p1 = i->i>10;
		int[] a = {1,2,3,4,5,6,52,10,66,98};
		for(int i:a) {
			if(p.and(p1).negate().test(i)) {
				System.out.println(i);
			}
		}
	}
}
