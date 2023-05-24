/*

MIS350 
HW1 Part B1
8/30/22

Harshil Saini
This program calculates the sum, average, and product 
of three user-input integers 

HW2 requires that we add min and max calculations

*/

//Program uses class scanner 
import java.util.Scanner; 

public class Arithmetic {
   public static void main(String[] args) {
      //Creates a scanner object
      Scanner input = new Scanner(System.in);
      
      //Declare variables 
      int num1;
      int num2; 
      int num3;
      int min;
      int max;
      int sum; 
      double average;
      int product; 

      //Asks for user input 
      System.out.print("Enter First Integer: ");
      num1 = input.nextInt();
        
      System.out.print("Enter Second Integer: ");
      num2 = input.nextInt();
        
      System.out.print("Enter Third Integer: ");
      num3 = input.nextInt();
        
      //Calculate values   
      sum = num1 + num2 + num3;
      average = sum / 3.0;
      product = num1 * num2 * num3;
      
      //Max Calculation
      if (num1>num2 && num1>num3)
         
         max = num1;
         
         else if (num2>num3 && num2>num3)
         
         max = num2;
         
         else
         
         max = num3;
         
      //Min Calculation
      if (num1<num2 && num1<num3)
      
         min = num1;
         
         else if (num2<num1 && num2<num3)
         
         min = num2;
         
         else    
         
         min = num3;

      //Display results 
      System.out.println("The sum is " + sum);
      System.out.println("The average is " + average);
      System.out.println("The product is " + product);
      System.out.println("The minimum is " + min);
      System.out.println("The maximum is " + max);
   }
}