package com.skilldistillery.foodtruck;
import java.util.Scanner;
public class FoodTruckApp {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		//array to store up to five food trucks objects
		//call run method
		FoodTruck allTrucks[] = new FoodTruck[5];
		FoodTruck tk = new FoodTruck();
		
		FoodTruck truck1 = new FoodTruck();
		FoodTruck truck2 = new FoodTruck();
		FoodTruck truck3 = new FoodTruck();
		FoodTruck truck4 = new FoodTruck();
		FoodTruck truck5 = new FoodTruck();
		
		allTrucks[0] = truck1;
		allTrucks[1] = truck2;
		allTrucks[2] = truck3;
		allTrucks[3] = truck4;
		allTrucks[4] = truck5;
		
		/*
		 * user prompt to input name, food type, and rating
		 * for up to five food trucks. For each set of input
		 * a FoodTruck object is created, its fields set the 
		 * user's input, and it is added to the array
		 * *** Truck id is NOT input by the user, but
		 * assigned automatically in the FoodTruck constructor
		 * If the user inputs quit for the food truck name, input 
		 * ends immediately and the program continues.
		 */
		String tkName, food; 
		int rating; 
		//loop obj array for info input
		for(int i = 0; i < allTrucks.length; i++) {
			System.out.println("Enter food truck name or quit if finished entering trucks: ");
			tkName = kb.nextLine();
			
			//quit check
			if(tkName.equals("Quit") || tkName.equals("quit")) {
				break;
			}
			System.out.println("Enter type of food for truck: ");
			food = kb.nextLine();
			System.out.println("Enter the food truck rating: ");
			rating = kb.nextInt();
			kb.nextLine();
			
			//set truck obj info
			allTrucks[i].setTruckName(tkName);
			allTrucks[i].setFoodType(food);
			allTrucks[i].setRating(rating);
			allTrucks[i].setTruckId((int)(Math.random() * 10000));
			allTrucks[i].getTruckId();		
	
			//Check for duplicate id
			for (FoodTruck foodTruck : allTrucks) {
				
				if ( allTrucks[i].getTruckId() == foodTruck.getTruckId()
						&& !allTrucks[i].getTruckName().equals(foodTruck.getTruckName())) {
					allTrucks[i].setTruckId((int)(Math.random() * 10000));
				}
			} 
		}
		/*
		 * After input is complete, the user sees a menu from which 
		 * they can choose to:

			List all existing food trucks.
			See the average rating of food trucks.
			Display the highest-rated food truck.
			Quit the program.
		 * After choosing a menu item, the user sees the menu again 
		 * and can choose another item until the choose to quit.
		 */
				
		
		boolean exit = true;
		
		while(exit) {
			//Menu
			System.out.println();
			System.out.println("Select a number from the menu: ");
			System.out.println();
			System.out.println("|--------------------------------------------|");
			System.out.println("| 1) List all existing food trucks.          |");
			System.out.println("| 2) See the average rating of food trucks.  |");
			System.out.println("| 3) Display the highest-rated food truck.   |");
			System.out.println("| 4) Quit the program.                       |");
			System.out.println("|--------------------------------------------|");
		
			int userInput = kb.nextInt();
			kb.nextLine();
		
			switch(userInput) {
		
				//Display truck info
				case 1: for (FoodTruck foodTruck : allTrucks) {
							if(foodTruck.getTruckName() != null) {
								
								System.out.println(foodTruck.toString());

							}
							else {
								break;
							}
						}
						break;
				
				//Display avg rating
				case 2:	int result = 0; 
						int count = 0;
						for (FoodTruck foodTruck : allTrucks) {
							if(foodTruck.getRating() != 0) {
								result += foodTruck.getRating();
								count++;
							}
						
						}
						System.out.println("The average rating is of food trucks is: " + ((double)result/(double)count));
						break;

				//get high score		
				//TODO display multiple tied high scores
				case 3: FoodTruck highRated = new FoodTruck();
						highRated = allTrucks[0];
						int high =0;
						for (FoodTruck foodTruck : allTrucks) {
							if(foodTruck.getRating() > high) {
								high = foodTruck.getRating();
								highRated = foodTruck;
							}
						}
						System.out.println(highRated);
						break;
				
				// exit
				case 4: System.out.println("Goodbye");
						exit = false;
						break;
			}
		}
	}
}


	

	







