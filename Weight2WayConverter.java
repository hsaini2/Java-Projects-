/*
MIS350 
HW7 Q2
10/11
Harshil Saini
Converts Kg to Lbs and vice versa 
*/

import java.util.Scanner;

public class Weight2WayConverter {
     //Main method 
     public static void main(String[] args) { 
         Scanner input = new Scanner(System.in); 
      
         //Ask for user input 
         System.out.println("Enter weight unit LB or KG (Please use capital letters): "); 
            String weightUnit = input.nextLine();
         System.out.println("Enter weight number: "); 
            double weightNum = input.nextDouble(); 
               
         if (weightUnit.equals("LB")) {
            System.out.printf("Our weight in kilograms is %.2f kg(s)", toKilos(weightNum)); 
         }
      
         else if (weightUnit.equals("KG")) {
            System.out.printf("Our weight in pounds is %.2f lb(s)", toPounds(weightNum));
         }
      
         else {
            System.out.println("Invalid weight unit");
         }
     }
      
      //Method to LBS
      public static double toPounds(double kg)  {
         double lbs = kg * 2.205; 
         return lbs;
      }

      //Method to KG
      public static double toKilos(double lbs)  {
         double kg = lbs * 0.454;
         return kg;
      }
}      


 
   
  