package com.training.cg;

public class CurrentAccount extends AccountType{
	
	final double RATEOFINTEREST=4;

	CurrentAccount(double intialbalance){
		this.intialbalance=intialbalance;
		this.totalBalance=intialbalance;
	}

}
