package com.practice;

import java.util.ArrayList;
import java.util.List;

public class LinkedListDemo {
	public void method() {
		List<Integer> resultArrayList = new ArrayList<Integer>(); 
		List<Integer> listArray = new ArrayList<Integer>(); 
		listArray.add(1);
		listArray.add(2);
		listArray.add(3);
		listArray.add(4);
		listArray.add(5);
		listArray.add(6);
		listArray.add(7);
		listArray.add(8);
		listArray.add(9);
		listArray.add(10);
		System.out.println("ArrayList even values are: ");
		listArray.forEach(n->{
			if(n%2==0)System.out.println(n+" ");});
		System.out.println("Original array list values are: ");

		System.out.println(listArray);
		System.out.println("Result array list values after multiple with 2: ");
		listArray.forEach(n->{
			resultArrayList.add((n*2));
		});
		System.out.println(resultArrayList);
	}
}
