package com.skilldistillery.foodtruck;

public class FoodTruck {

	/* fields for a unique numeric id, a name ("TacoRific", 
	 * Mediterranean Medic", etc), food type ("Tacos", "Falafel"
	 * etc.), and numeric rating
	 */
	private String truckName;
	private String foodType;
	private int rating;
	private int truckId;
	
	void FoodTruck(String truckName, String foodType, 
					int rating) {
		//truck id  assigned
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
		truckId = (int)(Math.random() * 10000);// TODO Need to check truck ID match
		
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
	
	public int setTruckId() {
		truckId = (int)(Math.random() * 10000);
		return truckId;
	}

	@Override
	public String toString() {
		return "FoodTruck [truckName=" + truckName + ", foodType=" + foodType + ", rating=" + rating + "]";
	}
	
}
