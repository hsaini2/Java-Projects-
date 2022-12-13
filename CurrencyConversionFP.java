/* Currency Conversion
   Harshil Saini
   
   This container class has the different currency conversion
   methods.
   
   Main Program "InternationalLove.java"
   
*/
public class CurrencyConversionFP {
  //convert to japanese yen (YEN) method
  public static double USD2YEN (double total) {
    return total * 148.07;
  }
  //convert to British Pound (PND) method
  public static double USD2BP(double total){
    return total * 0.87;
  }
  //convert to canadian dollar (CND) method
  public static double USD2CD(double total){
    return total * 1.36; 
  }
  
}