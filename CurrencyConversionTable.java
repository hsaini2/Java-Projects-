/* 
MIS 350
HW8
Harshil Saini
10/18/22
This program converts US currency to 5 other currencies (attached to CurrencyConversion.java) 
*/

import java.util.Scanner; 

public class CurrencyConversionTable {
   // main method
   public static void main (String [] args) {
   
   //Table header
   System.out.println("|\tUSD\t||\t\tCNY\t|\tEUR\t|\tBPD\t|\tCND\t|\t\tJPY\t|");
   
   //print the separating line
   System.out.println("-------------------------------------------------------------");
   
   //Print the table rows
   for(double dollar = 100.0, f = 120.0; dollar <= 500; dollar+=50, f -= 10) {
      System.out.printf("%5.2f\t||%5.3f\t|%5.2f\t|%5.2f\t|%5.2f\t|%5.2f\t\n", dollar, CurrencyConversion.dollar2Cny(dollar), CurrencyConversion.dollar2Euro(dollar), CurrencyConversion.dollar2Bp(dollar), CurrencyConversion.dollar2Cnd(dollar), CurrencyConversion.dollar2Jpy(dollar));
   }
   
   }

}