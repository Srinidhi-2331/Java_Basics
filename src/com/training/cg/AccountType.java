package com.training.cg;

public class AccountType implements Account {
	
	double intialbalance;
	double totalBalance;
	final double RATEOFINTEREST=5;
	
	public void deposit(double amount) {
		
		totalBalance=totalBalance+amount;
		}
	
	
	public void withdraw(double amount) {
		if(amount>totalBalance)
		{
			System.out.println("Insufficient Amount");
		}
		else
		{
			totalBalance=totalBalance-amount;
		}
	}
	
	public double checkBalance() {
		return totalBalance;
		
	}


}
