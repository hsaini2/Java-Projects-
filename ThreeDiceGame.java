/*
MIS350 
HW4 Part B
9/19
Harshil Saini
This program calculates the figurative outcome if a
Dice were to roll randomly 100 times and calculates the amount
of times the outcome would be divisible by 3 
*/

import java.util.Random;

public class ThreeDiceGame {
	public static void main(String[] args) {
	    Random rand = new Random();
	    
	    //Declaring Variables 
	    int numberDivisibleThree = 0;
	    int dice1;
       int dice2;
       int dice3;
	    
	    //Creates loop for 100 attempts  	  
       for(int i = 0; i < 100; i++){
	        dice1 = rand.nextInt(6 - 1) + 1;
	        dice2 = rand.nextInt(6 - 1) + 1;
	        dice3 = rand.nextInt(6 - 1) + 1;
	        
	    //Print of each attempt
	    System.out.printf("Attempt# %d: You got %d, %d and %d\n",(i+1), dice1, dice2, dice2);
	        
	    //Calculates if dvisible by three
	    if((dice1 + dice2 + dice3) % 3 == 0)
	       numberDivisibleThree++;
	    }
	    
	    //Print number of attempts divisible by 3
		 System.out.printf("You have completed 100 attempts of dice rolling. You got %d total turns that are divisible by 3.",numberDivisibleThree);
	}
}