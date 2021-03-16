package com.practice.newFeatures.secondDay;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionInterface {
		public void method() {
			Predicate<Integer> p = i->i>5;
			Function<String,Integer> f = i->i.length();
			System.out.println("Length is greater than 5 "+p.test(f.apply("neelima")));
			Function<String,Boolean> f1 = i->i.equals("neelima");
			System.out.println("value is: "+f1.apply("neelima"));
		}
}
