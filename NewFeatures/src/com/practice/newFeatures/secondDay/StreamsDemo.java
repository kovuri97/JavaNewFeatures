package com.practice.newFeatures.secondDay;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

public class StreamsDemo {
	public void streamFunction1() {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> resultList = new ArrayList<Integer>();
		for(int i=1;i<=15;i++) {
			arrayList.add(i);
		}
		System.out.println("Original list: "+arrayList);
		resultList =arrayList.stream().filter(i->i%2==0).collect(Collectors.toList());	
		System.out.println("Result list: "+resultList);
		long count = arrayList.stream().count();	
		System.out.println("count of result list: "+count);
		int maxValue = arrayList.stream().max((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("max value of result list: "+maxValue);
		int minValue = arrayList.stream().min((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("min value of result list: "+minValue);
	
	}
	public void streamFunction2() {
		List<String> arrayList = new ArrayList<String>();
		List<String> resultList1 = new ArrayList<String>();
		List<String> resultList2 = new ArrayList<String>();
			arrayList.add("mother");
			arrayList.add("brother");
			arrayList.add("sister");
			arrayList.add("dad");
			arrayList.add("friend");
		System.out.println("Original list: "+arrayList);
		resultList1 =arrayList.stream().filter(i->i.length()>5).collect(Collectors.toList());	
		System.out.println("Result list which having element length greater than 5: "+resultList1);
		resultList2 =arrayList.stream().map(i->i.toUpperCase()).sorted().collect(Collectors.toList());	
		System.out.println("Result list which having upper case and sorted values: "+resultList2);
		resultList2 =arrayList.stream().map(i->i.toUpperCase()).sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());	
		System.out.println("Result list which having upper case and decending values: "+resultList2);
		long count = arrayList.stream().count();	
		System.out.println("count of result list: "+count);
		String maxValue = arrayList.stream().max((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("max value of result list: "+maxValue);
		String minValue = arrayList.stream().min((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("min value of result list: "+minValue);
	
	}
}
