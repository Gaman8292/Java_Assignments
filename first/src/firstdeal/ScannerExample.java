package firstdeal;

import java.util.Scanner;

/*
 Program Name: ScannerExample.java
       Author: Gagandeep Kaur Chopra
         Date: May 16, 2024 11:03:31 a.m.
  Description: This will 
 */
public class ScannerExample
{

	public static void main(String[] args)
	{

	String firstName, lastName;
	String address;
	char likePizza;
	
	
	//Tittle of the Program 
	System.out.println("\t\t\t\tWelcome to my info gathering Session!");
	System.out.println("\t\t\t****************************************************");
	
	//Create scanner object
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter your firstName");
	firstName = input.next();
	
	System.out.println("Enter your lastName");
	lastName = input.next();
	
	//flush the buffer to get rid of EOL character 
	input.nextLine();
	
	System.out.println("Enter your address");
	address = input.next();
	
	System.out.println("Do you like pizza? (Y or N)");
	likePizza = input.next().charAt(0);
	
	//display values to screen 
	
	System.out.println("firstName: "+ firstName);
	System.out.println("lastName: "+ lastName);
	System.out.println("address: "+ address);
	System.out.println("Like Pizza: "+ likePizza);
	
	//close the scanner 
	input.close();
	
	
	}

}
