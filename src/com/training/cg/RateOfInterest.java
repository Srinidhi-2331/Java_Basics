package com.training.cg;

public class RateOfInterest extends SavingAccount{
	double interest;
	public double CalculateInterest(int time)
	{
		interest=(totalBalance*time*RATEOFINTEREST)/100;
		return interest;
	}

}
