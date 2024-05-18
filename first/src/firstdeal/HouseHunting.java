package firstdeal;

import java.util.Scanner;

/*
 Program Name: HouseHunting.java
       Author: Gagandeep Kaur Chopra
         Date: May 16, 2024 11:24:01 a.m.
  Description: HouseHUnting prorammm
 */


public class HouseHunting
{

	public static void main(String[] args)
	{
  String houseType;
  int minPrice;
  int maxPrice;
  int bedNo;
  int bathHow;
  char garageNeed;
  boolean pool;
  String location;
  
//Tittle of the Program 
	System.out.println("\t\t\t\tWelcome House Hunting!");
	System.out.println("\t\t\t****************************************************");
	
	//Create scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter What kind of house you want(single,family,duplex,Condo");
		houseType = input.nextLine();
		
		System.out.println("What is the minimum price would you like to pay");
		minPrice = input.nextInt();
	
		System.out.println("What is the minimum price would you like to pay");
		maxPrice = input.nextInt();
	
		System.out.println("How many bedrooms would you like");
		bedNo = input.nextInt();
		
		System.out.println("How many bathroom would you like");
		bathHow = input.nextInt();
		
		System.out.println("How many garage would you like");
		garageNeed = input.next().charAt(0);
		
		//flush the buffer to get rid of EOL character 
		input.nextLine();
		
		System.out.println("would you like a pool in your house");
		pool = input.nextBoolean();
		
		System.out.println("what location would you prefer");
		location = input.next();
		
		//display values to screen 
		
		System.out.println("housetype: "+ houseType);
		System.out.println("What is the minimum price would you like to pay: "+ minPrice);
		System.out.println("What is the minimum price would you like to pay: "+ maxPrice);
		System.out.println("How many bedrooms would you like: "+ bedNo);
		System.out.println("How many bathroom would you like: "+ bathHow);
		System.out.println("How many garage would you like: "+ garageNeed);
		System.out.println("would you like a pool in your house: "+ pool);
		System.out.println("what location would you prefer: "+ location);
		
		//close the scanner 
		input.close();
		
  
		
		
	}

}
