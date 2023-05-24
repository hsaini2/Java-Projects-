/*

MIS350 
HW3 Part B1
9/13
Harshil Saini
This program creates a credit assessment for the bank issuing mortgages. 

*/

//Program uses class scanner
import java.util.Scanner;

public class Mortgage {
   // Main method begins execution of Java application
   public static void main(String[] args) {
      
      //Create a scanner object
      Scanner input = new Scanner(System.in);      
      
      //Take user input and creates variables 
      double interest;
      
      System.out.println("Enter your credit score from Experian:");
      double ExperianCheck = input.nextDouble();

      System.out.println("Enter your credit score from Equifax:");
      double EquifaxCheck = input.nextDouble();

      System.out.println("Enter your credit score from TransUnion:");
      double TransUnionCheck = input.nextDouble();

      //Calculates average score 
      double average = (TransUnionCheck + EquifaxCheck + ExperianCheck) / 3;

      //Determines rate with IF statement
      if( average >= 740 && average <= 850) {

         interest = 2.75;
         System.out.println("Your average credit score is: " + average);
         System.out.println("You are eligible for a mortgage at the interest rate of : " + interest + "%");

}

      //Credit score range from 739-670
      else if( average >= 670 && average <= 739) {

         interest = 3.15;
         System.out.println("Your average credit score is: " + average);
         System.out.println("You are eligible for a mortgage at the interest rate of : " + interest + "%");

}

      //Credit score range from 669-580
      else if( average >= 580 && average <= 669) {

          interest = 3.50;
          System.out.println("Your average credit score is: " + average);
          System.out.println("You are eligible for a mortgage at the interest rate of : " + interest + "%");

}

      //Credit score below 580
      else {
   
          System.out.println(average);
          System.out.println("You are not eligible for a mortgage with your current credit score.");

      }

   }

}