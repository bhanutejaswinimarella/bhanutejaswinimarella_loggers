package com.epam.week5task1;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import Compoundinterest.CompoundInterest;
import SimpleInterest.Simpleinterest;
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
	
    public static void main( String[] args ) throws IOException
    {
    	
    	LOGGER.debug("This is a DEBUG LOGGER");
    	Scanner sc=new Scanner(System.in);
    	 OutputStream outputStream = new FileOutputStream("C:\\\\Users\\\\Lenovo Laptop\\\\Desktop\\\\bhanu\\\\logging\\\\task1_interest.txt");  
         Writer outputStreamWriter = new OutputStreamWriter(outputStream);  
    	OutputStreamWriter out = new OutputStreamWriter(System.out);
    	double result;
    	try
    	{
    		out.write("Choose Any one\\n 1.Simple Interest\\n2.Compound Interest");
			out.flush();
			int choice=sc.nextInt();
			out.write("Enter Principalamount,timeperiod,rateofinterest");
			out.flush();
			double principalamount=sc.nextDouble();
	        double timeperiod=sc.nextDouble();
	        double rateofinterest=sc.nextDouble();
	        if(choice==1)
	        {
	        	Simpleinterest s=new Simpleinterest(principalamount,timeperiod,rateofinterest);
	        	result=s.sinterest();
	        	out.write("Simple Interest: "+result);
	        	out.flush();
	        	outputStreamWriter.write("Amount of Simple Interest:"+result);
	        	LOGGER.info("Simple interest is calculated ");
	        	
	        }
	        if(choice==2)
	        {
	        	out.write("How many times the interest is compounded in a year");
	        	out.flush();
	        	int n=sc.nextInt();
	        	CompoundInterest c=new CompoundInterest(principalamount, timeperiod, rateofinterest, n);
	        	result=c.cinterest();
	        	out.write("Compound Interest: "+result);
	        	out.flush();
	        	outputStreamWriter.write("Amount of Compound Interest:"+result);
	        	LOGGER.info("COmpound interest is calculated");
	        }

	         outputStreamWriter.close();  
			
    	}
    	catch(IOException e)
    	{
    		e.getMessage();
    		LOGGER.error("Input Mismatch Exception");
    	}
    	
       
        
       sc.close();
        
    }
}
