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
		
		String tkName, food; 
		int rating; 
		
		for(int i = 0; i < allTrucks.length; i++) {
			System.out.println("Enter food truck name or quit if finished entering trucks: ");
			tkName = kb.next();
			
			if(tkName.equals("Quit") || tkName.equals("quit")) {
				break;
			}
			System.out.println("Enter type of food for truck: ");
			food = kb.next();
			System.out.println("Enter the food truck rating: ");
			rating = kb.nextInt();
			
			
			allTrucks[i].setTruckName(tkName);
			allTrucks[i].setFoodType(food);
			allTrucks[i].setRating(rating);
			allTrucks[i].setTruckId((int)(Math.random() * 10000));
			allTrucks[i].getTruckId();		
	
			

			System.out.println(allTrucks[i].getTruckId());
			System.out.println(allTrucks.toString());
			//Check for duplicate id
//			for (int n = 0; n < allTrucks.length; n++) {
//				
//				if ( truckId == allTrucks[n].getTruckId()) {
//					truckId = allTrucks[i].setTruckId();
//				}
//			}

		}
		
		boolean exit = true;
		
		while(exit) {
			
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
		
				case 1: System.out.println(tk.getAllFoodTrucks(allTrucks));
						break;
				case 2:	int result = 0; 
						int count = 0;
						for (FoodTruck foodTruck : allTrucks) {
							if(foodTruck.getRating() != 0) {
								result += foodTruck.getRating();
								count++;
							}
						
						}
						System.out.println("The average rating is of food trucks is: " + (result/count));
						break;
				case 3: FoodTruck highRated = new FoodTruck();
						//TODO fix length of 2
						highRated = allTrucks[0];
						int high = allTrucks[0].getRating();
						for (int i =0; i< 2; i++) {
							if (allTrucks[i+1].getRating() != 0 && allTrucks[i+1].getRating() > high ) {
								high = allTrucks[i+1].getRating();
								highRated = allTrucks[i+1];
							}
						}
						System.out.println(highRated);
						break;
				case 4: System.out.println("Goodbye");
						exit = false;
						break;
			}
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
	 */
	
	/*
	 * If the user inputs quit for the food truck name, input 
	 * ends immediately and the program continues.
	 */
	

	

	
	/*
	 * user prompt to input name, food type, and rating
	 * for up to five food trucks. For each set of input
	 * a FoodTruck object is created, its fields set the 
	 * user's input, and it is added to the array
	 * *** Truck id is NOT input by the user, but
	 * assigned automatically in the FoodTruck constructor
	 * 
	 */




	
	/*
	 * After choosing a menu item, the user sees the menu again 
	 * and can choose another item until the choose to quit.
	 */
			

