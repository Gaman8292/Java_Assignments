
/*
 Program Name: MathCalculator.java
       Author: Gagandeep Kaur Chopra
         Date: May 14, 2024 2:14:55 a.m.
  Description:
 */
public class MathCalculator
{

	public static void main(String[] args)
	{
		//Declare and instantiate variables of different datatypes
				double dblTotal = 13;
				double dblAmount = 0;
				int intAmount = 0;
				int intTotal = 13;
				int intQty = 2;
				
				                               //Division with a double and an integer
				dblAmount = dblTotal / intQty;
				System.out.println(dblTotal + "  /  " + intQty + "  = " + dblAmount);

				                          //Division with 2 integers - note what happens to the decimal part of the answer!
				dblAmount = intTotal / intQty;
				System.out.println(intTotal + "  / " + intQty + "  = " + dblAmount);
	}

}
