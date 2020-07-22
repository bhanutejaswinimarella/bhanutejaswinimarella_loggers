package com.epam.week5task2;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
	
    public static void main( String[] args ) throws IOException
    {
    	LOGGER.debug("This is a DEBUG LOGGER");
    	Scanner sc=new Scanner(System.in);
    	
    	int materialindex=100;
    	double areaofhouse;
    	
    	String[] standardtype={"standard materials","above standard materials","high standard material","high standard material and fully automated home"};
    	double[] costpersquarefeet= {1200,1500,1800,2500};
    	
    	OutputStreamWriter out = new OutputStreamWriter(System.out);
    	try
    	{
    		
			out.write("Choose Any one kind of standard material used for construction"+"\n");
			out.flush();
	    	out.write("standard materials ,above standard materials ,high standard material ,high standard material and fully automated home");
	    	out.flush();
	    	String materialstandard=sc.nextLine();
	    	out.write("Enter area of the house in squareft");
	    	out.flush();
	    	areaofhouse=sc.nextDouble();
	    	for(int i=0;i<3;i++)
	    	{
	    		if(materialstandard.equals(standardtype[i]))
	    		{
	    			materialindex=i;
	    			break;
	    		}
	    	}
	    	if(materialindex>=0&&materialindex<4)
	    	{
    	    	System.out.println("Estimation house construction cost= "+(areaofhouse*costpersquarefeet[materialindex]));
    	    	LOGGER.info("COnstruction cost is estimated");
	    	}
    	    else
    		{
    			LOGGER.error("Enter valid material type in input");
    		}
    		

	    	
    	}
    	catch(IOException e)
    	{
    		e.getMessage();
    		LOGGER.error("Input Mismatch Exception");
    	}
    	
    	finally
    	{
    		LOGGER.info("Final block is executed");
    	}
    	sc.close();
    }
}
