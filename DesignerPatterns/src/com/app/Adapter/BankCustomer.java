package com.app.Adapter;

import java.util.Scanner;

public class BankCustomer  extends BankDetails implements Credit{
	
	
	Scanner s = new Scanner(System.in);

	@Override
	public void getBankDetails() {
		// TODO Auto-generated method stub
		System.out.println("enter bank name");
		String name = s.nextLine();
		System.out.println("enter account name");
		String accountName = s.nextLine();
		System.out.println("enter account number");
		long num = s.nextLong();
		setBankName(name);
		setAccountName(accountName);
		setAccountNum(num);
	}

	@Override
	public String getCreditCard() {
		// TODO Auto-generated method stub
		return "Account name: "+getAccountName()+" Bank name: "+getBankName()+" Account number: "+getAccountNum();
	}

}
