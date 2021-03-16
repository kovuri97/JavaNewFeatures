package com.app.main;

import java.util.Scanner;

import com.app.Adapter.BankCustomer;
import com.app.Adapter.Credit;

public class FactoryPattern {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter animal type:");
//		String name = s.next();
//		Factory factory = new Factory();
//		factory.getAnimalName(name);
//		
		SingletonClass.getInstance();
		Credit credit = new BankCustomer();
		credit.getBankDetails();
		System.out.println(credit.getCreditCard());
		
		
	}
}
