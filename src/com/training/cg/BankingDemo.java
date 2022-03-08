package com.training.cg;

public class BankingDemo {
	public static void main(String args[])
	{
		SavingAccount sav1=new SavingAccount(5000);
		sav1.deposit(4000);
		System.out.println(sav1.checkBalance());
		sav1.withdraw(2000);
		System.out.println(sav1.checkBalance());
		System.out.println(sav1.CalculateInterest(2));
		CurrentAccount cur1=new CurrentAccount(10000);
		cur1.deposit(4000);
		System.out.println(cur1.checkBalance());
		cur1.withdraw(2000);
		System.out.println(cur1.checkBalance());
		
		
	}

}

