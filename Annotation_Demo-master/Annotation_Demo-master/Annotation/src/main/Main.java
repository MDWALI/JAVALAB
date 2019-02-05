package main;

public class Main {
	 /**
	  *method <h1>addition</h1>
	  *this method calculate total sum of two value;
	  *Take num1 and num2 
	  *return num1+num2
	  */
		public double sum(double x,double y)
		{
			System.out.print("Sum : ");
			return x+y;
		}
		/**
		  *method <h1>addition</h1>
		  *this method calculate total subtraction of two value;
		   *Take num1 and num2 
		   *return num1*num2
		  */
		public double sub(double x,double y)
		{
			System.out.print("sub : ");
			if(x>y)
			{
				return x-y;
			}
			else {
				return y-x;
			}
			
		}
		/**
		  *method <h1>multiplication</h1>
		  *this method calculate total multiplication of two value;
		  *Take num1 and num2 
		  *return num1*num2
		  */
		
		public double mul(double x,double y)
		{
			System.out.print("mul : ");
			return x*y;
		}
		/**
		  *method <h1>Division</h1>
		  *this method calculate  division of two value;
		  *Take num1 and num2 
		  *return num1/num2
		  */
		public double div(double x,double y)
		{
			System.out.print("div : ");
			if(x>y)
			{
				return x/y;
			}
			else {
				return y/x;
			}
		}
		
	
}
