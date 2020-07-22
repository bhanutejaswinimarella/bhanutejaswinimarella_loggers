package Compoundinterest;

import SimpleInterest.Simpleinterest;

public class CompoundInterest extends Simpleinterest
{
	private int n;
	public CompoundInterest(double principalamount, double timeperiod, double rateofinterest,int n) {
		super(principalamount, timeperiod, rateofinterest);
		this.n=n;
	}
	public double cinterest()
	{
		double totalamountwithcompoundinterest=principalamount*Math.pow((1+(rateofinterest/(n*100))),(n*timeperiod));
		double compoundinterestvalue=totalamountwithcompoundinterest-principalamount;
		return compoundinterestvalue;
		
	}
	
}
