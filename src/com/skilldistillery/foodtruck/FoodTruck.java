package com.skilldistillery.foodtruck;

public class FoodTruck {

	/* fields for a unique numeric id, a name ("TacoRific", 
	 * Mediterranean Medic", etc), food type ("Tacos", "Falafel"
	 * etc.), and numeric rating
	 */
	private String truckName;
	private String foodType;
	private int rating;
	private int truckId; //=(int)(Math.random() * 10000);
	
	void FoodTruck(String truckName, String foodType, 
					int rating, int truckId) {
		//truck id  assigned
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
		this.truckId =truckId;
		
	}
	void FoodTruck () {
		
	}

	/**
	 * @return the truckName
	 */
	public String getTruckName() {
		return truckName;
	}

	/**
	 * @param truckName the truckName to set
	 */
	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	/**
	 * @return the foodType
	 */
	public String getFoodType() {
		return foodType;
	}

	/**
	 * @param foodType the foodType to set
	 */
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}


	public int getTruckId() {
		return truckId;
	}
	public void setTruckId(int truckId) {
		this.truckId = truckId;
	}
	public String getAllFoodTrucks(FoodTruck [] allTrucks) {
		String result = "";
		for (int i = 0; i < allTrucks.length; i++) {
			result = allTrucks[i].getTruckName() + allTrucks[i].getFoodType() 
					+ allTrucks[i].getRating() + allTrucks[i].getTruckId() 
					+ "\n\n";
					
		}
		
		return result;
	}

	@Override
	public String toString() {
		return "FoodTruck [truckName=" + truckName + ", foodType=" + foodType + ", rating=" + rating + "]";
	}
	
}
