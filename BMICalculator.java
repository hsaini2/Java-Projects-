/* 
MIS 350
HW8
Harshil Saini
10/18/22
This program calculate BMI value based on the user input weight and height
*/
import java.util.Scanner; 

public class BMICalculator {
   // main method
   public static void main (String [] args) {
      Scanner input = new Scanner(System.in); 
      
      // Prompt to user and take input of height and weight
      System.out.print("Please enter your height in inches: ");
      double height = input.nextDouble(); 
      
      System.out.print("Please enter your weight in lbs: ");
      double weight = input.nextDouble();
      
      double hMeters = inch2MT(height);
      double wKGs = lb2KG(weight);
      
      // Call the BMI calculation method
      double val = BMIVal(hMeters,wKGs);

      // Call the result printing method
      valueDisplay(val);
      
   }
   
   // Height convert method
   public static double inch2MT (double hInch) {
      double hMeter = hInch * 0.0254; 
      return hMeter; 
   
   }

   // Weight convert method
   public static double lb2KG (double wLB) {
      double wKG = wLB * 0.454; 
      return wKG; 
   
   }

   /* 1. Write the BMI calculation method. Use user input weight and height 
      as parameters, and return the BMI value back
   */
   public static double BMIVal (double hMeter, double wKG) {
      double BMI = wKG / (hMeter * hMeter);
      return BMI;
   
   }
     
   /* 2. Write the result display method. Use bmi value as parameter,
      and display the assessment result and suggestions. 
   */
   public static void valueDisplay (double BMI) {
      System.out.println("Your BMI value is: " + BMI);
      if (BMI >= 30) {
         System.out.println("You are obese. See a doctor!");
      }
         else if (BMI >= 25) {
            System.out.println("You are overweight. Go exercise and watch what you eat!");
         }
               else if (BMI >= 18.5) {
                  System.out.println("Keep it up");
               }
                     else 
                        System.out.println("Eat more and gain some weight!");
   }

}