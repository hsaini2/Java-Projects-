/* 
   International Love
   Harshil Saini 
   
   This project is a simple online clothing store I had created with three major functions. First, the user is promoted to pick their products along 
   with the number of each product. Then they are asked if they are eligible for a military or senior discount. Lastly, If the consumer is from another 
   country, they are asked if they would like to convert their currency to USD. 
   
   Download Container Class "CurrencyConversionFP.java"
     
*/

import java.util.Scanner; 

public class InternationalLove{
   // Main method for ordering process 
   public static void main (String [] args) {   
      Scanner input = new Scanner(System.in);
      //Declaring and initializing variables
      int selection;
      int dSelect;
      int cSelect;
      
      // Welcome message
      System.out.println("Welcome to our stylish clothing store International Love!");
      System.out.println();
      // Create a String array for product
      String [] product = {"Jeans", "T-Shirt", "Sweater"};
      // Create a int array for quantity
      int [] qty = new int [3]; 
      // Create a double array for unit price
      double [] unitPrice = {23.50, 15.25, 20.25};
      
      // Prompt customer to enter selection
      do {
         System.out.print("Please select the products you wish to purchase.\nEnter (1) for a pair of Jeans($23.50)\nEnter (2) for a T-Shirt($15.25)\nEnter (3) for a Sweater($20.25)\nOr if you're done shopping enter (4)\nYour selection: ");
         selection = input.nextInt();
         switch (selection){   
              case 1: 
                  System.out.print("Please enter the number of jeans you would like to purchase: ");
                  qty[0] += input.nextInt();
                  System.out.println();
                  break;
              case 2: 
                  System.out.print("Please enter the number of T-Shirts you would like to purchase: ");
                  qty[1] += input.nextInt();
                  System.out.println();
                  break;
              case 3:
                  System.out.print("Please enter the number of Sweaters you would like to purchase: ");
                  qty[2] += input.nextInt();
                  System.out.println();
                  break;
              case 4:
                  System.out.println("You have finished adding to your cart.");
                  System.out.println();
                  break;
              default: System.out.println("Invalid selection. Try again!"); 
                   System.out.println();
         }
      } while (selection != 4);
      
      //Displaying shopping cart w/ usd total
         System.out.println();
         System.out.println("Thank you for shopping at International Love! Here is your shopping cart:\n");
         System.out.println("|\t\tProduct\t\t|\t Qty\t|\tUnit Price\t|");
         System.out.println("-------------------------------------------");
         // Shopping cart record
         for (int i = 0; i < product.length; i++){
            System.out.printf("|\t\t%-7s\t\t|\t%3d\t|\t\t%5.2f\t\t|\n", product[i], qty[i], unitPrice[i]);
         }
         // Call the USD total method
         System.out.println("-------------------------------------------");
         System.out.printf("|\t\tUSD Total:\t\t\t\t|\t\t%7.2f\t|\n", usdTotal(qty, unitPrice));
        
      // Asking customer if they would like a discount and apply discount if customer selects it
      System.out.println();
      double cost = usdTotal(qty, unitPrice);
       
      do {
         System.out.print("Would you like discount?\nEnter (1) for Yes or (2) for No: ");
         dSelect = input.nextInt();
         switch (dSelect) {
            case 1: cost = totalDiscount(usdTotal(qty, unitPrice)) ;break;
            case 2: System.out.println("You have selected not to get a discount.");break;
            default: System.out.println("Invalid selection. Please try again.");
               System.out.println();
         }
      } while (dSelect > 2);
        
      // Ask user if they would like to convert and display total
      System.out.println();
      do {
         System.out.print("We can convert your USD total to PND, CND, or YEN. Would you like to convert to one of these currencies?\nEnter (1) for Yes or (2) for No: ");
         cSelect = input.nextInt();
         System.out.println();
         switch(cSelect){
            case 1:  cost = totalConvert(cost); break;
            case 2:; System.out.printf("Your total is $%.2f dollars. Thank you for shopping at International Love!", cost); break;
            default: System.out.println("Invalid selection. Please try again.");
         }
      } while (cSelect > 2);      
    } 
       
      // USD total calc method
      public static double usdTotal(int [] qty, double [] unitP){
         double total = 0;
         for (int i = 0; i < unitP.length; i++){
            total += qty[i] * unitP[i];  
         } 
          return total;
      }   

   
   // Method to apply military or senior citizen discount 
   public static double totalDiscount(double usdTotal) {
       Scanner input = new Scanner(System.in);
         //military discount
         System.out.print("Would you like a military or senior discount? Enter (1) for military or (2) for senior: ");
         int d1 = input.nextInt();
	    
         if (d1 == 1) {
            System.out.print("Are you currently or have you ever been in the military? Enter (1) for Yes or (2) for No: ");
               int d2 = input.nextInt();
            
            if (d2 == 1) {
               System.out.println("Your military discount as been applied!");
               return usdTotal * 0.90; //10% discount for millitary
            }
               else {
                     System.out.println("Sorry! You are not eligible for our military discount."); 
                     return usdTotal;            
               }  
         }
         
            
         // senior discount
         else if (d1 == 2) {
            System.out.print("Are you age 65 or older? Enter (1) for Yes or (2) for No: ");
            int d3 = input.nextInt();
                        
            if (d3 == 1) {
               System.out.println("Your senior citizens discount has been applied!");
               return usdTotal * 0.92;//8% discount for senior citizens
            }
               else {
                     System.out.println("Sorry! You are not eligible for our senior discount.");
                     return usdTotal;
                  }
         }
          
         else if (d1 > 2) {
             System.out.println("Invaild selection. Try again!");
         } 
         return usdTotal; 
                                               
   }
  
   
   // Method to convert total checkout amount to their preferred currency 
   public static double totalConvert(double total) {
      Scanner input = new Scanner(System.in);
      
      //Declare variables
      int currencyUnit;
      
      //Prompt user to select one of the currencies and convert usd total to the selected currency
      do {
         System.out.print("Please choose what currency you like to convert to (1)PND, (2)CND, or (3)YEN: ");
         currencyUnit = input.nextInt();
         switch(currencyUnit){
            case 1: System.out.printf("Your total is %.2f pounds. Thank you for shopping at International Love!", CurrencyConversionFP.USD2BP(total));
                    ;break;
            case 2: System.out.printf("Your total is %.2f canadian dollars. Thank you for shopping at International Love!", CurrencyConversionFP.USD2CD(total));
                    ;break;
            case 3: System.out.printf("Your total is %.2f japanese yen. Thank you for shopping at International Love!", CurrencyConversionFP.USD2YEN(total));
                    ;break;
            default: 
                  System.out.println("Invalid currency unit. Please choose from the currencies given.");
         }
      } while (currencyUnit > 3); 
      return -1;  
   }
}
                   
                 