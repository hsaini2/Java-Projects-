/* 
MIS 350
HW8
Harshil Saini
10/18/22
This program converts US currency to 5 other currencies (attached to CurrencyConversionTable.java)
*/

import java.util.Scanner; 

public class CurrencyConversion {
  public static double dollar;
  
  public static double dollar2Cny(double CNY) {
      return CNY * 7.183;
  }

  public static double dollar2Euro(double EURO) {
      return EURO * 1.028;
  }
  
  public static double dollar2Bp(double BP){
      return BP * 0.894;
  }
  
  public static double dollar2Cnd(double CND){
      return CND * 1.389; 
  }  
  public static double dollar2Jpy(double JPY){
      return JPY * 148.778; 
  }
}