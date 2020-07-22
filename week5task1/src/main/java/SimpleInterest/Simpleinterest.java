package SimpleInterest;

public class Simpleinterest
{
	protected double principalamount;
	protected double timeperiod;
	protected double rateofinterest;
	public Simpleinterest(double principalamount,double timeperiod,double rateofinterest)
	{
		this.principalamount=principalamount;
		this.timeperiod=timeperiod;
		this.rateofinterest=rateofinterest;
		
	}
	public double sinterest()
	{
		double simpleinterestvalue=(principalamount*timeperiod*rateofinterest)/100;
		return simpleinterestvalue;
		
	}
}