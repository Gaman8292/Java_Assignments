
/*
 Program Name: HelloAgrs.java
       Author: Gagandeep Kaur Chopra
         Date: May 14, 2024 1:36:49 a.m.
  Description:
 */
public class HelloAgrs
{
			public static void main (String[] args)
			{
				int myAge;	//Declare variable
				
				myAge = 30; 	//Instantiate variable
				
				
				double bankBalance = 532.65;         //Declare and instantiate variables in 1 step
				String myFavouriteAnimal = "cats";
				
				//if (args.length >= 2)
				//{
				//Instantiate 2 additional variables and set to values passed in via command line arguments
				String firstName = args[0]; //1st argument 
				String lastName = args[1]; //2nd argument		
				
				System.out.println("Hi " + firstName + " " + lastName+ "! My name is Gagan."+ " I am " 
				+ myAge + " years old"+ " and I have $" + bankBalance + " in the bank."
				+ " I think " + myFavouriteAnimal + " are awesome, don't you?");
			
			 //else
				// {
			         //   System.out.println("Please provide your first name and last name as command line arguments.");
			     //   }
			

}}
