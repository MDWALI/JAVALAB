package main;

import java.util.Scanner;

/**
 * <h1>Calculator</h1>
 * this program implements a calculator.using this calculator you can calculate sum,sub,div,mul;
 * 
 * <p>
 * <b>Note: </b>Giving proper comments in your program makes it more user frindly</p>
 * <h1>Calculate</h1>
 * <h3>1: Addition</h3>
 * <h3>2: Subtraction</h3>
 * <h3>3: Multiplication</h3>
 * <h3>4: Division</h3>
 * @author <h1>Fozla_Rabbi</h1>
 * @version 1.0
 * @since 30/10/2018
 */

public class Annotation {
	/**
	 * This  calculator you can use calculate sum,sub,mul,div;
	 *@param value Select which one you calculate;
	 *@param x,y Two value take input;
	 */
	public static void main(String[] args)
	{
		Main cal=new  Main();
		
		Scanner in=new Scanner(System.in);
		while(true) {
			System.out.println("click 1 for sum,2 for sub,3 for mul,4 for div");
			
			
			int value=in.nextInt();
			System.out.println("Take tow input:");
			double x=in.nextInt();
			double y=in.nextInt();
			
			switch (value) {
			 
	         case 1:  System.out.println(cal.sum(x,y));
	                  break;
	         case 2:  System.out.println(cal.sub(x,y));
	                  break;
	         case 3:  System.out.println(cal.mul(x,y));
	                  break;
	         case 4:  System.out.println(cal.div(x,y));
	                  break;
	                  
	         default: System.out.println("wrong button click.");
	                  break;
			 }
		}
		
	}
}
