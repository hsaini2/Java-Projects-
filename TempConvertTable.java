//Program that prints a temperature converting table linked with file "UnitConversion.java"
public class TempConvertTable {
  //main method to print the table
  public static void main(String[] args) {
    // Print the table header line
    System.out.println("Cels.\t\tFahr.\t\t|\t\tFahr.\t\tCels.");
    
    //print the separating line
    System.out.println("----------------------------------------");   
        
    //Print the table rows
    //double c = 40.0, f = 120.0;
    for(double c = 40.0, f = 120.0; c >= 31; c--, f -= 10) {
    System.out.printf("%5.1f\t\t%5.1f\t\t|\t\t%5.1f\t\t%5.1f\n", c, UnitConversion.tempC2F(c), f, UnitConversion.tempC2F(f));
    }
    
  }
  
}
