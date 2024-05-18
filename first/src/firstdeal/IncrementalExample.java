package firstdeal;

/*
 Program Name: IncrementalExample.java
       Author: Gagandeep Kaur Chopra
         Date: May 14, 2024 1:30:36 p.m.
  Description:
 */
public class IncrementalExample
{

	public static void main(String[] args)
	{
  int count1= 15;
  int count2= 15;
  int count3= 15;
  System.out.println("The value of count1 is" + count1);
  System.out.println("The value of count2 is" + count2++);
  System.out.println("The value of count2 is" + count2);
  System.out.println("The value of count3 is" + ++ count3);
  int num1 =15;
  int num3 =num1++ + ++num1;
  System.out.println("value of num3 is "+ num3);
  
	}

}
