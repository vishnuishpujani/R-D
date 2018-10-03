package com.vishnu.cust;

import com.vishnu.bank.BankAccount;
import com.vishnu.bank.CurrentAccountv2;
import com.vishnu.bank.Insurance;
import com.vishnu.bank.SavingAccount;
import com.vishnu.bank.SavingAccountv2;

public class Customer {
	public static void main(String[] args) {
		
//		BankAccount acc1= null;
//		acc1=new SavingAccount();
//		acc1.withdraw(5000);
		Insurance insurance=null;
		insurance=new SavingAccountv2();
		System.out.println(insurance.insuranceName("LIC"));
		System.out.println(insurance.insuranceAmount(5000));
		System.out.println(insurance.isLifeTime());
		
		Insurance insurance1=null;
		insurance1=new CurrentAccountv2();
		System.out.println(insurance1.insuranceName("Jeevan Beema"));
		System.out.println(insurance1.insuranceAmount(5000));
		System.out.println(insurance1.isLifeTime());
		
		
	}

}
