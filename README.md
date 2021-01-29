# Food Truck

## Description
Users will input and rate a list of food trucks, then view the average rating and the highest-rated truck.

## Structure
Define a FoodTruck class with fields for a unique numeric id, a name ("TacoRific", "Mediterranean Medic", etc.), food type ("Tacos", "Falafel", etc.), and a numeric rating.

Create a separate class with a main method that starts the program. It will have an array to store up to five FoodTruck objects. The main method of this class is the only static method in the entire project.

## Topics and Technologies Used

  * Java 1.8

  * Multiple classes

  * toString

  * Math.random()

  * Experimented with

      * for each loops

## How to Run
Run FoodTruckApp.java, you will be prompt to enter a truck name, then type of
food, then the rating for this trucks food. Then you will be prompt to enter either another name or to quit entering names. Once you complete entering names you will be prompted with a menu to select a number. 1. List all existing food trucks. 2. See the average rating of food trucks. 3. Display the highest-rated food truck. 4 Quit the program. When the number is entered the prompt will display the appropriate information about the food trucks. After quitting the program the prompt will say good bye.

## Lessons Learned

### Issue:
I struggled with setting up the truck ID and looping to check if it was a duplicate. I did get a working solution.  As I got a better and closer to a functioning copy I began to wonder if I the ID meets the "increments the static field" criteria. This will be a question I have after I get the assignment back.

### Solution:
Worked with the basics that I understood best, used a Math.random() *10000 to generate a unique number knowing that only 5 trucks would be entered.

### Issue:
Proper allocation of time. I did take the additional time to set up a decent outline of what needed to be accomplished. However I failed in setting up that outline with pseudo code and laying out how my two classes would interact. This created a lot of problem for me down the line and much confusion about what was being accessed where. This resulted in more "Hacking" than programing and lots of debugging, wasting hours (half a day or more).
### Solution:
Properly set up outline with pseudo code. Understand how everything works together before coding. Use the first principle thinking method to insure I'm breaking down new concepts to its most basic principle before trying to implement.
