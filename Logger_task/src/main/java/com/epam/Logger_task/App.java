package com.epam.Logger_task;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	LOGGER.info("Enter the principal amount: ");
    	double principal=sc.nextDouble();
    	LOGGER.info("Enter the rate: ");
    	double rate=sc.nextDouble();
    	LOGGER.info("Enter period of time: ");
    	double time=sc.nextDouble();
    	LOGGER.info("Enter the area of the House: ");
    	int f=sc.nextInt();
    	int cpf=0;
    	LOGGER.info("Select the above options : ");
    	LOGGER.info("Option1--> 1200INR if we use standard materials");
    	LOGGER.info("Option2--> 1500INR if we use above standard materials");
    	LOGGER.info("Option3--> 2200INR if we use high  standard materials");
    	LOGGER.info("Option4--> 2500INR if we use standard materials and fully automated home");
    	int n=sc.nextInt();
    	switch(n)
    	{
    		case 1:cpf=1200;
    	       	   break;
    		case 2:cpf=1500;
    	       	   break;
    		case 3:cpf=1800;
    			   break;
    		case 4:cpf=2500;
    	           break;
    	}
    	sc.close();
    	double cost=f*cpf;
    	LOGGER.info("Total estimated cost of the house is "+cost);
        SimpleInterest S=new SimpleInterest(principal,rate,time);
        CompoundInterest C=new CompoundInterest(principal,rate,time);
        LOGGER.info("The Simple Interest is "+S.simple());
        LOGGER.info("The Compound Interest is "+C.compound());
    }
}
